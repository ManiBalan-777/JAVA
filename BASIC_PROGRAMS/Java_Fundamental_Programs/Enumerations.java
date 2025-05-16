enum level{
    BEGIN("FU"),INTER("I"),ADVANCE("A");
    String abbr;
    level(String s){
        abbr=s;
    }
    String getAbbr(){
        return abbr;
    }
}
public class Enumerations {
    public static void main(String[] args) {
     level l1=level.INTER;
     System.out.println(l1);   
     System.out.println(l1.toString());   
     System.out.println(l1.ordinal());   
     System.out.println(l1.getAbbr());   
    }
}
