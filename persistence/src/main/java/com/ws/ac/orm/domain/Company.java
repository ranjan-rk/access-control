package com.ws.ac.orm.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {
	@Id
	private Integer compId;
	private String compName;
	private String compDescription;

	@OneToMany(mappedBy = "company")
	private List<Employee> employees;

	public Integer getCompId() {
		return compId;
	}

	public void setCompId(Integer compId) {
		this.compId = compId;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getCompDescription() {
		return compDescription;
	}

	public void setCompDescription(String compDescription) {
		this.compDescription = compDescription;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
