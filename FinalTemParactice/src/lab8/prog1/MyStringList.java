package lab8.prog1;

public class MyStringList {
	private final int INITIAL_LENGTH = 4;
	private String[] strArray; 
	private int size;
	
	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}
	
	/******* sorting methods ********/
	public void minSort(){
		//implement
		if(strArray==null || size()<=0) return ;
		int len=size();
		for(int i=0; i<len;i++)
		{
			int minIndex=minpos(i, len-1);
			swap(i, minIndex);
		}
		
		
		
	}
	void swap(int i, int j){
		//implement
		String temp=strArray[i];
		strArray[i]=strArray[j];
		strArray[j]=strArray[i];
		
		
	}
	//find minimum of arr between the indices bottom and top
	public int minpos(int bottom, int top){		
		//implement
		String min=strArray[bottom];
		int minposition=bottom;
		for(int i=bottom+1; i<=top; i++)
		{
			if(min.compareTo(strArray[i])>0)
			{
				min=strArray[i];
				minposition=i;
			}
			
		}
		return minposition;
	
	}

	/********* end sorting methods ********/
	
	/******** binary search methods ********/
	
	//search a sorted array
	boolean binSearchIt(String val) {
	    //implement
		int lower=0;
		int upper=size()-1;
		if(size()<=0|| strArray==null) return false;
		for(int i=0; i<size();i++)
		{
			if(lower>upper) return false;
			int mid=(lower+upper)/2;
			if(strArray[mid]==val) return true;
			if(val.compareTo(strArray[mid])<0)
				upper=mid-1;
			if(val.compareTo(strArray[mid])>0)
				lower=mid+1;
		}
		return false;
	}

	/********* end binary search methods *****/
	
	public void add(String s){
		if(size == strArray.length) resize();
		strArray[size++] = s;
	}
	
	public String get(int i){
		if(i < 0 || i >= size){
			return null;
		}
		return strArray[i];
	}
	
	public boolean find(String s){
		for(String test : strArray){
			if(test.equals(s)) return true;
		}
		return false;
	}
	
	public void insert(String s, int pos){
		if(pos > size) return;
		if(pos >= strArray.length||size+1 > strArray.length) {
			resize();
		}
		String[] temp = new String[strArray.length+1];
		System.arraycopy(strArray,0,temp,0,pos);
		temp[pos] = s;
		
		System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos);
		strArray = temp;
		++size;
		
	}
	
	public boolean remove(String s){
		if(size == 0) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			if(strArray[i].equals(s)){
				index = i;
				break;
			}
		}
		if(index==-1) return false;
		String[] temp = new String[strArray.length];
		System.arraycopy(strArray,0,temp,0,index);
		System.arraycopy(strArray,index+1,temp,index,strArray.length-(index+1));
		strArray = temp;
		--size;
		return true;
	}
	
	
	private void resize(){
		System.out.println("resizing");
		int len = strArray.length;
		int newlen = 2*len;
		String[] temp = new String[newlen];
		System.arraycopy(strArray,0,temp,0,len);
		strArray = temp;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(strArray[i]+", ");
		}
		sb.append(strArray[size-1]+"]");
		return sb.toString();
	}
	public int size() {
		return size;
	}

	public static void main(String[] args){
		String[] testArr = {"big", "small", "tall", "short", "round", "tiny","square", "enormous","gargantuan", "lilliputian", "numberless", "none", "vast", "miniscule"};
		MyStringList list = new MyStringList();
		for(int i = 0; i < testArr.length; ++i) {
			list.add(testArr[i]);
		}
		list.minSort();
		System.out.println("The list in sorted order:");
		System.out.println(list.toString());
		System.out.println();
		System.out.println("\"number\" is in the list? "+list.binSearchIt("number"));
		System.out.println("\"Enourmous\" is in the list? "+list.binSearchIt("enormous"));
	}

}
