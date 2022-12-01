import java.util.ArrayList;

public class class15 {

    public static void main(String[] args) {
       // System.out.println((dicepos(0, 100)));
        System.out.println(playerInMaze(0, 0, 2, 2));
        
    }
///////////////DICE PROBLEM
    static ArrayList<String>dicepos(int source, int target){
        if(source==target){
            ArrayList<String>per = new ArrayList<>();
            per.add("");
            return per;
        }
        if(source>target){
            ArrayList<String> per = new ArrayList<>();
            return per;
        }
        ArrayList<String>finalResult  = new ArrayList<>();
        for(int dice = 1; dice <=6; dice++){
            int currenValue = dice+source;
            ArrayList<String> per = dicepos(currenValue, target);
            for(String temp: per){
                finalResult.add(temp+dice);
            }
        }
        return finalResult;
    }

////////////// PLAYER IN MAZE

static ArrayList<String> playerInMaze(int row,int col,int endRow,int endcol){
    if(row>endRow){
  ArrayList<String>list= new ArrayList<>();
  return list;
}
 if(col>endcol){
    ArrayList<String>list=new ArrayList<>();
    list.add("");
    return list;
 }
 if(row==endRow && col==endcol){
    ArrayList<String> list = new ArrayList<>();
    list.add(" ");
    return list;
 }
 ArrayList<String> finalResult = new ArrayList<>();
 // for down step
 ArrayList<String> list = playerInMaze(row+1, col, endRow, endcol);
 for(String temp : list){
     finalResult.add(temp+"D");
 }
// for right step
list = playerInMaze(row, col+1, endRow, endcol);
for( String temp:list){
    finalResult.add(temp+"R");
}
//FOR Diagonal step
list = playerInMaze(row+1, col+1, endRow, endcol);
for(String temp: list){
    finalResult.add(temp+"g");
}
 return finalResult;


}
}
