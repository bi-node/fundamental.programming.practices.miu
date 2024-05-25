package FinalTerm3;


public class SearchForString {
	String[] arr;
	SearchForString (String[] arr)
	{
		this.arr=arr;
		
	}
	public boolean search(String s)
	{
		return recurSearch(s, arr.length-1);
		
	}
	private boolean recurSearch(String s, int upperIndex){
		if(upperIndex<0) return false;	
		else {
			boolean isEqual=s.equals(arr[upperIndex]);
			upperIndex-=1;
			if(isEqual) return true;
			else 
			return recurSearch(s, upperIndex);
		}
			
		
	}
	
	public static void main(String[] args) {
		String[] arr= {"Binod", "Toyam", "Sabina", "Maya"};
		SearchForString sfs=new SearchForString(arr);
		System.out.println(sfs.search("Maya"));
		
	}

}
