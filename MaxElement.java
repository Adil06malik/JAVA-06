public class MaxElement {
    static void approach_1(int arr[], int n){
        boolean isMax;
        for(int i=0; i<arr.length; i++){
            isMax = true;
            for(int j=0; j< n ; j++){
                if(arr[j]>arr[i]){
                    isMax = false;
                    break;
                }
            }
            if(isMax){
                System.out.println("Max Element is : "+ arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        
    }
    
}
