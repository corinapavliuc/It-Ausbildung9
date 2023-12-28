public class Salary {
    public static void main(String[] args) {
        int projectGrade = 80;
        int finalExamGrade = 75;
        int homeworkGrade = 700;
        int homeworkAmount = 10;
        System.out.println(grade(projectGrade,finalExamGrade,homeworkGrade,homeworkAmount));
    }
    public static double grade(int a,int b,int c,int d){
        return 0.3*a+0.5*b+c/d*0.2;
    }


}