// interface  cycle{
//     abstract void display();
// }
// // class cycle {

// //     void display() {
// //         System.out.println("I am a Cycle");
// //     }
// // }
// // class tricycle extends cycle{
// //     void display(){
// //         System.out.println("I am aTRICycle");
// //     }
// // }

// public class Lambda {

//     public static void main(String[] args) {
//         // cycle c = new cycle()
//         // {
//         //     void display()  {
//         //         System.out.println("I am aTRICycle");
//         //     }
//         // };
//         // c.display();
//         cycle r = () -> System.out.println("I am aTRICycle");
//         r.display();
//     }
// }

@FunctionalInterface
interface Cycle {
    void display();
}

public class Lambda {
    public static void main(String[] args) {
        // Using an anonymous inner class
        Cycle c = new Cycle() {
            @Override
            public void display() {
                System.out.println("I am a Tricycle (Anonymous Inner Class)");
            }
        };
        c.display();

        // Using a lambda expression
        Cycle r = () -> System.out.println("I am a Tricycle (Lambda Expression)");
        r.display();
    }
}
