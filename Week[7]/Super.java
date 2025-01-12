
public class Super {
  public String superClassMember;

  public Super() {
    this.superClassMember = "This is from Super class";
  }

  public static void main(String[] args) {
    Sub s1 = new Sub();
    Super s2 = new Super();
    System.out.println(s1.subClassMember);
    System.out.println(s1.superClassMember + "\n" + s2.superClassMember);
  }
}

class Sub extends Super {
  public String subClassMember;

  public Sub() {
    super();
    super.superClassMember += " called from sub class";
    this.subClassMember = "This is from Sub class.";
  }
}
