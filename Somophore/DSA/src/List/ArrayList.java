package List;

public class ArrayList {
	/**
	 * @effects 
	 * 1. create an empty list
	 * 2. check empty
	 * 3. check length
	 * 4. add
	 * 5. remove item
	 * 6. remove all
	 * 7. retrieve item
	 * 
	 */
	// size is fixed at runtime
	private int[] items;
	private static final int maxSize = 100;
	private int length;
	
	// constructor
	public ArrayList() {
		items= new int [maxSize];
		length = 0;
	}
	public boolean isEmpty() {
		if (length == 0)
			return true;
		else
			return false;			
	}
	public int getLength() {
		return length;
	}
	public void add(int pos, int newItem) {
		if (length < maxSize) {
			length++;
			for(int i = length -1; i>pos; i--) 
				items[i] = items[i-1];
			items[pos-1] = newItem;   //pre-number
			}
		}
    public void remove(int pos) {
    	for (int i = pos-1; i< length; i++)
    		items[i] = items[i+1];
    	length--;
  
    }

    public void removeAll() {
    	length = 0;
    }
    public int get(int pos) {
    	return items[pos-1];
    }
}
