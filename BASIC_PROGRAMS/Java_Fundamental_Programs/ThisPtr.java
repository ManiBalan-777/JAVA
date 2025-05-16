
class This {

    int l, b;

    This(int l, int b) {
        this.l = l;
        this.b = b;
    }

    int fun() {
        int ans = l * b;
        return ans;
    }
}

class Constructor {

    public static void main(String[] args) {
        This r1 = new This(3, 4);// when the object is created the values shoul be initialized automaticall
        
        int a = r1.fun();
        System.out.println(a);

    }
}
