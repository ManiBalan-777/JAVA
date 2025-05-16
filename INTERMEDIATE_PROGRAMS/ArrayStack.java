
class Stack {

    int a[] = new int[5];
    int tos;
    Stack() {
        tos = -1;
    }

    void push(int num) {
        if (tos == 5) {

            a[++tos] = num;
        }
        else{
            System.out.println("Full");
        }
    }
    int pop(){
        if(tos<0)
        {
            return 0;
        }
        else{
        return a[tos--];

        }
    }
}

public class ArrayStack {

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);
        System.out.println(s.pop());
    }
}
