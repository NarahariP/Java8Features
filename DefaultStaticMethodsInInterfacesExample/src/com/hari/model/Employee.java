package com.hari.model;

public class Employee {

	private int id;
	private String name;
	private int deptNo;
	private Double salary;

	public Employee() {
		super();
	}

	public Employee(int id, String name, int deptNo, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.deptNo = deptNo;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptNo=" + deptNo + ", salary=" + salary + "]";
	}

}
