public class AditionTwoarray {
     
    public static int[] arrayAddition(int first[],int second[]) {
        int result[] = new int [first.length>second.length?first.length:second.length];
        int i = first.length-1;
        int j = second.length-1;
        int k = result.length-1;
        int carry = 0;
        int sum = 0;
        while (k>=0) {
            if(i>=0 && j>=0){
                sum = first[i]+second[j]+carry;
            }
            else if(i>=0 && j <0){
                sum = first[i]+carry;
            }
            else if(j>=0 && i<0){
                sum = second[j]+carry;
            }
            if(k==0){
                result[k] = sum;
                break; 
            }
            result[k] = sum %10;
            carry = sum/10;
            i--;
            j--;
            k--;
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {9,5,1,7,5,3};
      //  printArr(arr);
       // rotate(arr, arr.length);
      //  printArr(arr);
        int arr2[] = {9,5,6,7,8,9,1};
        System.out.println(arrayAddition(arr, arr2));
    
    }    
}





   
