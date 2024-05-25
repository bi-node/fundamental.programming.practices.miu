package assignment4_3.employeeinfo;

import java.awt.peer.SystemTrayPeer;
import java.util.Arrays;

import org.w3c.dom.ls.LSOutput;

public class AccountList {
	private final int INITIAL_LENGTH = 2;
	private Account[] strArray;
	private int index;
	
	//constructor class

	public AccountList() {
		strArray = new Account[INITIAL_LENGTH];
		index = 0;
		//System.out.println("Account LIst created");
	}
	
		//finding size of the array

	public int size() {
		return index;
	}
	
	//adding values

	public void add(Account s) {
		if (index == strArray.length) {
			resize();
		}
		strArray[index++] = s;
	}

//	public boolean remove(String s) {
//		int removeIndex = -1;
//
//		for (int i = 0; i < index; i++) {
//			if (strArray[i] != null && strArray[i].equals(s)) {
//				removeIndex = i;
//				break;
//			}
//		}
//
//		if (removeIndex != -1) {
//			if (removeIndex != index - 1) {     //if not the last element
//				System.arraycopy(strArray, removeIndex + 1, strArray, removeIndex, index - removeIndex - 1);
//			}
//			strArray[index - 1] = null;
//			index--;
//			return true;
//		}
//
//		return false;
//	}

	public Account get(int i) {
		for (Account str : strArray) {
			if (str.equals(strArray[i]))
				return str;
		}
		return null;
	}

//	public boolean find(Account st) {
//		for (Account str : strArray) {
//			if (str != null && str.equals(s)) {
//				System.out.println("String Found");
//				return true;
//			}
//		}
//		return false;
//	}

	public void insert(Account s, int pos) {
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
		//System.out.println("Resizing...");
		int len = strArray.length * 2;
		strArray = Arrays.copyOf(strArray, len);
	}

	public Account[]  getAccounts() {
		int j=0;
		
		for(int i=0;i<index; i++)
		{
			if(strArray[i]==null)
			{
				break;
			}
			j++;
		}
		
		Account[] arr=new Account[j];
		System.arraycopy(strArray, 0, arr, 0, j);
		return arr;
		
	}

	// Start of the main function.
	public static void main(String[] args) {
		AccountList l = new AccountList();
		
	}

}