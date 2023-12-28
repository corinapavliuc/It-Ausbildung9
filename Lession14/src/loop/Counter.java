package loop;

public class Counter {
    private final String title;
    private String name;

    public Counter(String title) {
        this.name =name;
        this.title =title;}

    public void count( int uperLimitNumber) {
        int current=0;

        while (current <= uperLimitNumber ){

            System.out.println(title + " : " +current);
            current++;

        }
    }
    public void printName(){
        System.out.println(name);
    }
}
