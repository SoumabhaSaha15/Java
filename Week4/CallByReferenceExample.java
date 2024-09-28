class Data {
    int value;

    Data(int value) {
        this.value = value;
    }
}

public class CallByReferenceExample {
    public static void modifyData(Data data) {
        data.value += 10;
        System.out.println("Value inside method: " + data.value);
    }

    public static void main(String[] args) {
        Data myData = new Data(5);
        System.out.println("Original Value before method call: " + myData.value);
        modifyData(myData);
        System.out.println("Original Value after method call: " + myData.value);
    }
}