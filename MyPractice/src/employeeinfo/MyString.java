package employeeinfo;

import java.util.Arrays;

public class MyString {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray;
	private int index;
	
	//constructor class

	public MyString() {
		strArray = new String[INITIAL_LENGTH];
		index = 0;
	}
	
		//finding size of the array

	public int size() {
		return index;
	}
	
	//adding values

	public void add(String s) {
		if (index == strArray.length) {
			resize();
		}
		strArray[index++] = s;
	}

	public boolean remove(String s) {
		int removeIndex = -1;

		for (int i = 0; i < index; i++) {
			if (strArray[i] != null && strArray[i].equals(s)) {
				removeIndex = i;
				break;
			}
		}

		if (removeIndex != -1) {
			if (removeIndex != index - 1) {     //if not the last element
				System.arraycopy(strArray, removeIndex + 1, strArray, removeIndex, index - removeIndex - 1);
			}
			strArray[index - 1] = null;
			index--;
			return true;
		}

		return false;
	}

	public String get(int i) {
		for (String str : strArray) {
			if (str.equals(strArray[i]))
				return str;
		}
		return null;
	}

	public boolean find(String s) {
		for (String str : strArray) {
			if (str != null && str.equals(s)) {
				System.out.println("String Found");
				return true;
			}
		}
		return false;
	}

	public void insert(String s, int pos) {
		if (pos < strArray.length) {
			if (index == strArray.length) {
				resize();
			}
			System.arraycopy(strArray, pos, strArray, pos + 1, index - pos);
			strArray[pos] = s;
			index++;
		}
	}

	private void resize() {
		System.out.println("Resizing...");
		int len = strArray.length * 2;
		strArray = Arrays.copyOf(strArray, len);
	}

	public String toString() {
		
		String str1=String.format("\nThe list of size %d is\t[ ",  index);
		String str2="";
		for(int i=0; i<index-1;i++)
		{
			if(strArray[i]!=null)
			{
				str2+=strArray[i]+", ";
			}
		}
		String str3=String.format("%s ]", strArray[index-1]);
		return str1+str2+str3;
	}

	// Start of the main function.
	public static void main(String[] args) {
		MyString l = new MyString();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.add("Dave");
		System.out.println(l.toString());
		l.remove("Mark");
		l.remove("Bob");
		System.out.println(l.toString());
		l.insert("Richard", 3);
		System.out.println(l.toString());
		l.insert("Tonya", 0);
		System.out.println(l.toString());
		l.insert("Binod", 4);
		System.out.println(l.toString());
		System.out.println(l.find("Susan"));
				System.out.println(l.toString());
	}

}