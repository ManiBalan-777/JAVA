
import java.util.Scanner;

// package DATA STRUCTURES;
 class operations{
    int arr[];
    int index=0;
    int size=6;
    operations(){
        arr=new int[size];
    }
    void InsertAtEnd(int num)
    {
                arr[index++]=num;
    }
    void Display()
    {
        System.out.println("Array Elements Are:");

        for (int i = 0; i < size; i++) {
            System.out.println(arr[index]);
        }
    }
}
 public class Dynamic_Array {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
      
        operations obj=new operations();
        while(true){ 
            int num=0;
            System.out.println("1.Insert an Element at the End:");
            System.out.println("2.Displays the  Array Elements");
            System.out.println("3.Insert an Element at the POSITION:");
            System.out.println("4.Delete an Element at the POSITION:");
            System.out.println("5.Exit");
            switch (num) {
                case 1:
                System.out.println("Enter the Number to be add:");
                    num=s.nextInt();
                    obj.InsertAtEnd(num);
                    break;
                case 2:
                    System.out.println("THE array elements are:");
                    obj.Display();
                default:
                    break;
            }
        }
       
        

    }
}
