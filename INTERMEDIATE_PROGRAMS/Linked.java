


// class LinkedList {

//     Node head;
//     class Node {

//         int data;
//         Node next;
    
//         Node(int val) {
//             data = val;
//             next = null;
//         }
//     }
//     LinkedList() {
//         head = null;
//     }

//     public void insertAtBeginning(int val) {
//         Node n = new Node(val);
//         if (head == null) {
//             head = n;
//         } else {
//             n.next = head;
//             head = n;
//         }
//     }

//     public void insertAtPos(int pos, int data) {
//         if (pos == 0) {
//             insertAtBeginning(data);
//             return;
//         }
//         Node newNode = new Node(data);
//         Node temp = head;
//         for (int i = 1; i <=pos-1; i++) {
//             temp = temp.next;
//             if (temp == null) {
//                 System.out.println("Invalid Position");
//                 return;
//             }
//             newNode.next = temp.next;
//             temp.next = newNode;
//         }
//     }

//     public void display() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.println(temp.data);
//             temp = temp.next;
//         }
//     }

// }

// public class Linked {

//     public static void main(String[] args) {
//         LinkedList l1 = new LinkedList();
//         l1.insertAtBeginning(7);
//         l1.insertAtBeginning(9);
//         l1.display();
//         System.out.println("----------");
//         l1.insertAtPos(1, 45);
//         l1.display();
//     }
// }

///

import java.util.Scanner;

public class toletters {

    // toletters(){
    //     String str
    // }
    String string;

    void lettertodigit(String str) {
        string = str;
        String split = string;
        System.out.println("Here passed string from main=" + string);
        String array[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        char ch = 'c';
        String array2[] = split.split("[ c]");
        String array3[]={"add","sub","mul","div"};
        System.out.println("Spitted arrays are:");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    
        //for operations
      
      
        for (int j = 0; j < array2.length; j++) {
            for (int i = 0; i < array.length; i++) {

                if (array2[j].equals(array[i])) {

                    System.out.println("Equivalent string to Number Value is:" + i);

                    // if (array2[j] == "\0") {
                    //     System.out.println("array is comple");
                    // }
                }
                if(array2[i].equals(array3[0]))
                {
                    System.out.println("additions");
                }

                // System.out.println("Not Matched with array");
            }
        }

    }

    private void assign(String operator) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assign'");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Sentences:");
        String s = scanner.nextLine();
        System.out.println("The Given String is:" + s);;
        toletters obj1 = new toletters();
        obj1.lettertodigit(s);
    }
}