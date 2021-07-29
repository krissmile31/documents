package tut10;

import java.util.ArrayList;
import java.util.List;

public class StringIntMap {
	//inner class
	public class Entry {
		private String text;
		private int value;
		public Entry(String text, int value) {
			this.text = text;
			this.value = value;
		}
	}
	private List<Entry> entries;
	
	public StringIntMap() {
		this.entries = new ArrayList<StringIntMap.Entry>();	
	}
	public void addEntry(String text, int value) {
		Entry entry = new Entry (text, value);
		this.addEntry(entry);
	}
	public void addEntry(Entry entry) {
		this.entries.add(entry);
	}
	

}
