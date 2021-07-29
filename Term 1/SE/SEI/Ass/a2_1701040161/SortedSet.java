package a2_1701040161;

import utils.*;

import java.util.*;

/**
 * @overview: This represents unbounded, sorted sets of Comparable
 * objects; the objects are sorted in the ascending order based on the
 * result of comparing them using the method Comparable.compareTo.
 * Specifically, for all s: SortedSet, o1, o2: Comparable, y = min(o1,
 * o2), x = max(o1, o2): o1, o2 ∈ s ↔ x ∉ subset(s, first(s), y).
 * @attributes: elements     SortedSet<Comparable>
 * @objects: A typical SortedSet S = {x1...xn}, where x1,...,xn are
 * elements.
 * @abstract_properties: mutable(elements) = true /\ optional(elements) = false
 * @rep_invariant: elements != null /\ elements.size() > 0
 * (for all comparable i. elements[i] is an Object /\
 * for all comparable i,j. (0 <= i < j < elements.size()
 * @author: tungpd
 */
public class SortedSet {


    //<editor-fold desc="Attributes">
    @DomainConstraint(type = "List<Comparable>", mutable = true, optional = false)
    private List<Comparable> elements;
    //</editor-fold>

    //<editor-fold desc="Constructor">
    /**
     * @effect: ga con khong du trinh
     * @param: abcasdawd
     */
    public SortedSet() {
        elements = new ArrayList<>();
    }
    //</editor-fold>

    //<editor-fold desc="Methods">

    /**
     * @effects: if the Set has no comparable x
     * add Comparable x
     * else
     * element exists
     */
    @DOpt(type = OptType.MutatorAdd)
    @AttrRef("elements")
    public void insert(Comparable x) {
        if (lookUp(x) == false) {
            elements.add(x);
            Collections.sort(elements);
        } else {
            System.out.print("Element exists");
        }
    }

    /**
     * @effects: if Set is empty
     * error
     * if input element is not match
     * print error .
     * else
     * remove element.
     */
    @DOpt(type = OptType.MutatorRemove)
    @AttrRef("elements")
    public void remove(Comparable x) {
        if (elements.isEmpty()) {
            System.err.print("\nSet is empty");
        } else if (!lookUp(x)) {
            System.err.print("\nElement not found");
        } else {
            elements.remove(x);
        }
    }

    /**
     * @effects: <pre>
     * 		if Comparable x is in SortedSet
     * 			return true
     * 		else
     * 			return false
     * 	</pre>
     */
    @DOpt(type = OptType.ObserverContains)
    @AttrRef("elements")
    public boolean lookUp(Comparable a) {
        return elements.contains(a);
    }

    /**
     * @effects: if Set is empty
     * print "Set is empty"
     * else
     * return SortedSet size
     */
    @DOpt(type = OptType.ObserverSize)
    public int size() {
        if (elements.isEmpty()) {
            System.out.print("\nEmpty Set!");
        }
        return elements.size();
    }
    /**
     * @effects <pre>
     *  if this is empty
     *     throw EmptyException
     *   else
     *     return a generator that will produce all
     *     the elements of this in sequence.</pre>
     *
     * @requires <tt>this</tt> must not be modified
     *            while the generator is in use
     */
    @DOpt(type=OptType.ObserverIterator)
    public Iterator<Comparable> iterator() throws EmptyException {
        if (size() == 0)
            throw new EmptyException("Sorted.iterator");

        return new SortedSetGen<Comparable>();
    }

    /**
     * @effects if this satisfies abstract properties
     * return true
     * else
     * return false
     */
    @DOpt(type = OptType.Helper)
    public boolean repOK() {
        if (elements == null)
            return false;
        for (int i = 0; i < elements.size(); i++) {
            Object x = elements.get(i);
            if (!(x instanceof Integer))
                return false;
            for (int k = i + 1; k < elements.size(); k++) {
                if (elements.get(k).equals(x))
                    return false;
            }
        }
        return true;
    }

    /**
     * @effects: print SortedSet to screen
     */

    @DOpt(type = OptType.Default)
    @Override
    public String toString() {
        if (size() == 0)
            return "SortedSet:{ }";

        String s = "SortedSet:{" + elements.get(0).toString();
        for (int i = 1; i < size(); i++) {
            s = s + " , " + elements.get(i).toString();
        }

        return s + "}";
    }
    //</editor-fold>

    //<editor-fold desc="Generator">

    /**
     * @overview
     *   SortedSet.SortedSet represents a generator of the
     *   elements of an SortedSet.
     * @attributes
     *  index Integer
     * @abstract_properties
     *  mutable(ind)=false /\ min(ind)=0 /\
     *  ind<SortedSet.size() /\
     *  SortedSet.new = [x1,...] where
     *    each xi is in SortedSet.SortedSet and
     *    xis are arranged in same order as
     *         SortedSet.SortedSet's elements.
     */
    private class SortedSetGen<T> implements Iterator<Comparable> {
        @DomainConstraint(type = "Integer", mutable = false, min = 0)
        private int index;

        // constructor
        public SortedSetGen() {
            index = 0;
        }

        /**
         * @effects: if there are more elements to yield
         * return true
         * else return false
         */
        @Override
        public boolean hasNext() {
            return index < elements.size();
        }

        /**
         * @effects <pre>
         * 		if there are more results to yield
         * 				 returns the next result
         *          	 modifies the state
         *      else
         *          	 throws NoSuchElementException
         *          </pre>
         */
        @Override
        public Comparable next() throws NoSuchElementException {
            if (hasNext() == true) {
                Comparable nextEl = elements.get(index);
                index++;
                return nextEl;
            } else {
                throw new NoSuchElementException("ArrayList.iterator");
            }
        }
    }
    //</editor-fold>
}
