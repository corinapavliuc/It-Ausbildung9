package lesson;

public class main {
    public static void main(String[] args) {
        String simpleString ="Hallo! I. m simple string";

        String anotherString =new String( "Hallo! I .m another string");


        System.out.println(simpleString);
        System.out.println(anotherString);

        System.out.println(simpleString+";my length is- "+simpleString.length());

        System.out.println(anotherString+"; my length is_"+anotherString.length());

        System.out.println("________________________");
        System.out.println(simpleString.substring(12));
        System.out.println(anotherString.substring(20));

    }
}
