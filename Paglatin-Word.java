public class Piglatin {
    public static void main(String[] args) {
        String s = " Hello world";
        String pl="";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            //  CharArray();
            char u =Character.toUpperCase(c);
            if(u=='A'||u=='E'||u=='I'||u=='O'||u=='U'){
                if(i==0)
                pl=s+"way";
                else{
                    pl=s.substring(i)+s.substring(0,i)+"AY";
                    break;
                }
            }
        }
        System.out.println(pl);

    }
}
