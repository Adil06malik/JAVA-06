public class Moveallx {
    public static void removeallx(String str, int idx, int count, String newString){
    if(idx == str.length()){
        for(int i=0; i<count; i++){
            newString += "x";
        }
        System.out.println(newString);
        return;

    }
    char currChar = str.charAt(idx);
    if(currChar == 'x'){
        count++;
        removeallx(str, idx+1, count, newString);
    }else{
        newString += currChar;//newString = newString + currchar
        removeallx(str, idx+1, count, newString);
    }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        removeallx(str, 0, 0, "");
    }
    
