package Patterns;

public class basic {

    public static void main(String[] args) {
        Pattern1(5);
        Pattern2(5);
        Pattern3(5);
        Pattern4(5);
        Pattern5(5);
        Pattern6(5);
        Pattern7(5);


    }
    static void Pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------------------------");
    }
    static void Pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------------------------");

    }
    static void Pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------------------------");

    }
    // static void Pattern3(int n) {
    //     for (int i = 0; i <= n; i++) {
    //         for (int j = 1; j <= n-i; j++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("------------------------");

    // }
    static void Pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("------------------------");
    }
    static void Pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("------------------------");
    }
    static void Pattern6(int n) {
        for (int i = 1; i <= 2*n-1; i++) {
            int collim=i>n?2*n-i:i;
            for (int j = 1; j <= collim; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------------------------");
    }
    static void Pattern7(int n) {
        for (int i = 1; i <= 2*n; i++) {
            int collim=i>n?2*n-i:i;
            int spacelim=n-collim;
            for (int s = 0; s < spacelim; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= collim; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------------------------");
    }
}
