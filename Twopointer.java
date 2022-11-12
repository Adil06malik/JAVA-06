

public class Twopointer {
    public static void main(String[] args) {
        String s = "NO26 Sound";
        String r ="";
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(!Character.isWhitespace(c));
              r = r + c;
        }
        System.out.println(r);
        
    }
    
}
