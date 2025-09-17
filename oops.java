// user define datatypes are pass by value 
public class oops{
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "sumit kashyap";
        s.setroll(125);
        System.out.println(s.name);
        System.out.print(s.getroll());
    }
    
}
