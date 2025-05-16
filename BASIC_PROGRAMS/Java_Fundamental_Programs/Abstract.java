abstract class Member{
    abstract void Message();
}
class Student extends Member{
    void Message(){
        System.out.println("I am a Student");
    }
    
}
class Teacher extends Member{
    void Message(){
        System.out.println("I am a Teacher");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.Message();;
        Teacher t1=new Teacher();
        t1.Message();;
        Member m[]=new Member[4];
        m[0]=new Student();
        m[1]=new Student();
        m[2]=new Teacher();
        m[3]=new Teacher();
        for(Member m1:m)
        {
            m1.Message();
        }

    }
}
