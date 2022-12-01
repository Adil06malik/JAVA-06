public class string {
     public static String reveseString(String input){
        if(input.equals(" ")){
          return " ";
         }
       return reveseString(input.substring(1))+ input.charAt(0);
    }
    
    public static void main(String[] args) {
        System.out.println("hello world");
        reveseString("hi hello");
    }
    
}
