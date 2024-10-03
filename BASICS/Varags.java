public class Varags {
static int mini(char c,int... arr)
{
    int min=Integer.MAX_VALUE;
    System.err.println(c);
    for(int i:arr)
    {
        if(i<min)
        {
            min=i;
        }
    }
    return min;
}
    public static void main(String[] args) {
    //    int i= mini();
    //   int j=  mini(3,4,5,6);
      int k=  mini('m',101,-101);

    //   System.out.println(i);
    //   System.out.println(j);
      System.out.println(k);
    }
}
