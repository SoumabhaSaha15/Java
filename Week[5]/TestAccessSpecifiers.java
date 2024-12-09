class AccessSpecifierExample {

    public int publicVar = 10;
    private int privateVar = 20;
    public int getPrivateVar() {
        return privateVar;
    }
    public void displayValues() {
        System.out.println("Public Variable: " + publicVar);
        System.out.println("Private Variable: " + privateVar);
    }
}

public class TestAccessSpecifiers {
    public static void main(String[] args) {
        AccessSpecifierExample example = new AccessSpecifierExample();
        System.out.println("Accessing Public Variable: " + example.publicVar);
        try {
            // System.out.println("Accessing Public Variable: " + example.privateVar);
        } catch (Exception e) {
            System.err.println(e);
        }
        System.out.println("Accessing Private Variable through Method: " + example.getPrivateVar());
        example.displayValues();
    }
}