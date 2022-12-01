public class TowerofHanoi {
  public static void Towerhanoi(int n, String src, String helper, String dest){
    if(n==1){
        System.out.println("transfer disk"+n+"form"+src+"to"+ dest );
        return; 
    }
    
    Towerhanoi(n-1, src, helper, dest);
    System.out.println("transfer disk"+n+"form"+src+"to"+ dest );
    Towerhanoi(n-1, src, helper, dest);


  }



    public static void main(String[] args) {
        int n =3;
        Towerhanoi(n, "S","H" , "D");
        
    }
    
}
