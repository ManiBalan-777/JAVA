public class Methods {
   static int  Volume(int l,int b,int h)
    {
        int ans=l*b*h;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(Volume(3,4,5));
        int a=5,b=10,c=20;
        
        System.out.println(Volume(a, b, c));
    }
}
