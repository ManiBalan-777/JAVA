import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       
       while (true) { 
        System.out.println("Enter the alphabet:");;
        char letter=s.next().charAt(0);
        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(letter+"Is a Vowel");   
                break;
        
            default:
                System.out.println(letter+"Is a consonant");   
                break;
        }

       }

    }
}
