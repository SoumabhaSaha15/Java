
import pkg1.*;
import pkg2.*;

public class Main {

    public static void main(String[] args) {
        FirstClass obj1 = new FirstClass();
        SecondClass obj2 = new SecondClass();
        pkg1.MyClass mcl1 = new pkg1.MyClass();
        pkg2.MyClass mcl2 = new pkg2.MyClass();
        obj1.display();
        obj2.display();
        mcl1.display();
        mcl2.display();
    }
}
