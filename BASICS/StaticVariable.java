//count number of object creation
class Dummy{
    static int count=0;
    int a;
    Dummy(){
        count++;
    }
    Dummy(int a){
        this.a=a;
        count++;
    }
    static {
        System.out.println("static starts..,,");
    }
    int a(){
        return a++;
    }

}
public class StaticVariable {
   public static void main(String[] args) {
    Dummy d1=new Dummy(10);
    System.out.println(d1.a());;
    Dummy d2=new Dummy();
    Dummy d3=new Dummy();
    Dummy d4=new Dummy();
    System.out.println(Dummy.count);
   } 
}
