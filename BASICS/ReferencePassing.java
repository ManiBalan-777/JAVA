public class ReferencePassing {
    static int incre(int a)
    {
        
      return a++;
    //   return ++a;
    }
    //creating a object will be stored in heap which means when we create a object the memory will create a storage for the object in heap then it will send the  reference for the created object use this reference  to manipulation 
    public static void main(String[] args) {
      System.out.println(incre(10));
    }
}
