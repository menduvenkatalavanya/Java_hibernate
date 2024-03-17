package com.techpalle.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
	@Id
	private int eno;
	private String ename;
	private String esal;
	private String edesignation;
	
	public Emp() {}
	public Emp(int eno, String ename, String esal, String edesignation) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
		this.edesignation = edesignation;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEsal() {
		return esal;
	}
	public void setEsal(String esal) {
		this.esal = esal;
	}
	public String getEdesignation() {
		return edesignation;
	}
	public void setEdesignation(String edesignation) {
		this.edesignation = edesignation;
	}
	

}
