//package string method;

public class Missingnum {
     public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n = arr.length;
        int arr1[]={1,2,3,5,6};
        int mis=0;
        for(int i=0; i<n; i++){
            if(arr[i]!=arr1[i]){
                mis = arr[i];

                //System.out.println("this arry is not same");
            }
            
        }
        System.out.println("This value is missing"+mis);
     }
    
}
