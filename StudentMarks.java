import java.util.Scanner;
class Student
{
    int rollno;
    String name;
    int marks;
    //constructor
    Student(int rollno, String name, int marks)
    {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
}

public class StudentMarks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[10];
        int total=0;
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter details for student "+(i+1));
            System.out.println("Enter roll no of the student: ");
            int rollno = sc.nextInt();		
	    System.out.println("Enter the name of the student : ");
            String name = sc.next();
	    System.out.println("Enter the marks of the student : ");
	    int marks = sc.nextInt();
	    students[i] = new Student(rollno , name , marks);
	    total += marks;
       }
       System.out.println("Cummulative marks of all students is "+total);
       sc.close();
   }
}