public class patten4 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        for(int i=6; i>=1; i--){
            for(int j=1; j<=i; j++ ){
                System.out.println(j);
            }
            for(int j=11; j>2*i; j--){
                System.out.println(" ");
            }
            for(int j=i; j>=1; j--){
                if(j!=6){
                    System.out.println(j);
                }
                System.out.println();
            }
        }
    }
    
}
