import java.util.Scanner;

public  class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){
                System.out.println(" ");
                
            }
            for(int j=1; j<=n; j++){
                if(j==1||i==n){
                    System.out.println("*");
                }else{
                    System.out.println(" ");
                }
                for( j=1; j<=n; j++){
                    if(j==i||i==n){
                        System.out.println("*");
                    }else{
                        System.out.println(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
