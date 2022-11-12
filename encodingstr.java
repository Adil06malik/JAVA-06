public class encodingstr {
    public static void main(String[] args) {
        String s = "Hello Worly";
        String enc="";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='y'||c=='z'||c=='Z'||c=='Y')
              c -=26;
            c+=2;
            enc = enc + c;

        }
        System.out.println(enc);

    }
}
