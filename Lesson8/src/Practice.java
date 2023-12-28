import java.util.Random;

public class Practice {
    public static void main(String[] args) {
        System.out.println(getRandomStudentfromClass(100));
    }
    public static int getRandomStudentfromClass(int studentsQuantity) {
        if (studentsQuantity < 2) {
            System.out.println();
            return -1;
        } else {
            return new Random(studentsQuantity).nextInt();
        }
    }
    }
