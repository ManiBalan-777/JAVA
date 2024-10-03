//count number of object creation
class Dummy{
    static int count=0;
   static int a;
    Dummy(){
        count++;
    }
    Dummy(int a){
        this.a=a;
        count++;
    }
    static{
        System.out.println("static starts..,,");
    }
    int a(){
        return a++;
    }
   static void countt(){
    a=10;
        System.out.println("Static Method Count Value"+count);
    }

}
class StaticVariable {
   public static void main(String[] args) {
       System.out.println("hiiiiiiiiii");
    Dummy d1=new Dummy(10);
    System.out.println(d1.a());
    Dummy d2=new Dummy();
    Dummy d3=new Dummy();
    Dummy d4=new Dummy();
    System.out.println("ans"+Dummy.count);
    Dummy.countt();
   } 
}
