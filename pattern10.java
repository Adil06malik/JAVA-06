import java.util.Scanner;

public class pattern10 {
   /**
 * @param args
 */
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the values in intiger");
     int n = sc.nextInt();


     for(int i=1; i<n; i++){
        for(int j=i; j<n; j++){                    //                   
            System.out.println(" ");
        }
        for(int j=1; j<=n; j++){
            if(j==1){
            System.out.println("* ");
            }else{
                System.out.println(" ");
            }
        }
        for(int j=1; j<=n; j++){ 
            if(j==i){                             //       *
            System.out.println("* ");  
            }else{
                System.out.println(" ");
            }                                     //     *    *      
        }                                         //  *    *     * 
        System.out.println();                    // *   *     *     *
    }                                           //    *    *     *
    for(int i=1; i<=n; i++){                    //       *    *
        for(int j=1; j<i; j++){                  //         *
            System.out.println(" ");
        }
        for(int j=1; j<=n; j++){
            if(j==i||i==n){
            System.out.println("* ");
            }else{
                System.out.println(" ");
            }
        }
        for(int j=1; j<=n; j++){
            if(j==n){
            System.out.println("* ");
            }else{
                System.out.println(" ");
            }
        }
        for(int j=1; j<=n; j++){
            if(j==i||i==n){
            System.out.println("* ");
            }else{
                System.out.println(" ");
            }
        }
        for(int j=1; j<=n; j++){
            if(j==i||i==n){
            System.out.println("* ");
            }else{
                System.out.println(" ");
            }
        }
        for(int j=1; j<=n; j++){
            if(j==n){
            System.out.println("* ");
            }else{
                System.out.println(" ");
            }
        }
        for(int j=1; j<=n; j++){
            if(j==i||i==n){
            System.out.println("* ");
            }else{
                System.out.println(" ");
            }
        }
        System.out.println();
    }

    
   
   }

    
}
