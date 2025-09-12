public class solution{
 public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder(s); 
        for(int i = 0 ; i < sb.length() ; i++){
            int x = (int)sb.charAt(i);
            if(x <= 90){
                x += 32 ; 
                char c = (char) x ;
                 sb.setCharAt(i,c);
            }
        }int i = 0 ;
         if(i==0 || sb.charAt(i-1) == ' '){
               int x = 32 ;
                sb.setCharAt(i,(char)x);
            } 
        s = sb.toString() ;
      return s ;
    }
    public static void main(String[] args) { 
   
}}