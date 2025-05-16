
abstract class Vehi {

    abstract void print();
}
class Car extends Vehi{

    void print() {
                System.out.println("I am a Car");
    }
}

class Bike extends Vehi {

    void print() {
                System.out.println("I am a Bike");
    }
}
class mechanic{
    void check(Vehi v)
    {
        System.out.println("checker");
        v.print();
    }
}

public class Interface {

    public static void main(String[] args) {
        mechanic m=new mechanic();
        Bike b = new Bike();
        Car c = new Car();
        m.check(c); 
        m.check(b); 

    }
}
