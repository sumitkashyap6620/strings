import java.util.Scanner;
public class basic{
public static void displaymatrix(int mat[][]){
    for (int i = 0; i < mat.length; i++) {
        for(int j = 0 ; j < mat[0].length ; j++){
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
    }
}
public static int[][] rotation(int arr[][]){
 arr = transpose(arr);
 for (int i = 0 ; i < arr.length ; i++){
    int j = 0 ; 
    int k = arr.length-1;
    while(j<k){
        arr[i][j] = arr[i][j] + arr[i][k] ;
        arr[i][k] = arr[i][j] - arr[i][k] ;
         arr[i][j] = arr[i][j] - arr[i][k] ;
         j++;
         k--;
    }
 }
 return arr ;
}
public static int[][] transpose(int arr[][]){
    for (int i = 0 ; i < arr.length ; i++){
        for(int j = i+1 ; j < arr[0].length ; j++ ){
             arr[i][j] = arr[j][i] + arr[i][j];
             arr[j][i] = arr[i][j] - arr[j][i];
             arr[i][j] = arr[i][j] - arr[j][i];
        }
}
return arr ;
}
    public static void main(String[] args) {
    System.out.print("Rows : ");
    Scanner sc = new Scanner (System.in);
    int x = sc.nextInt();
    System.out.print("columns :");
    int[][] arr = new int[x][sc.nextInt()];
    System.out.println("give all elements :-");
      for(int i = 0  ; i < arr.length ; i++){
                    for (int j = 0 ; j < arr[0].length ; j++ ){
                    arr[i][j] = sc.nextInt();
                    }
                }
        
    System.out.println("given matrix is :-");
  displaymatrix(arr);
//   System.out.println("transpose of matrix :-");
//   displaymatrix(transpose(arr));
   System.out.println("90* Rotation of matrix :-");
   displaymatrix(rotation(arr));
   sc.close();
}
}