import field.FieldExempleClass;
import field.StaticFieldExempleClass;

public class Main {
    public static void main(String[] args) {
        String title ="Hello world";
        System.out.println(title);

        FieldExempleClass fieldExempleClass = new FieldExempleClass();

        System.out.println(fieldExempleClass.count);
        fieldExempleClass.count =50;
        System.out.println(fieldExempleClass.count);

        FieldExempleClass anotherFieldExempleClass =new FieldExempleClass();
        System.out.println(anotherFieldExempleClass.count);

        //----------------------

        fieldExempleClass.expression= "I was changed";
        System.out.println(fieldExempleClass.expression);
        System.out.println(anotherFieldExempleClass.expression);

        //-----------------------

        System.out.println(StaticFieldExempleClass.staticExpression);
        StaticFieldExempleClass.staticExpression="I m a static and I was changed";

    }
        public static void invisibleVariableExemple(){
        //System.out.println(title);
        }
}