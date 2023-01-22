package com.daytwojava;

import java.util.Objects;

public class Employee {
	int eId;
	String name;
	double salary;
	public Employee() {
		System.out.println("Non-Parametrized OCnstructor");
	}
	public Employee(int eId,String name,double salary) {
		System.out.println("Parametrized OCnstructor");
		this.eId=eId;
		this.name=name;
		this.salary=salary;
	}
 	public void setData(int eId,String name,double salary) {
 		
		this.eId=eId;
		this.name=name;
		this.salary=salary;
	}
	public void display() {
		System.out.println(eId+" "+name+" "+salary);
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {//Return the string representation of your object
		// Do not need to invoke this method when calling the obj of the class
		//If you try to print obj without this method its will give location of the class object
		return eId+" "+name+" "+salary;
	}
	@Override
	public int hashCode() {
		System.out.println("In hashcode");
		return eId;
		//return Objects.hash(eId, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return eId == other.eId && Objects.equals(name, other.name) && Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	
}
	