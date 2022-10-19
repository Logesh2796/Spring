package com.employee.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.demo.entity.EmployeeEntity;
import com.employee.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService es;
	@PostMapping(value="/add")
	public String addInfo(@RequestBody EmployeeEntity ee) {
		return es.addInfo(ee);	
	}
	@PutMapping(value="/update")
	public String updateInfo(@RequestBody EmployeeEntity ee) {
		return es.updateInfo(ee);
	}
	@DeleteMapping(value="/delete/{id}")
	public String deleteInfo(@PathVariable int id) {
		return es.deleteInfo(id);
	}
	@GetMapping(value="/show")
	public List<EmployeeEntity> getInfo() {
		return es.getInfo();
	}
	@PostMapping(value="/list")
	public String bulkList(@RequestBody List<EmployeeEntity> ee){
		return es.bulkList(ee);
	}
	@GetMapping(value="/one/{id}")
	public EmployeeEntity soloId(@PathVariable int id) {
		return es.soloId(id);
	}
	
	@DeleteMapping(value="/erase")
	public String erase(@RequestBody EmployeeEntity ee) {
		return es.erase(ee);
	}
	@GetMapping(value="/findsalary/{from}/{to}")
	public List<EmployeeEntity>get(@PathVariable("from") int salary1,@PathVariable("to") int salary2){
		return es.get(salary1,salary2);
	}
	@GetMapping(value="/hike")
	public List<EmployeeEntity> getInf(){
		return es.getInf();
	}
	@DeleteMapping(value="/del/{from}/{to}")
	public String getDelete(@PathVariable("from")int id1, @PathVariable("to") int id2) {
		return es.getDelete(id1,id2);
	}

}
