package tut4;

import java.util.Vector;

import utils.DomainConstraint;

/**
 * @overview StringIntMaps are mutable sets of mappings between strings and
 *   integers. 
 * @attributes
 *   entries   Set<<String,Integer>>    Vector<<String,Integer>>
 * @object 
 *   A typical StringIntMap is {<s1,i1>,...,<sn,in>}, where s1,...,sn are
 *   strings and i1,...,in are integers.
 * @abstract_properties
 *   mutable(entries)=true /\ optional(entries)=false /\ 
 *   for all e in entries. (e = <s,i> /\ s is string /\ i is integer) /\
 *   for all e, f in entries. (equals(e[0],f[0])=false \/ e[1] != f[1])
 * 
 * @version 1.0: added inner class Entry to represent entries
 * @author dmle
 */
public class StringIntMap {
  @DomainConstraint(type="Vector",optional=false)
  private Vector<Entry> entries;
  
  /**
   * @effects
   *   initialise this to be empty
   */
  public StringIntMap() {
    entries = new Vector<>();
  }
  
  /**
   * @modifies this
   * @effects
   *   if <s,i> is not in this
   *     add <s,i> to this, i.e. this_post = this+{<s,i>}
   */
  public void add(String s, int i) {
    if (!isIn(s,i))
      entries.add(new Entry(s,i));
  }
  
  /**
   * @modifies this
   * @effects
   *   if <s,i> is in this
   *     remove <s,i> from this, i.e. this_post = this-{<s,i>}
   *  
   */
  public void remove(String s, int i) {
    // alternative (but slower): use look up to check if entry exists
    // then use Vector.remove for each entry
    Entry e;
    for (int j = 0; j < entries.size(); j++) {
      e = entries.get(j);
      if ((e.s == null && s == null) || 
          e.s.equals(s)) {
        if (e.i == i) {
          entries.setElementAt(entries.lastElement(), j);
          entries.remove(entries.size()-1);
        }
      }
    }
  }
  
  /**
   * @effects <pre>
   *            if there exist entries e = < s1,i1 > in this
   *            s.t. s1.equals(s) /\ i1 == i
   *              returns an StringIntMap containing all such e
   *            else
   *              returns null</pre>
   */
  private StringIntMap lookup(String s, int i) {
    StringIntMap matches = new StringIntMap();
    Entry e;
    for (int j = 0; j < entries.size(); j++) {
      e = entries.get(j);
      if ((e.s == null && s == null) || 
          (e.s != null && e.s.equals(s))) {
        if (e.i == i) {
          matches.entries.add(e);
        }
      }
    }
    
    if (matches.size() == 0) 
      return null;
    else 
      return matches;
  }

  /**
   * @effects
   *   if there exists entries <s,i> in this for some integer i
   *     return a set of all such entries
   *   else
   *     return null   
   */ 
  public StringIntMap lookup(String s) {
    StringIntMap matches = new StringIntMap();
    Entry e;
    for (int j = 0; j < entries.size(); j++) {
      e = entries.get(j);
      if ((e.s == null && s == null) || 
          (e.s != null && e.s.equals(s))) {
        matches.entries.add(e);
      }
    }
    
    if (matches.size() == 0) 
      return null;
    else 
      return matches;
  }
  
  /**
   * Reversed look up method.
   * 
   * @effects
   *   if there exists entries <s,i> in this for some integer i
   *     return a set of all such entries
   *   else
   *     return null
   */  
  public StringIntMap lookup(int i) {
    StringIntMap matches = new StringIntMap();
    Entry e;
    for (int j = 0; j < entries.size(); j++) {
      e = entries.get(j);
      if (e.i == i) {
        matches.entries.add(e);
      }
    }
    
    if (matches.size() == 0) 
      return null;
    else 
      return matches;
    
  }

  /**
   * @effects
   *   if <s,i> is in this, 
   *   i.e. exists <s',i'> in this s.t. equals(s,s') /\ i=i'
   *     return true
   *   else
   *     return false
   */
  public boolean isIn(String s, int i) {
    return lookup(s,i) != null;
  }
  
  /**
   * @effects returns the cardinality of this
   */
  public int size() {
    return entries.size();
  }

  @Override
  public String toString() {
    if (entries.size() == 0)
      return "StringIntMap:{ }";
    
    String s = "StringIntMap:{ ";
    Entry e;
    int size = entries.size();
    for (int i = 0; i < size; i++) {
      e = entries.get(i);
      s += "<" + e.s + "," + e.i + ">";
      if (i < size-1)
        s += ",";
    }
    return s + " }";
  }
  
  /**
   * @effects <pre>
   *            if this satisfies abstract properties
   *              returns true
   *            else
   *              returns false
   *          </pre>
   */
   public boolean repOK() {
    if (entries == null)
      return false;

    Entry e;
    Entry other;
    int size = entries.size();
    for (int j = 0; j < size; j++) {
      e = entries.get(j);

      if (e == null) {
        // not a pair
        return false;
      }

      /* not needed
      if (s != null && !(s instanceof String)) {
        // key is not string
        return false;
      }

      if (!(i instanceof Integer)) {
        // value is not integer
        return false;
      }
      */
    }

    // check uniqueness
    for (int j = 0; j < size; j++) {
      e = entries.get(j);
      for (int k = j + 1; k < size; k++) {
        other = entries.get(k);
        if ((e.s == null && other.s == null) || 
            (e.s != null && e.s.equals(other.s))) {
          if (e.i == other.i) {
            // duplicate
            return false;
          }
        }
      }
    }

    return true;
  }

  /**
   * An inner class of <tt>StringIntMap</tt> to represent its entry. 
   */
  class Entry {
    private String s;
    private int i;
    public Entry(String s, int i) {
      this.s = s;
      this.i = i;
    }
    
    public String getString() {
      return s;
    }
    
    public int getInt() {
      return i;
    }
    
    public String toString() {
      return "<" + s + "," + i + ">";
    }
  } // end Entry
} // end StringIntMap
