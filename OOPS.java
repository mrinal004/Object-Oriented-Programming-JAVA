public class OOPS {
    static void swap(int a,int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        // using class to create an object
        Student firstStudent = new Student("Mrinal Mohan",90.0f,32);

        // System.out.println(firstStudent.name);
        // System.out.println(firstStudent.marks);
        // System.out.println(firstStudent.rollno);

        int a = 10;
        int b = 20;
        System.out.println(a+" "+b);

       swap(a,b);

        System.out.println(a+" "+b);

    }
}
// create a class Student
class Student{
    String name;
    float marks;
    int rollno;

   public Student(String name,float marks,int rollno)
   {
        this.name = name;
        this.marks = marks;
        this.rollno = rollno;
   }

   
}
