package Employee;

public class Employee 
{
	private int empno;
	private static int sempno=1000;
	private String name;
	private int salary;
	private String Department;
	public Employee(String name, int salary,String Department) {
		super();
		this.name = name;
		this.salary = salary;
		this.Department = Department;
		this.empno = sempno++;
	}
	
	public Employee()
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String Department) {
		this.Department = Department;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) 
	{
		this.empno = empno;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + ", Department=" + Department
				+ "]";
	}
}
