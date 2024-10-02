class obj{
    int len,bre;
    obj(int l,int b){
        len=l;
        bre=b;
    }
    int check(){
        return len*bre;
    }
    obj doub(){
        obj temp=new obj(2*len,2*bre);
        System.out.println(len*bre);
        return temp;
    }
}
public class ReturningObject {
    
    public static void main(String[] args) {
        obj o1=new obj(3,23);
        System.out.println(o1.check());
        obj o3=o1.doub();
        System.out.println(o3.len);
    }
}
