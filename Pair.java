public class Pair {

   static public void sum(int arr[], int k){
    int n = arr.length;
    int i;
    int j;
    for(i = 0; i<=n; i++ ){
        for(j = 0; j<=n; j++){
            if(arr[i]+arr[j] == k){
                System.out.println("This index is value cantain"+arr[i]+ " , "+ arr[j]);
            }else{
                System.out.println(" No sum pair");
            }
        }
    }
    
   }








    public static void main(String[] args) {
          int arr[] = {3,2,5,7,6,9};
          int k = 11;
          sum(arr, k);
          System.out.println(" hello world");



    }
}
