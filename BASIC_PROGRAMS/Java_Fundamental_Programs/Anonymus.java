
class cycle {

    void display() {
        System.out.println("I am a Cycle");
    }
}
// class tricycle extends cycle{
//     void display(){
//         System.out.println("I am aTRICycle");
//     }
// }

public class Anonymus {

    public static void main(String[] args) {
        cycle c = new cycle()
        {
            void display()  {
                System.out.println("I am aTRICycle");
            }
        };
        c.display();
    }
}
