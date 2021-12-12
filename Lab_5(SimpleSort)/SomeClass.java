public class SomeClass {
    long a;
    String b;
    boolean c;

    public SomeClass() { }

    public SomeClass(long a, String b, boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void getDeclaredFields(){
        System.out.println("Integer a = " + this.a);
        System.out.println("String b = " + this.b);
        System.out.println("Boolean c = " + this.c);
    }
}
