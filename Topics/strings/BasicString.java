
public class BasicString {
  public static void main(String[] args) {
    String str = " Hello, world. ";
    char[] str2 = new char[10];
    System.out.println(str + " length: " + str.length());
    System.out.println("char at 5: " + str.charAt(5));
    System.out.println(str.strip() + "\n" + str);
    System.out.println(str.compareTo(str.strip()));
    System.out.println(str.startsWith("e", 2));
    str.getChars(0, 10, str2, 0);
    System.out.println(str2);
    str2 = str.toCharArray();
    System.out.println(str2);

  }
}
