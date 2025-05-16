class Cube{
    int l,b,h;
   public Cube(int a,int b,int c) {
    l=a;
    this.b=b;
    h=c;
    }
    Cube(Cube val)
    {
        l=val.l;
        b=val.b;
        h=val.h;
    }
    int cal(){
        int a=l*b*h;
        return a;
    }
    boolean isEqual(Cube val)
    {
        
if (l==val.l && b==val.b && h==val.h) {
    return true;
    
}
return false;
    }
}
public class ObjectPassing {
    public static void main(String[] args) {
        
        Cube b1=new Cube(2,3,4);
        int a=b1.cal();
        System.out.println(a);
        Cube b2=new Cube(2,5,4);
        System.out.println(b2.cal());
       
        System.out.println(b1.isEqual(b2) );
        // creating object and passing parametrer as a object //copy constructor
        Cube b3=new Cube(b2);
        System.out.println(b3.cal());
    }
}
