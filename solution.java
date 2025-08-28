class Solution {
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
    public void rotate(int[][] arr) {
       arr = transpose(arr);
 for (int i = 0 ; i < arr.length ; i++){
    int j = 0 ; 
    int k = arr[0].length-1;
    while(j!=k){
        arr[i][j] = arr[i][j] + arr[i][k] ;
        arr[i][k] = arr[i][j] - arr[i][k] ;
         arr[i][j] = arr[i][j] - arr[i][k] ;
         j++;
         k--;
    }
 }
 
}
    }