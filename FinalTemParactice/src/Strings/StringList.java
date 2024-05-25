package Strings;

import javax.sound.midi.Soundbank;

public class StringList {
	private String[] strArray;
	private int size;

	public StringList() {
		strArray = new String[5];
		size = 0;
	}

	public void add(String s) {
		
		if (size() > strArray.length-1)
				resize();
		strArray[size++] = s;

	}

	public String get(int i) {
		if(i < 0 || i >= size){
			return null;
		}
		return strArray[i];
	}

	public boolean find(String s) {
		for (int i = 0; i < size(); i++) {
			if (s.equals(strArray[i]))
				return true;
		}
		return false;

	}

	public boolean remove(String s) {
		if (size() < 1 || !find(s))
			return false;
		else {
			int index = 0;
			for (int i = 0; i < size(); i++) {
				if (s.equals(strArray[i])) {
					index = i;
					break;
				}

			}
			String[] temp = new String[size() - 1];

			System.arraycopy(strArray, 0, temp, 0, index);
			System.arraycopy(strArray, index + 1, temp, index, size() - index - 1);
			strArray = temp;
			size--;

			return true;
		}
	}

	public int size() {
		return size;
	}

	private void resize() {
		System.out.println("Resizing.........");

		int len = strArray.length;
		String[] temp = new String[len * 2];
		System.arraycopy(strArray, 0, temp, 0, len);
		strArray = temp;

	}

	@Override
	public String toString() {
		
		if(!(size()==0)) {
			StringBuffer sb = new StringBuffer();
	
		String s1 = String.format("The List of size %d is  [", size());
		sb.append(s1);

		for (int i = 0; i < size(); i++) {

			if (i != size() - 1) {
				sb.append(strArray[i] + " , ");
			} else {
				sb.append(strArray[i]);
			}
		}
		sb.append("]");

		return sb.toString();
		}
		
	 return "The List is Empty";
	}
	
public static void main(String[] args) {
	StringList sl=new StringList();
	sl.add("Ram");
	sl.add("Har");
	sl.add("Ishori");
	System.out.println(sl.toString());
	sl.remove("Ram");
	System.out.println(sl.toString());
	sl.remove("Har");
	System.out.println(sl.toString());
	sl.remove("Ishori");
	System.out.println(sl.toString());
	
	
	
	
	
	
	
	
}
}
