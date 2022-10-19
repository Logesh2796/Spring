package com.employee.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PutMapping;

import com.employee.demo.dao.EmployeeDao;
import com.employee.demo.entity.EmployeeEntity;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao ed;
	public String addInfo(EmployeeEntity ee) {
		return ed.addInfo(ee);
	}
	
	public String updateInfo(EmployeeEntity ee) {
		return ed.updateInfo(ee);
	}
	public String deleteInfo(int id) {
		return ed.deleteInfo(id);
	}
	public List<EmployeeEntity> getInfo(){
		return ed.getInfo();
	}
	public String bulkList(List<EmployeeEntity> ee){
		return ed.bulkList(ee);
	}
	public EmployeeEntity soloId(int id) {
		return ed.soloId(id);
	}
	public String erase(EmployeeEntity ee) {
		return ed.erase(ee);
	}
	public List<EmployeeEntity>get(int salary1,int salary2){
		return ed.get(salary1,salary2);
	}
	public List<EmployeeEntity> getInf(){
		List<EmployeeEntity> li=ed.getInf();
		for(EmployeeEntity ee: li) {
			ee.setSalary(ee.getSalary()+5000);
		}
		return li;
	}

	public String getDelete(int id1, int id2) {
		// TODO Auto-generated method stub
		return ed.getDelete(id1,id2);
	}

}
