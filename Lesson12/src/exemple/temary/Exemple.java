package exemple.temary;

public class Exemple {
    public static void main(String[] args) {
        String name; // имя домашнего животного

        String pet = "dog"; // либо dog либо cat

        name = (pet == "dog") ? "Шарик" : "Барсик";

//        if (pet == "dog") {
//            name = "Шарик";
//        } else {
//            name = "Барсик";
//        }

        System.out.println("Привет, рад тебя видеть, " + name);
    }
}
