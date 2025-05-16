import java.util.*;
 class Queue {
    public static void main(String[] args) {
        LinkedList<Integer> q=new LinkedList<>();
        q.add(4);
        q.add(6);
        q.add(5);
        // System.out.println(q.peak());
        System.out.println(q.poll());
        System.out.println(q.remove());
    }
}

// HashSet h=new HashSet();
// LinkedHashSet

// TreeSet //sorted