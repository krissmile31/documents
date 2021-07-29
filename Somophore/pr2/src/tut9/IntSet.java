package tut9;

import java.util.Vector;

public class IntSet {
	private Vector elements;

	public IntSet(Vector els) {
		if (!validateElements(els)) {
			System.err.println("Invalid elements= " + els);
			return;
		}
		elements = new Vector();
		for (Object o : els)
			elements.add(o);
	}

	// copy the object references over to IntSet.elements
	public IntSet(Object[] els) {
		elements = new Vector();
		for (Object o : els)
			elements.add(o);
	}

	public Object[] getElements() {
		if (elements.size() == 0)
			return null;
		else {
			Object[] els = new Object[elements.size()];
			for (int i = 0; i < elements.size(); i++)
				els[i] = elements.get(i);
			return els;
		}
	}

	public void add(Object o) {
		if (!this.elements.contains(o))
			this.elements.add(o);
	}

	public boolean validateElements(Vector elements) {
		for (int i = 0; i < elements.size(); i++) {
			for (int j = i + 1; j < elements.size(); j++) {
				if (elements.get(i) == elements.get(j))
					return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		if (elements != null) 
			return "IntSet [elements=" + elements + "]";
		else
			return "IntSet<null>";
	}

}
