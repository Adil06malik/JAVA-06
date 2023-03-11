import java.util.Scanner;

public class barchar {
    public void pv(int t[]){
     
        int n = t.length;
        int mx = t[0];
        for(int i=1; i<n; i+=1){
            if(t[i]>mx){
                mx  = t[i];
            }
        }
        for(int b=mx; b>=1; b-=1){
            for(int j=0; j<n; j +=1){
                if(t[i]>=b){
                    System.out.println("*");
                }
                else{
                    System.out.println(" ");
                }
                System.out.println();
            }
        }








    }

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      int   n = in.nextInt();
      int lt[] = new int[n];
         System.out.println("Enter the values one by one");
          for(int i=0; i<n; i+=1){
               lt[i] = in.nextInt();
          } 
          pv(lt); 
    }
}
