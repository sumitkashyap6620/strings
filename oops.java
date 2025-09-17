// user define datatypes are pass by value 
public class oops{
    public static void main(String[] args) {
       // Student.numberofstudent = 100 ;
        Student s = new Student(5,"sumit");
      //  System.out.println(s.numberofstudent); // By object
       // System.out.println(Student.numberofstudent); // By class 
       System.out.println(s.getnumberofstudents());
       System.out.println(Student.getnumberofstudents());

        // s.name = "sumit kashyap";
        // s.setroll(125);
        System.out.println(s.name);
        System.out.println(s.getroll());
        Student s2 = new Student(15,"Amit");
         System.out.println(s2.name);
        System.out.println(s2.getroll());
      //   System.out.println(s2.numberofstudent); // By object
       //  System.out.println(Student.numberofstudent); // By class 
       System.out.println(s2.getnumberofstudents());
       System.out.println(s.getnumberofstudents());

    }
    
}
