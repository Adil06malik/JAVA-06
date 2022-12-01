public class PlaceTiles {

    public static int placetile(int n, int m){
        if(n == m){
            return 2;
    
        }
        if(n<m){
            return 1;
        }
        //vertically
        int vertPlacements = placetile(n-m, m);
        // horizontally
        int horiplcemnts =  placetile(n-1 , vertPlacements);
        
        return vertPlacements + horiplcemnts;
    }

    public static void main(String[] args) {
        int n=4, m=2;
        System.out.println(placetile(n, m));
        
    }
}
