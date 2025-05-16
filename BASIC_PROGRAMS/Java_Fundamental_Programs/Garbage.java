class check {
    int l, b;

    int fun() {
        int ans = l * b;
        return ans;
    }
    // void protected finalize()
    // {
    //      //delete just before dereferencing the object
    // }
}

class Garbage {
    public static void main(String[] args) {
        check r1 = new check();
        r1.l = 5;
        r1.b = 5;
        int ans = r1.fun();
        System.out.println(ans);
        r1=null;
        check r2 = new check();
        r2.l = 5;
        r2.b = 10;
        int an = r2.fun();
        System.out.println(an);
        r2=r1;
        new check();//ANANYMOUS
        // finalize();
    }
}
