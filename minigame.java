class Character{
    String name;
    Character(String name){
        this.name = name;
    }

    void attack() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
class warrior extends Character {
    
    warrior(String name){
        super(name);
        System.out.println( name + " is sent");
    }
    void attack(){
        System.out.println(name + " attack with swords");
    }
}
class Archer extends Character{
    
    Archer(String name){
        super(name);
        System.out.println( name +" is sent");


    }
    void attack(){
        System.out.println(name + " attack with arrows");
    }
}

public class minigame {
    public static void main(String[] args){
    Character[] n = { new Archer("archery"),new warrior("Knight")};
    for(Character a:n){
        a.attack();
    }
}
}
