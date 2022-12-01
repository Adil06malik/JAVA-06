public class conttotalpath {
    public static int mazepaths(int i, int j, int n, int m){
        // if value is  i,j 0 return
        if(i==n||j==m){
            return 0;

        }
        //if vlaue is i,j full return 1
        if(i == n-1 && j == m-1){
            return 1;
        }
        //move downword
        int downpaths =  mazepaths(i+1, j, n, m);

        //move right
        int rithpaths =  mazepaths( i, j+1, n, m);
        // total countpath 
         return downpaths + rithpaths;
    }
      
    public static void main(String[] args) {
        
        int totalPaths = mazepaths(0, 0, 3, 3);
        System.out.println(totalPaths);
        

        
    }
    
