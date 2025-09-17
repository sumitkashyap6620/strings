public class Student {
    public String name ;
    private int roll = 12;
    int enrol ;
    int sr ;
    double percent ;
    
    // final keyword ]

    final String schoolname = "VPS" ; // it can never change by anything like setor etc

    // Constructor 

     public Student(){} // default constructor 

     public Student(int roll ,String name){
        this.roll = roll ;
        this.name = name ;
     }

    // getter function 

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