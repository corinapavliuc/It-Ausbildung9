public class Main {
    public static void main(String[] args) {
        System.out.println("начала програмы");
        System.out.println("----------------------");
    returnExemple();
        System.out.println("----------------------");
        System.out.println("Конец программы");
    }

    public static void returnExemple(){
    boolean t =true;
        System.out.println("Before the return instruction");
        if (t) {
            return;
        } else {
            System.out.println("This won't execute");
        }
        System.out.println("This won't execute");
    }
}

