package Module_2;

class Member 
{
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;
    
    public void printSalary() 
    {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member 
{
    String specialization;
}

class Manager extends Member 
{
    String department;
}
public class Employee_Manager_Member 
{
	 public static void main(String[] args) 
	 {
	        Employee emp = new Employee();
	        emp.name = "Harsh";
	        emp.age = 26;
	        emp.phoneNumber = "9463812593";
	        emp.address = "Savarkundla, Amreli";
	        emp.salary = 50000.0;
	        emp.specialization = "Java programing";

	        Manager mgr = new Manager();
	        mgr.name = "Alpesh";
	        mgr.age = 40;
	        mgr.phoneNumber = "0987654321";
	        mgr.address = "Near Akash vani chok, Rajkot";
	        mgr.salary = 80000.0;
	        mgr.department = "Sales";

	        System.out.println("Employee:");
	        System.out.println("Name: " + emp.name);
	        System.out.println("Age: " + emp.age);
	        System.out.println("Phone number: " + emp.phoneNumber);
	        System.out.println("Address: " + emp.address);
	        emp.printSalary();
	        System.out.println("Specialization: " + emp.specialization);

	        System.out.println();

	        System.out.println("Manager:");
	        System.out.println("Name: " + mgr.name);
	        System.out.println("Age: " + mgr.age);
	        System.out.println("Phone number: " + mgr.phoneNumber);
	        System.out.println("Address: " + mgr.address);
	        mgr.printSalary();
	        System.out.println("Department: " + mgr.department);
	    }
}