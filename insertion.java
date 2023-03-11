import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class insertion {
    
    
    private static List<Integer> list;
    public static void insert(Integer[] arr, int Element, int pos){
        List<Integer> lists = new ArrayList<>(Arrays.asList(arr));
        lists.add(pos -1,Element);
        arr = list.toArray(arr);
        System.out.println("Initial Array:\n"+ Arrays.toString(arr));
        System.out.println("\n Array with"+ Element+"inserted at position"+pos+":\n"+Arrays.toString(arr));
        

    }
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9};
        insert(arr, 10, 1);
    }
}
