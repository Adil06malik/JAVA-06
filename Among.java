import java.util.Scanner;

public class Among {
    private static int arm;

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Enter the number");
         int n = p.nextInt();
         int count=0;
         while(n!=0){
             n=n/10;
             count++;
         }
        System.out.println(count);
         int rem,c;
         int arm =0;
         c=n;
         while(n!=0){
           rem  =n%10;
           arm = (rem)^count+arm;
           n=n/10;

         }

         if(c==arm){
             System.out.println("This number is amoningstom"+n);
         }else{
             System.out.println("This number is not amoningstom" +n);
         }
        
    }
    
}
