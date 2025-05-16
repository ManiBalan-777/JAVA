class Out{
    void print(){
        System.out.println("I am Outer");
    }
    static class In{
        void print(){
            System.out.println("I am Inner");
        }   
    }
}
public class InnerClass {
 public static void main(String[] args) {
    Out o=new Out();
    o.print();
    Out.In i=new Out.In();
    i.print();
 }   
}
