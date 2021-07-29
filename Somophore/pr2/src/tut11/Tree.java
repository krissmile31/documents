package tut11;

import java.util.List;
import java.util.Vector;

import utils.DomainConstraint;
import utils.TextIO;

/**
 * @overview A tree is a set of nodes that are connected to to each other by 
 *    edges such that one node, called the root, is connected to some nodes, 
 *    each of these nodes is connected to some other nodes that have not been 
 *    connected, and so on.  
 * 
 *    <p>The following is a <b>bottom-up</b> recursive tree design that incrementally 
 *    builds a new tree by adding roots.
 *    
 * @attributes 
 *   root    Object                 
 *   nodes   Set<Object>            Vector<Object>           
 *   edges   Set<(Object,Object)>   Vector<[Object,Object]>
 *   
 * @object A typical tree T is the tuple <r,N,E>, where 
 *   root(r), nodes(N), and edges(E).  
 *   
 *   <p>Trees are defined recursively as follows: 
 *   Basis
 *    For any node r, T = <r,{r},{}> is a tree. 
 *   Induction
 *    For all natural number k >= 1 and k trees T1, T2,...,Tk 
 *    and for all node r:
 *    r is not in T1,...,Tk -> 
 *      T = <r, 
 *      T1.nodes+...+Tk.nodes+{r}, 
 *      {edge(r,T1.root),...,edge(r,Tk.root)} +T1.edges+...+Tk.edges> is a tree 
 *   
 * @abstract_properties <pre>
 *    mutable(root)=false /\ optional(root)=false  /\ 
 *    mutable(nodes)=true /\ optional(nodes)=false /\
 *    mutable(edges)=true /\ optional(edges)=true  /\ 
 *    root in nodes /\ 
 *    for all n in nodes.
 *      // (i)
 *      (exists p in nodes. parent(n)=p /\ 
 *       for all p, q in nodes. (parent(n)=p /\ parent(n)=q -> p=q)) /\
 *       // (ii)
 *    for all n in nodes.d
 *      (n != root -> exists a sequence of edges from root to n)
 *  </pre>
 *  
 * @author 
 */
public class Tree {
  @DomainConstraint(type="Object",mutable=false,optional=false)
  private Object root;
  @DomainConstraint(type="Vector",mutable=true,optional=false)
  private Vector nodes;
  @DomainConstraint(type="Vector",mutable=true,optional=true)
  private Vector edges;
  
  // constructors
  /**
   * @requires r != null
   * @effects initialise this as <r,{r},{}> 
   */
  public Tree(Object r) {
    // single-node tree
    this.root = r;
    nodes = new Vector();
    nodes.add(r);
  }
  
  /**
   * @requires r != null /\ trees.length >= 1 /\ 
   *   for all t in trees. r not in t.nodes
   *   
   * @effects initialise this as a tree T =  
   *     <r, 
   *     T1.nodes+...+Tk.nodes+{r}, 
   *     {edge(r,T1.root),...,edge(r,Tk.root)} +T1.edges+...+Tk.edges>, 
   *     where Tis are in <tt>trees</tt> 
   */
  public Tree(Object r, Tree...trees) {
    this(r);
    edges = new Vector();
    // this.r = r /\ this.nodes = {r} /\ this.edges = {} 
    Object[] e;
    for (Tree t: trees) {
      nodes.addAll(t.nodes);
      // this.nodes = this.nodes + t.nodes 
      e = new Object[] {r,t.root};
      edges.add(e);
      // this.edges = this.edges + {edge(r,t.root)} 
      if (t.edges != null)
        edges.addAll(t.edges);
    }
  }
   
  /**
   * A recursive procedure to count the number of nodes in a subtree
   * rooted at n. 
   * 
   * @effects 
   *  if n is a leaf
   *    return 1
   *  else 
   *    return the number of nodes in the sub-tree rooted at n
   */
  public int count(Object n) {
    int count = 1; // includes n
    if (edges != null) {
      Object[] e;
      for (Object eobj : edges) {
        e = (Object[]) eobj;
        if (e[0] == n) {  // e[0] is parent
          count += count(e[1]); // e[1]: child of n (recursive call)
        }
      }
    }
    
    return count;
  }
  
  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer();
    toString(sb, 0, root);
    return sb.toString();
  }
  
  /**
   * This is a recursive operation that incrementally constructs the string representation of the 
   * tree/subtree rooted at n. 
   * 
   * @effects 
   *  update <tt>sb</tt> with the string representation of the sub-tree
   *  rooted at <tt>n</tt>. 
   */
  private void toString(StringBuffer sb, int level, Object n) {
    Object[] e;
    
    // append next line
    if (level > 0) {
      sb.append("\n");
      sb.append("|");
    }
    
    for (int i = 0; i < level; i++) {
      sb.append("-");
    }
    
    sb.append(n);
    
    if (edges != null) {
      int thisLevel = level;
      for (Object eobj : edges) {
        e = (Object[]) eobj;
        if (e[0] == n) {  // append this child of n
          if (thisLevel == level)
            level++;
          toString(sb, level, e[1]);  // recursive call to next level
        }
      }
    }
  }
  
  /**
   * @effects 
   * if this satisfies abstract properties
   *  return true
   * else
   *  return false
   */
  public boolean repOK() {
    // root != null
    if (root == null) {
      System.err.println("Tree.repOK: root is null");
      return false;
    }
    
    // nodes != null
    if (nodes == null) {
      System.err.println("Tree.repOK: nodes is not initialised");    
      return false;
    }
  
    
    // root in nodes    
    boolean hasRoot = false;
    for (Object n : nodes) {
      if (n == root) {
        hasRoot=true;
        break;
      }
    }
    
    if (!hasRoot) {
      System.err.println("Tree.repOK: tree does not contain root");    
      return false;    
    }
    
    //  for all n, m in nodes. n neq m    
    Object n, eobj;
    for (int i = 0; i < nodes.size(); i++) {
      n = nodes.get(i);
      for (int j = i+1; j < nodes.size(); j++) {
        if (n == nodes.get(j)) {
          System.err.println("Tree.repOK: duplicate node: " + n);
          return false;
        }
      }
    }
    
    //  for all e, f in edges. e neq f
    if (edges != null) {
      for (int i = 0; i < edges.size(); i++) {
        eobj = edges.get(i);
        for (int j = i+1; j < edges.size(); j++) {
          if (eobj == edges.get(j)) {
            System.err.println("Tree.repOK: duplicate edge: " + eobj);
            return false;
          }
        }
      }        
    }
    
    // check: every non-root node has exactly one parent
    Object[] e;
    Object parent;
    for (Object o : nodes) {
      parent = null;
      if (o != root) {
        for (Object edge : edges) {
          e = (Object[]) edge;
          if (e[1] == o) {
            if (parent == null) {
              parent = e[0];
            } else {
              // invalid: two parents
              System.err.println("Tree.repOK: node has two parents: " + o + " -> ("+parent+","+e[0]+")");    
              return false;
            }
          }
        }
        
        if (parent == null) {
          // invalid: no parents
          System.err.println("Tree.repOK: node has no parents: " + o);              
          return false;
        }
        // o has one parent
      }
    }
    
    // all non-root nodes are reachable from n (i.e. tree is connected)
    // walk the tree from the root and count the number of nodes
    // check that this number is the same as cardinality of nodes
    int count = count(root);
    if (count != nodes.size()) {
      System.err.println("Tree.repOK: tree is not connected");    
      return false;
    }        
    return true;
  }  
  
  /**
   * @effects 
   * if x == y \/ isAncestorOf(x,y) \/ isAncestorOf(y,x)
   *    return null
   * else
   *    return lowest common ancestor of x & y
   */
  public Integer lca(int x, int y) {

  }
  
  /**
   * @requires x==y /\ isAncestorOf(x,y) /\ isAncestor(y,x) == false
   * @effects 
   * lca(x,y) = c, where isAncestorOf(c,x) /\ isAncestorOf(c,y) /\
   *    for all n, where isAncestorOf(c,n) /\ 
   *    isAncestorOf(n,x) = false /\ isAncestorOf(n,y)=false
   *    
   *  n= parent(x)
   *  if isAncestorOf(n, y)
   *     return n
   *  else
   *  return lca(n, y)
   */
  public Object lca (Object x, Object y) {
	  Object n = parent(x);
	  if (isAncestorOf(n,y))
		  return n;
	  return lca(n,y);
	  
  }
  
  /**
   * @effects
   *  foreach edge (parent, child) in this.edge
   *  if child == x
   *     return parent
   *  else
   *     return null
   */
  public Object parent (Object x) {
	  for (Object edge: this.edges) {
		  Object[] e = (Object[]) edge;
		  
		  Object parent = e[0];
		  Object child = e[1];
		  
		  if (child.equals(x)) 
			  return parent;  
	  }
	  return null;
	  
  }
  
  /**
   * @requires x != y
   * @effects
   * if y = this.root
   *    return false
   *    
   * n = parent(y)
   * if x == n 
   *    return true
   * else
   *    return isAncestorOf(x, n)
   */
  public boolean isAncestorOf(Object x, Object y) {
	  if (y.equals(this.root))
		  return false;
	  Object n = parent(y);
	  if (x.equals(n))
		  return true;
	  return isAncestorOf(x, n);  
  }
  
  /**
   * @effects
   * if isLeaf(node)
   *    return node
   * else
   *    return maxString(node, maxLabel(child1), maxLabel(child2),...)
   */
  public String maxLabel(String node) {
	  if(isLeaf(node))
		  return node;
	  return maxString(nodes);
	  
  }
  
  /**
   * @effects return whether node is leaf or not
   */
  public boolean isLeaf(String node) {
	  for(Object edge : this.edges) {
	      Object[] e = (Object[]) edge; 
	      Object parent = e[0];
	      
	      if (parent.equals(node)) 
	          return true;
	      }
	  return false;
  }
  
  /**
   * @effects return string with max length in <tt>strings</tt>
   */
  public String maxString(List<String> strings) {
	  String max = strings.get(0);
	  for(String s: strings) {
	     if(s.length() > max.length())
	        max = s;
	  }
	    return max;
  }
  
  public void preOrder(Object node) {
	  TextIO.put(this.root);
	  for (Object edge: this.edges) {
		  Object[] e = (Object[]) edge;
		  
		  Object parent = e[0];
		  Object child = e[1];
		  
		  TextIO.put(parent);
	      TextIO.put(child);
	  }  
  }
  
  public void postOrder() {
	  for (Object edge: this.edges) {
		  Object[] e = (Object[]) edge;
		  
		  Object parent = e[0];
		  Object child = e[1];
		  
		  TextIO.put(child);
	      TextIO.put(parent);
	  }
	  TextIO.put(this.root);
	  
  }
} // end Tree

