import java.util.Arrays;
import java.util.HashMap;

public class UsinHasmap {
  static void approcah2(int arr[], int k){
    HashMap<Integer, Integer> map = new HashMap<>();
      
    int n = arr.length;
    for(int i=0; i<=n; i++){
        if(map.get(arr[i])==null){
            map.put(k-arr[0], arr[0]);

        }else{
            System.out.println(map.get(arr[i])+", "+ arr[i]);
            return;
        }


    }

  }

  static void approach3(int arr[], int k){
    Arrays.sort(arr);
    //
  }


    public static void main(String[] args) {
        int arr[] = {3,6,7,8,6,9,7};
        int k = 11;
        approcah2(arr, k);
        
    }
}
