import java.util.*;
public class substrings{
    public static void main (String arg[]){
       System.out.print("give any string :-");
     Scanner sc = new Scanner(System.in);
     String s = sc.next();
     System.out.println("given string is :-"+ s +"\n All substrings are :-");
     for(int i = 0 ; i < s.length() ; i++)
        for (int j = i+1 ; j <= s.length() ; j++)
        System.out.println(s.substring(i,j));
        }
}