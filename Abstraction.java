 abstract class Animal{
    abstract void walk();
    public void eat(){
        System.out.println("Animal eates");
    }

    
}
class Hores extends Animal{
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}
class Chiken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}






public class Abstraction {
    public static void main(String[] args) {
        Hores h1 = new Hores();
        h1.walk();
        Chiken A1 = new Chiken();
        A1.walk();
        A1.eat();
            
        
    }
    
}
