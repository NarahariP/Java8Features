package com.hari.model;

import java.util.List;

/**
 * @author Narahari
 *
 */
public class Employee {

	private int id;
	private String name;
	private int deptNo;
	private String gender;
	private Double salInLaks;
	private List<String> knowTechs;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Double getSalInLaks() {
		return salInLaks;
	}
	public void setSalInLaks(Double salInLaks) {
		this.salInLaks = salInLaks;
	}
	public List<String> getKnowTechs() {
		return knowTechs;
	}
	public void setKnowTechs(List<String> knowTech) {
		this.knowTechs = knowTech;
	}
	@Override
	public String toString() {
		return "Employee [id="+id +", name=" + name + ", deptNo=" + deptNo + ", gender=" + gender + ", salInLaks=" + salInLaks
				+ ", knowTechs=" + knowTechs + "]";
	}
	public Employee(int id, String name, int deptNo, String gender, Double salInLaks, List<String> knowTechs) {
		this.id = id;
		this.name = name;
		this.deptNo = deptNo;
		this.gender = gender;
		this.salInLaks = salInLaks;
		this.knowTechs = knowTechs;
	}
	public Employee() {
		super();
	}
	
	public Employee(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
