package p1;

import java.util.HashSet;
import java.util.Set;

class Employee
{
	private String name;
	private int id;
	private double salary;
	private String department;

	public Employee(String name,int id,double salary,String department)
	{
		this.name = name;
		this.id = id;
		this.salary=salary;
		this.department=department;
	}

	@Override
	public String toString()
	{
		return "{" +
				"name=" + name +", id=" + id+ ", salary="+salary+", Department="+department+'}';
	}
}

class Main
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee("ram", 10, 2000,"HR");
		Employee e2 = new Employee("sita", 20, 3000,"BU");

		Set<Employee> employees = new HashSet<>();
		employees.add(e1);
		employees.add(e2);

		System.out.println(employees);
	}
}
	
	


