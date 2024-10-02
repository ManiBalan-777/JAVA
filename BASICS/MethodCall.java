class rec {
    int l, b;

    int fun() {
        int ans = l * b;
        return ans;
    }
}

public class MethodCall {
    public static void main(String[] args) {
        rec r1 = new rec();
        r1.l = 5;
        r1.b = 5;
        int ans = r1.fun();
        System.out.println(ans);
        
        rec r2 = new rec();
        r2.l = 5;
        r2.b = 10;
        int an = r2.fun();
        System.out.println(an);
    }
}
