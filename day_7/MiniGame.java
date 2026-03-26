package day_7;
//task: mini game,game have 3 characters=warrior,archer,mage
//all chracter have attack warrior- attack with sword,archer=attack with arrow,mage=attack with magic
//one common reference(name) for all characters and one common method(attack) for all characters
//uses inheritance and run time polymorphism(over riding) because same name attack and same parameter but different implementation in different classes
class Character {
    String name;
    Character(String name) {
        this.name = name;
    }
    void attack() {
        System.out.println(name + " attacks!");
    }
}
class Warrior extends Character {
    Warrior(String name) {
        super(name);
    }
    @Override
    void attack() {
        System.out.println(name + " attacks with a sword!");
    }
}
class Archer extends Character {
    Archer(String name) {
        super(name);
    }
    @Override
    void attack() {
        System.out.println(name + " attacks with an arrow!");
    }
}
class Mage extends Character {
    Mage(String name) {
        super(name);
    }
    @Override
    void attack() {
        System.out.println(name + " attacks with magic!");
    }
}
public class MiniGame {
    public static void main(String[] args) {
        Character c1 = new Warrior("warrior");
        Character c2 = new Archer("archer");
        Character c3 = new Mage("mage");
        c1.attack();
        c2.attack();
        c3.attack();
    }
}