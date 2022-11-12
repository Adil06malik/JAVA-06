//package string method;

public class arrysecod {
    public static void main(String[] args) {
        int arr[]={0,0,0,1,1,1,0,0,1,0,1,1,1};
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=0; i<count; i++){
            arr[i] = 0;
        
        }
        for(int i=0; i<count; i++){
            arr[i]=i;
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+",");
        }
    }
    
}
