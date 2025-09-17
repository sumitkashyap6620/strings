public class Student {
    public String name ;
    private int roll = 12;
    int enrol ;
    int sr ;
    double percent ;

    // Static keyword

   private static int numberofstudent; // it create common block for all objects and it can be access bye class name also after static 
    
    // final keyword ]

    final String schoolname = "VPS" ; // it can never change by anything like setor etc

    // Constructor 

     public Student(){} // default constructor 

     public Student(int roll ,String name){
        this.roll = roll ;
        this.name = name ;
        numberofstudent++ ;
     }

    // getter function 

    public static int getnumberofstudents(){
        return numberofstudent;
    }


    public  int getroll(){
        return roll ;
    }
    
    // setter function 

    public void setroll(int roll){
   this.roll = roll ;
    }
   //  public void setroll(String sn){
//    schoolname = sn ;
//     }
}