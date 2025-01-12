
public class ThisKeyword {

  public String FileName;

  public ThisKeyword() {
    this.FileName = "ThisKeyword.java";
  }

  public static void main(String[] args) {
    ThisKeyword TK = new ThisKeyword();
    System.out.println(TK.getClass());
    System.out.println(TK.FileName);
  }
}
