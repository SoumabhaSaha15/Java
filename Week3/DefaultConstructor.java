
public class DefaultConstructor {

    public DefaultConstructor() {
        System.out.println("DEFAULT CONSTRUCTOR INVOKED");
    }
    public static void main(String[] args) {
        DefaultConstructor DC =  new DefaultConstructor();
        System.out.println(DC.getClass());
    }
    
}
