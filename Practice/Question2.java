import java.util.ArrayList;
import java.util.List;

class Department
{
    private String departmentName;
    private String departmentChair;
    
    public Department(String departmentName, String departmentChair)
    {
        this.departmentName = departmentName;
        this.departmentChair = departmentChair;
    }
    public void addDepartment(String departmentName, String departmentChair)
    {
        this.departmentName = departmentName;
        this.departmentChair = departmentChair;
    }
    public void viewDepartment()
    {
        System.out.println("Dept name = " + departmentName);
        System.out.println("Dept chair = " + departmentChair);
    }
}
class Course
{
    private String courseNumber;
    private String courseDescription;
    private int numberOfCredits;
    private String departmentNumber;
    private List<Textbook> textbooks;
    public Course(String courseNumber, String courseDescription, int numberOfCredits, String departmentNumber)
    {
        this.courseNumber = courseNumber;
        this.courseDescription = courseDescription;
        this.numberOfCredits = numberOfCredits;
        this.departmentNumber = departmentNumber;
        this.textbooks = new ArrayList<>();
    }
    public void addCourse(String number, String description, int credits, String department) 
    {
        this.courseNumber = number;
        this.courseDescription = description;
        this.numberOfCredits = credits;
        this.departmentNumber = department;
    }
    public void changeCourse(String newDescription, int newCredits) 
    {
        this.courseDescription = newDescription;
        this.numberOfCredits = newCredits;
    }
    public void findCourse() 
    {
        System.out.println("Course Number: " + courseNumber);
        System.out.println("Course Description: " + courseDescription);
        System.out.println("Credits: " + numberOfCredits);
        System.out.println("Department Number: " + departmentNumber);
    }
    public void addTextbook(Textbook textbook) 
    {
        textbooks.add(textbook);
    }
    public void listTextbooks() 
    {
        for (Textbook textbook : textbooks) 
        {
            System.out.println(textbook);
        }
    }
}
class Textbook
{
    private String ISBN;
    private String author;
    private String title;
    private String edition;
    private String publisher;
    private boolean required;
    
    public Textbook(String ISBN, String author, String title, String edition, String publisher, boolean required) 
    {
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
        this.edition = edition;
        this.publisher = publisher;
        this.required = required;
    }
    public void addText(String title, String author, String edition, String publisher, boolean required) 
    {
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.publisher = publisher;
        this.required = required;
    }
    public void changeText(String newTitle, String newEdition) 
    {
        this.title = newTitle;
        this.edition = newEdition;
    }
    public void findText() 
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Edition: " + edition);
        System.out.println("Publisher: " + publisher);
        System.out.println("Required: " + required);
    }
    public void removeText() 
    {
        this.ISBN = "";
        this.author = "";
        this.title = "";
        this.edition = "";
        this.publisher = "";
        this.required = false;
    }
    @Override
    public String toString() 
    {
        return "Textbook[ISBN=" + ISBN + ", Author=" + author + ", Title=" + title + ", Edition=" + edition + ", Publisher=" + publisher + ", Required=" + required + "]";
    }
}
public class Question2
{
    public static void main(String[]args)
    {
        Department department = new Department("Computer Science", "Dr. Smith");
        department.viewDepartment();

        Course course = new Course("CS101", "Introduction to Programming", 3, "CS");
        course.findCourse();

        Textbook textbook1 = new Textbook("123456", "John Doe", "Java Programming", "1st", "TechBooks", true);
        Textbook textbook2 = new Textbook("789012", "Jane Doe", "Data Structures", "2nd", "TechBooks", false);

        course.addTextbook(textbook1);
        course.addTextbook(textbook2);

        System.out.println("\nTextbooks for the course:");
        course.listTextbooks();
    }
}
