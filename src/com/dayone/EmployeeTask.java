/*Create class Employee with eId , name, salary and
company as members
Accept records for Employee
1.Display records having salary_ greater than 50k
2. count total number objects*/
package com.dayone;

	import java.util.Scanner;

	class EmployeeTask {
	    int eId;
	    String name;
	    double salary;
	    String company;
	    static int count;

	    EmployeeTask(int id, String n, double s, String c) {
	        eId = id;
	        name = n;
	        salary = s;
	        company = c;
	        count++;
	    }

	    void display() {
	        System.out.println("Employee ID: " + eId);
	        System.out.println("Name: " + name);
	        System.out.println("Salary: " + salary);
	        System.out.println("Company: " + company);
	    }

	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	        EmployeeTask e1 = new EmployeeTask(sc.nextInt(),sc.next(), sc.nextInt(), sc.next());
	        EmployeeTask e2 = new EmployeeTask(sc.nextInt(),sc.next(), sc.nextInt(), sc.next());
	        EmployeeTask e3 = new EmployeeTask(sc.nextInt(),sc.next(), sc.nextInt(), sc.next());
	        sc.close();
	        System.out.println("Employees with salary greater than 50,000:");
	        if (e1.salary > 50000) e1.display();
	        if (e2.salary > 50000) e2.display();
	        if (e3.salary > 50000) e3.display();

	        System.out.println("Total number of Employee objects: " + EmployeeTask.count);
	    }
	}

