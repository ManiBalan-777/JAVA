
import java.util.*;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        list.add("MANIDAs");
        list.remove(4);
        list.set(3, 400);

        System.out.println(list.get(3));
        Iterator i=list.iterator();
        while (i.hasNext()) {
            
            System.out.println(i.next());
        }
        System.out.println(i.hasNext());
    }
}
