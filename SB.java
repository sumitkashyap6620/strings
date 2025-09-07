public class SB{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("SUMIT KASTYAP");
        sb.setCharAt(9 , 'H');
        sb.append(" "+9);
        sb.append(9.9321521);
        sb.append( "  "  +"sum");
        sb.insert(4,4);
        sb.deleteCharAt(4);
        sb.delete(14,'u');
        int x = 65;
        sb.setCharAt(0, (char)x);
        // System.out.println(sb.reverse());
        System.out.println(sb);
        // MOST OF THE STRING FUNCTION ALSO AVAILABLE !
    }
}