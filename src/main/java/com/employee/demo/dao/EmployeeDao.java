package com.employee.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.demo.entity.EmployeeEntity;
import com.employee.demo.repo.EmployeeRepo;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepo er;
	public String addInfo(EmployeeEntity ee) {
		er.save(ee);
		return "data added to dataBase";
	}
	
	public String updateInfo(EmployeeEntity ee) {
		er.save(ee);
		return "data has been updated";
	}
	public String deleteInfo(int id) {
		er.deleteById(id);
		return "data deleted";
	}
	public List<EmployeeEntity>getInfo(){
		return er.findAll();
	}
	public String bulkList(List<EmployeeEntity> ee){
		 er.saveAll(ee);
		return "data in List";
	}
	public EmployeeEntity soloId(int id) {
	return	er.findById(id).get();
		//return "single id";
	}
	public String erase(EmployeeEntity ee) {
		er.deleteAll();
		return "Deleted";
	}
	public List<EmployeeEntity>get(int salary1, int salary2){
		return er.get(salary1,salary2);
	}
	public List<EmployeeEntity> getInf(){
		return er.findAll();
	}

	public String getDelete(int id1, int id2) {
		// TODO Auto-generated method stub
		 er.delete(id1, id2);
		 return "id delete";
	}

	

}
