import java.util.ArrayList;
import java.util.Comparator;

public class Arraylist {

public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    numbers.add(5);
    numbers.add(10);
    numbers.add(15);
    numbers.add(20);
    numbers.add(25);
    numbers.add(30);
    numbers.add(35);
    //numbers.sort( );
    System.out.println(numbers);
    System.out.println(numbers.toString() );
    System.out.println(numbers.size());
    System.out.println(numbers.contains(Integer.valueOf(10)));
    System.out.println(numbers.isEmpty());
    
   // numbers.clear();  
    System.out.println("befor:"+ numbers.toString());
    numbers.forEach(number ->{
       numbers.set(numbers.indexOf(number),number*2);
    }); 
    
    System.out.println("after: " +numbers.toString());
}    
}
