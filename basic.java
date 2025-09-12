import java.util.*;
public class basic{
    public static void main(String args[]){
    //  String s = "sumit" ;
    // System.out.println(s);

    // Scanner sc = new Scanner(System.in);
    //  String s = sc.nextLine();

    // System.out.println(s.charAt(4));

    // System.out.println(s.length());
   
   // System.out.println(s.contains("mit"));

   // System.out.println(s.startsWith("su"));

   // same ends with 

   //   System.out.println(s.concat(" aachaji"));

   //System.out.println(s+23+10);

  //    System.out.println(s+(23+10));

  // System.out.println(23+10+s);

    // System.out.println(s.compareTo("tumit"));

    // System.out.println(s.substring(2));

    // System.out.println(s.substring(0,4));

    // System.out.println(s.equals("sum"));

    //ystem.out.println(s.indexOf("m"));

    //System.out.println(s.indexOf("sumit"));
    // String p = "sumit" ;
    
    // s = s.substring(2);
    // s = "A"+s;
    // System.out.println(s);
    // System.out.println(p);
    System.out.println("hi");
        int[] arr = new int[5];
        arr[0] = 10 ;
        arr[1] = 100 ;
        arr[2] = 200 ;
        arr[3] = 300 ;
        arr[4] = 400 ;
    List<Integer> mylist = new ArrayList<>(arr.length) ;
    // for(int i : arr){
    //    mylist.add(i);
      
    // }
    for(int i = 0 ; i < arr.length ; i++){
      mylist.add(arr[i]);
    }

  System.out.println(mylist);
    
 }
}

  