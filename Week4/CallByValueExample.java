class CallByValueExample {
    public static void modifyValue(int num) {
        num = num + 10; 
        System.out.println("Value inside method: " + num);
    }

    public static void main(String[] args) {
        int originalValue = 5;
        System.out.println("Original Value before method call: " + originalValue);
        modifyValue(originalValue);
        System.out.println("Original Value after method call: " + originalValue);
    }
}