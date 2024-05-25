package employeeinfo;

import java.util.Arrays;


public class AccountList {
    private final int INITIAL_LENGTH = 2;
    private Account[] strArray;
    private int index;

    public AccountList() {
        strArray = new Account[INITIAL_LENGTH];
        index = 0;
    }

  
    public int size() {
        return index;
    }

    public void add(Account s) {
        if (index == strArray.length) {
            resize();
        }
        strArray[index++] = s;
    }

    public boolean remove(Account s) {
        int removeIndex = Arrays.asList(strArray).indexOf(s);
        if (removeIndex != -1) {
            if (removeIndex == index - 1) {
                strArray[removeIndex] = null;
                index--;
            } else {
                System.arraycopy(strArray, removeIndex + 1, strArray, removeIndex, index - removeIndex - 1);
                index--;
            }
            return true;
        }
        return false;
    }

    public Account get(int i) {
        for (Account str : strArray) {
            if (str.equals(strArray[i])) return str;
        }
        return null;
    }

    public boolean find(Account s) {
        for (Account str : strArray) {
            if (str!=null&& str.equals(s)) {
                System.out.println("String Found");
                return true;
            }
        }
        return false;
    }

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
        System.out.println("Resizing...");
        int len = strArray.length * 2;
        strArray = Arrays.copyOf(strArray, len);
    }

    public void toString1() {
        System.out.print("\nThe list of size " + index + " is ");
        System.out.print("[ ");
        for(int i=0; i<strArray.length; i++)
        {
           if(strArray[i]!=null)
        	System.out.print(strArray[i]+" ");
        }
        System.out.print(" ]");
    }
}
