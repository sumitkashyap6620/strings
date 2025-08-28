import java.util.Scanner;
public class pascalstriangle{
   public static void displaymatrix(int mat[][]){
    for (int i = 0; i < mat.length; i++) {
        for(int j = 0 ; j < mat[i].length ; j++){
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
    }
}    public static void pst(int r ){
    int arr[][] = new int[r][];
    for (int i = 0 ; i < r ; i++  ){
        arr[i] = new int[i+1];
        arr[i][0] = 1;
        arr[i][i] = 1 ;
        for (int j = 1 ; j<i ; j++){
            arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
        }
    }
    displaymatrix(arr);
   }
    public static void main(String[] args) {
    System.out.print("Rows : ");
    Scanner sc = new Scanner (System.in);
    int r = sc.nextInt();
     pst(r);
   sc.close();
}
}