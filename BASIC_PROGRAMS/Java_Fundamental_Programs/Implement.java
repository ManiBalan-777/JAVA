
interface Vehicle {
//    abstract,final,static int VLAUE=10;
//No Objevct creations

    // default void dis(){

    // }
     void print();
}

class Car implements Vehicle {

    public void print() {
        System.out.println("I am a Car");
    }
}

class Bike implements Vehicle {

    public void print() {
        System.out.println("I am a Bike");
    }
}

class Mechanic {

   public  void check(Vehicle v) {
        System.out.println("checker");
        v.print();
    }
}

public class Implement{

    public static void main(String[] args) {
        Mechanic m = new Mechanic();
        Vehicle v=new Car();

        Bike b = new Bike();
        Car c = new Car();
        m.check(c);
        m.check(b);

    }
}
