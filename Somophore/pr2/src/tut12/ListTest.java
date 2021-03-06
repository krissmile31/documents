package tut12;

import tut12.List;

public class ListTest {
  public static void main(String[] args) {
    // test data
    Object[] objs = {"hello world!", 2, 0, 1, 3};
    Object[] nonMembers = {null, -1, 0, "", 4};
    
    List l = new List();
    
    System.out.printf("initial: %s%n", l);
    
    Object a = 1;
    int index = 1;
    System.out.printf("lookUp(%s) -> %b%n", a,l.lookUp(a));
    System.out.printf("get(%d) -> %s%n", index, l.get(index));
    System.out.printf("size() -> %d%n", l.size());
    System.out.printf("head() -> %s%n", l.head());
    System.out.printf("tail() -> %s%n", l.tail());
    System.out.printf("isEmpty() -> %b%n", l.isEmpty());
    
    // push
    System.out.println("push:\n=====================");
    for (Object o : objs) {
      l.push(o);
      System.out.printf("push(%s) -> %s%n", o,l);      
    }

    System.out.printf("after: %s%n", l);
    System.out.printf("size() -> %d%n", l.size());
    System.out.printf("head() -> %s%n", l.head());
    System.out.printf("tail() -> %s%n", l.tail());
    System.out.printf("isEmpty() -> %b%n", l.isEmpty());

    // add
    System.out.println("add:\n=====================");
    for (Object o : objs) {
      l.add(o);
      System.out.printf("add(%s) -> %s%n", o,l);      
    }

    System.out.printf("after: %s%n", l);
    System.out.printf("size() -> %d%n", l.size());
    System.out.printf("head() -> %s%n", l.head());
    System.out.printf("tail() -> %s%n", l.tail());
    System.out.printf("isEmpty() -> %b%n", l.isEmpty());

    // look up 
    System.out.println("lookup:\n=====================");
    boolean tf;
    for (Object o : objs) {
      tf = l.lookUp(o);
      System.out.printf("lookUp(%s) -> %b%n", o,tf);      
    }
    
    for (Object o : nonMembers) {
      tf = l.lookUp(o);
      System.out.printf("lookUp(%s) -> %b%n", o,tf);      
    }
    
    // get
    System.out.println("get:\n=====================");
    int size = l.size();
    for (int i = 0; i < size; i++) {
      Object o = l.get(i);
      System.out.printf("get(%d) -> %s%n", i,o);      
    }

    index = 5;
    a = l.get(index);
    System.out.printf("get(%d) -> %s%n", index,a);

    // remove
    System.out.println("remove:\n=====================");
    for (Object o : objs) {
      l.remove(o);
      System.out.printf("remove(%s) -> %s%n", o,l);      
    }
    System.out.printf("after: %s%n", l);
    
    System.out.printf("size() -> %d%n", l.size());
    System.out.printf("head() -> %s%n", l.head());
    System.out.printf("tail() -> %s%n", l.tail());
    System.out.printf("isEmpty() -> %b%n", l.isEmpty());
  }
}

