public class Main {
    public static void main(String[] args) {
        checkDayOfWeekIfElse("Monday");
        checkDayOfWeekIfElse("Monday");
        checkDayOfWeekIfElse("monday");
        checkDayOfWeekIfElse("monday");
    }

    public static void checkDayOfWeekSwitch(String dayOfWeek) {
        switch (dayOfWeek) {
            case "Monday":
                System.out.println("Heute is Monday");
                break;
            case "Tuesday":
                System.out.println("Heute ist tuesday");
                break;
            default:
                System.out.println("Heute ist nicht Monday");
        }
    }

    public static void checkDayOfWeekIfElse(String dayOfWeek) {
        if (dayOfWeek == "Monday") {
            System.out.println("Heute is Monday");
        } else if (dayOfWeek == "Tuesday") {
            System.out.println("Heute ist nicht Monday");
        } else {
        }
    }
}