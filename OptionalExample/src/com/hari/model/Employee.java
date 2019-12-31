package com.hari.model;

import java.util.List;
import java.util.Optional;

public class Employee {
	private int id;
	private String name;
	private int deptNo;
	private String gender;
	private Double salInLaks;
	private List<String> knownTechs;
	private Optional<Bike> optionaBike = Optional.empty();

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

	public List<String> getKnownTechs() {
		return knownTechs;
	}

	public void setKnownTechs(List<String> knownTechs) {
		this.knownTechs = knownTechs;
	}

	public void setOptionalBike(Optional<Bike> bike) {
		optionaBike = bike;
	}

	public Optional<Bike> getOptionaBike() {
		return optionaBike;
	}

	public Employee(int id, String name, int deptNo, String gender, Double salInLaks, List<String> knownTechs) {
		super();
		this.id = id;
		this.name = name;
		this.deptNo = deptNo;
		this.gender = gender;
		this.salInLaks = salInLaks;
		this.knownTechs = knownTechs;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptNo=" + deptNo + ", gender=" + gender + ", salInLaks="
				+ salInLaks + ", knownTechs=" + knownTechs + ", optionaBike=" + optionaBike + "]";
	}

}
