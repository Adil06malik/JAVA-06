class GasStation {
   
   static public int  Circuit(int[] gas, int[] cost){
       int tank = 0, total = 0, index = 0;
       for(int i =0; i<gas.length; i++){
           int consume = gas[i] - cost[i];
           tank += consume;
           if(tank < 0){
            index  = i+1;
            tank = 0;
           } 
           total += consume; 
       }
       int value = total < 0 ? - 1 : index;
       return  value;
    }
     
   
     
    static public void Circuit2(int[] gas, int[] cost){
        int n = gas.length;
        for(int i= 0; i<n; i++){
            int total = 0, stopCount = 0;
            int j=i;
            while(stopCount < n){
                total += gas[j%n]-cost[j%n];
                if(total < 0){
                     j =i;
                    j++;

                    break;
                   // j++;

                }
                if(stopCount == n && total >= 0){
                    return;
                }
            }
            return;
        }
     }




    public static void main(String[] args) {
        
    }
}
