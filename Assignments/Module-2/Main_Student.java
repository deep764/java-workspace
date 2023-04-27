package Module_2;

class AgeNotWithinRangeException extends Exception 
{
    public AgeNotWithinRangeException(String message) 
    {
        super(message);
    }
}

class NameNotValidException extends Exception 
{
    public NameNotValidException(String message) 
    {
        super(message);
    }
}

class Student 
{
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) 
        {
            throw new AgeNotWithinRangeException("Age is not within range of 15 to 21");
        }
        if (!name.matches("^[a-zA-Z\\s]+$")) 
        {
            throw new NameNotValidException("Name contains invalid characters");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class Main_Student 
{
	 public static void main(String[] args) throws Exception 
	 {
	        try 
	        {
	            Student student1 = new Student(1, "John Doe", 20, "Computer Science");
	            student1.display();

	            Student student2 = new Student(2, "Jane 123", 18, "Electronics");
	            student2.display(); // throws NameNotValidException

	            Student student3 = new Student(3, "Bob Smith", 25, "Mechanical");
	            student3.display(); // throws AgeNotWithinRangeException
	        } 
	        catch (Exception e) 
	        {
	            System.out.println("Exception: " + e.getMessage());
	        }
	    }
}
