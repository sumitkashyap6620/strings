import java.util.*;
public class fraction{
    public static void addfraction(Fraction f1 , Fraction f2){
       f1.num = f1.num * f2.num ;
       f1.den = f1.den * f2.den ;
       f1.simplify(f1);
    }
    public static class Fraction{
        int num ;
        int den ;
      
       public static void simplify(Fraction f){
           int min = Math.min(f.num, f.den);
           int gcd = 1 ;
           for (int i = min ; i >1 ; i--){
            if(f.num % i == 0 && f.den % i == 0 ){
                 gcd = i ;
                 break ;   
            }
           }
           f.num /= gcd ;
           f.den /= gcd ;
       }

    public Fraction(){}

     public Fraction(int num , int den){
        this.num = num ;
       this.den = den ;
       simplify(this);
     }
    }
    public static void main(String args[]){
       Fraction f1 = new Fraction(6,30);
       Fraction f2 = new Fraction(35,21);
    //    f1.simplify(f1);

      addfraction(f1, f2);
       System.out.println(f1.num +"/"+f1.den);
    }
}