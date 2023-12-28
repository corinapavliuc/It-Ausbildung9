package metods;

public class Calculator {

    private static void privateMethod(){
        System.out.println("I'm a private method");
    }
    public static void  callPrivateMethod(){
        System.out.println("callPrivateMethod started");
        privateMethod();
        System.out.println("callPrivateMethod ended");
    }
     static void defaultmethod(){
         System.out.println("I am a devault method");


    }
}

