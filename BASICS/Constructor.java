
class Rect {

    int l, b;

    Rect(int ll, int bb) {
        l = ll;
        b = bb;
    }

    int fun() {
        int ans = l * b;
        return ans;
    }
}

public class Constructor {

    public static void main(String[] args) {
        Rect r1 = new Rect(3, 4);// when the object is created the values shoul be initialized automaticall
        
        int a = r1.fun();
        System.out.println(a);

    }
}
