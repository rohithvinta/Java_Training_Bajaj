package daytwojava;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.setData(101, "Asha",35000);
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.setData(102, "Disha",30000);
		emp2.display();
		
		emp2.setName("Edisha");;
		emp2.setSalary(7500);
		emp2.display();
		
		System.out.println(emp1.getName());
		System.out.println(emp2.getName());
		
		System.out.println(emp1);
		System.out.println(emp2);
	}
}