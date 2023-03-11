import java.util.ArrayList;
import java.util.List;
public  class deletion {
     public static void delet(int element){
        List<Integer> arr = new ArrayList<>();
        arr.remove(element);
        System.out.println("This "+element+" is deleted");

     }
     public static void adds(int item){
        List<Integer> al = new ArrayList<>();
        al.add(item);
        System.out.println(al);
     }





    public static void main(String[] args) {
        adds(34);
        adds(56);
        adds(78);
        adds(98);
        adds(70);
        adds(90);
        adds(99);
         delet(56);

        
    }
}
