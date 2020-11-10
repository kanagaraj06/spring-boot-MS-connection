package com.test.spc.domain;

import java.math.BigDecimal;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(schema = "mobile",name = "user_info")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer Id;

	@Column(name = "name")
	private String name;

	@Column(name = "company")
	private String company;

	@Column(name = "salary")
	private BigDecimal salary;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", company=" + company + ", salary=" + salary + "]";
	}
}
