class Outer {
    private final int outerVar = 10;
    class Inner {
        void display() {
            System.out.println("Outer variable: " + outerVar);
        }
    }
}

public class TestNestedInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}