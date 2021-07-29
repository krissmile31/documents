package tut4;

public class StringIntMapApp {
  public static void main(String[] args) {
    String[] keys = { // 
        null, 
        "I", //null,
        "love", 
        "Java"
        };
    int[] vals = { //
        1, 
        2, //1, 
        3, 
        4};
    
    int num = keys.length;
    
    StringIntMap map = new StringIntMap();
    
    // add entries
    for (int i = 0; i < num; i++) {
      map.add(keys[i], vals[i]);
    }
    
    // print object
    System.out.println(map);
    
    // check validity
    if (map.repOK()) {
      System.out.println("map ok");
    } else {
      System.err.println("Invalid map object");
    }
  }
}
