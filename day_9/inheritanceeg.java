package day_9;
    //inheritance is a relationship
//Composition has a relationship
//composition is tightly coupled --> child obj cant exists without parent obj //cant work seperately or independently, object created inside another object
// Aggregation is weakly coupled // both obj can work independently
//eg car
//   _|_
//  |   |
// BMW  Audi
//all car are not BMW but all BMW are the car
//car has a engine V
//car is a engine X

class Battery{
    public void powerSupply(){
        System.out.println("still have 40% power");
    }
}class Remote{//access Battery without inheritance, if we use inheritance we can straightly use class Remote extends Battery 
//we need to create Object to access battery
Battery miniBattery;//has a relationship(Composition)
Remote(){//constructor, when every remote is called then miniBAtery obj is created "Tightly coupled"
miniBattery =new Battery();
}
public void changeChannel(){//composition
miniBattery.powerSupply();
System.out.println("Channel Changed");
}
public void changeVolume(){
    System.out.println("Volume increased");
}
}
class Tv{
    Remote tvRemote;
    Tv(Remote tvRemote){
        this.tvRemote=tvRemote;
    }
    public void increaseVolume(){
        tvRemote.changeVolume();
    }
}

public class inheritanceeg {
    public static void main(String[] args){
        Remote tvRemote=new Remote();//new Remote()--> constructor
        tvRemote.changeChannel();
    }
}

