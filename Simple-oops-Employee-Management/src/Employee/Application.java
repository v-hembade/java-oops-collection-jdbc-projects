package Employee;
import java.io.*;
import java.util.*;
public class Application {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee("raj",25000,"IT"));
		list.add(new Employee("john",30000,"HR"));
		int choice,Salary,emp;
		String Ename,dep;
		boolean found;
		do
		{
			System.out.println("---------Welcome TO Employee Management System----------");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			System.out.println("3. Update Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. View All Employee");
			System.out.println("6. Exit");
			System.out.println("Enter Your Choice");
			choice = input.nextInt();
			switch(choice)
			{
				case 1 :
					System.out.println("Enter Employee Name:");
					Ename = input.next();
					System.out.println("Enter Salary:");
					Salary = input.nextInt();
					System.out.println("Enter Department");
					dep = input.next();
					list.add(new Employee(Ename,Salary,dep));
					System.out.println("Employee added Successfully!-----");
					break;
				case 2:
					found=false;
					System.out.println("Enter Emp ID");
					emp = input.nextInt();
					for(Employee e: list)
					{
						if(emp==e.getEmpno())
						{
							found=true;
							System.out.println("Name:" + e.getName());
							System.out.println("Salary:" + e.getSalary());
							System.out.println("Department" + e.getDepartment());
							break;
						}
					}
					if(!found)
					{
						System.out.println("Enter Correct ID");
					}
					break;
					
				case 3:
					found=false;
					System.out.println("Enter Emp ID");
					emp = input.nextInt();
					for(Employee e: list)
					{
						if(emp==e.getEmpno())
						{
							found=true;
							System.out.println("Enter Employee Name:");
							Ename = input.next();
							System.out.println("Enter Salary:");
							Salary = input.nextInt();
							System.out.println("Enter Department");
							dep = input.next();
							e.setName(Ename);
							e.setSalary(Salary);
							e.setDepartment(dep);
							System.out.println("Employee updated Successfully");
							break;
						}
					}
					if(!found)
					{
						System.out.println("Enter Correct ID");
					}
					break;
				case 4:
					found=false;
					System.out.println("Enter Id:");
					emp = input.nextInt();
					for(Employee e: list)
					{
						if(emp==e.getEmpno())
						{
							found=true;
							list.remove(e);
							break;
						}
					}
					break;
				case 5:
					for(Employee e: list)
					{
						System.out.println("//-----------------------------------------------//");
						System.out.println("");
						System.out.println("Name:" + e.getName());
						System.out.println("Salary:" + e.getSalary());
						System.out.println("Department" + e.getDepartment());
						System.out.println("");
						System.out.println("//-----------------------------------------------//");
						System.out.println("");
					}
					break;	
				default:
					System.out.println("Invalid Choice");
					
			}
			
		}
		while(choice!=6);
		

	}

}
