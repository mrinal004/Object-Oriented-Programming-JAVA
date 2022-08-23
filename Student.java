import java.util.Arrays;

public class Student
{
    // a class named CreateStudent which is a template has been created
    // we define some properties to it

   

    public static void main(String[] args) {
        // create an object of the class CreateStudent
        CreateStudent firstStudent = new CreateStudent();
        firstStudent.rollNumber = 10;
        firstStudent.name = "Mrinal Mohan";
        firstStudent.marks = 100;

        System.out.println(firstStudent);
    }
}
class CreateStudent
{
    int rollNumber;
    String name;
    float marks;
}