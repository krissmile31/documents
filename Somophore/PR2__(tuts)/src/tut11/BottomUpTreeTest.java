package tut11;

public class BottomUpTreeTest {
  public static void main(String[] args) {
    
    Tree t4 = new Tree(4);
    Tree t5 = new Tree(5);
    Tree t8 = new Tree(8);
    Tree t9 = new Tree(9);
    Tree t7 = new Tree(7,t8,t9);
    
    Tree t11 = new Tree(11);
    Tree t12 = new Tree(12);
    Tree t10 = new Tree(10,t11,t12);
    
    Tree t3 = new Tree(3,t4,t5);
    Tree t6 = new Tree(6,t7);
    Tree t2 = new Tree(2, t3, t6);
    Tree t1 = new Tree(1, t2,t10);

    boolean repOk = t1.repOK();   
    if (repOk)
      System.out.println(t1);
    
    System.out.println("valid: " + repOk);
    
    System.out.println("Some sub-trees:\n");
    System.out.printf("%s%n%n",t4);
    System.out.printf("%s%n%n",t6);
    System.out.printf("%s%n%n",t10);
  }
}
