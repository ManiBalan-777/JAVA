import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) {
        Student s=new Student();
        Class cls=s.getClass();
        System.out.println(cls);
        Method[] m=cls.getMethods();
        for(Method a:m){
            System.out.println(a.getName());
        }
       System.out.println( s.equals("mani"));
        // Method[0].invoke(null);
    }
}
