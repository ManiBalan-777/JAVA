
import java.util.Scanner;

import java.util.*;
// package DATA STRUCTURES;

class operations {

    int arr[];
    int index;
    int capa = 2;
    int size;

    operations() {
        size = capa;

        arr = new int[size];
        index = 0;
    }

    void InsertAtEnd(int num) {
        System.out.println("INDEX=" + index);
        System.out.println("SIZE=" + size);
        if (index == size) {
            System.out.println("Array full so please wait I will Expand the Array..,");
            System.out.println("Before sizex" + size);
            expandArray();
            System.out.println("After sizex" + size);
        }
        arr[index++] = num;
    }

    private void expandArray() {
        size = size * 2;
        arr = java.util.Arrays.copyOf(arr, size);
    }

    void Display() {
        System.out.println("Array Elements Are:");

        for (index = 0; index < size; index++) {
            System.out.println("Value" + index + arr[index]);
        }
    }
    void InsertAtPos(int data,int pos)
    {
        arr[pos]=data;
    }
}

public class Dynamic_Array {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, n1 = 0, pos;
        operations obj = new operations();
        do {

            int num = 0;
            System.out.println("1.Insert an Element at the End:");
            System.out.println("2.Displays the  Array Elements");
            System.out.println("3.Insert an Element at the POSITION:");
            // System.out.println("4.Delete an Element at the POSITION:");
            System.out.println("5.Exit");
            n = s.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter the Number to be add:");
                    num = s.nextInt();
                    obj.InsertAtEnd(num);
                    break;
                case 2:
                    System.out.println("THE array elements are:");
                    obj.Display();

                    break;
                case 3:
                    System.out.println("Enter th e position ");
                    pos = s.nextInt();
                    System.out.println("Enter the Number to be add:");
                    num = s.nextInt();
                    InsertAtPos(num,pos);

                default:
                    break;

            }
            System.out.println("Want Exit? If exit Press any key if continue press 5!");
            n1 = s.nextInt();
        } while (n1 == 5);
        System.out.println("Thank you");

    }
}
