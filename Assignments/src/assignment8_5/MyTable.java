package assignment8_5;
public class MyTable {
	private Entry[] entries = new Entry[26];
	
	//returns the String that is matched with char c in the table
	public String get(char c){
		//implement
		int index = c - 'a'; // Calculate index based on character
        if (index >= 0 && index < entries.length && entries[index] != null) {
            return entries[index].getStr();
        }
        return null;
	}
	//adds to the table a pair (c, s) so that s can be looked up using c 
	public void add(char c, String s) {
		//implement
		 int index = c - 'a'; // Calculate index based on character
	        entries[index] = new Entry(s, c);
	}
	//returns a String consisting of nicely formatted display
	//of the contents of the table
	public String toString() {
		 StringBuilder result = new StringBuilder();
		    for (Entry entry : entries) {
		        if (entry != null) {
		            result.append(entry.toString()).append("\n");
		        }
		    }
		    return result.toString();
	}
	
	
	private class Entry {
		String str;
		char ch;
		Entry(String str, char ch){
			//implement
			this.str=str;
			this.ch=ch;
		}
		public String getStr() {
			return this.str;
			
		}
		//returns a String of the form "ch->str" 
		public String toString() {
			return ch+"->"+str;
		}
	}
	public static void main(String[] args) {
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('c',"Charlie");
		String s = t.get('b');
		System.out.println(s);
		System.out.println(t.toString());
		
		
	}

}