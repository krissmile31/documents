package tut10;

import java.util.ArrayList;
import java.util.List;

public class StringIntMap {
	//inner class
	public class Entry {
		private String text;
		private int value;
		public Entry(String text, int value) {
			this.setText(text);
			this.setValue(value);
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
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
