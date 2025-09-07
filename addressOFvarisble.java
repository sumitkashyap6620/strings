class addressOFvariable {
    
    public static void main(String[] args) {
       String s = "sumit" ;  
        String s2 = "sumit" ;  
       s2 = "naman";
        System.out.println("Identity Hash Code of obj1: " + System.identityHashCode(s));
 System.out.println("Identity Hash Code of obj1: " + System.identityHashCode(s2));
    }
}