package June2022;

public class SearchForString {
	private String[] arr;

	public SearchForString(String[] arr) {
		this.arr = arr;
	}

	public boolean search(String s) {		
		return recurSearch(s, arr.length-1);
	}

	private boolean recurSearch(String s, int upperIndex) {
		if(upperIndex == -1) return false;
		if(arr[upperIndex].compareTo(s) == 0) return true;		
		return recurSearch(s, upperIndex-1);
	}

	public static void main(String[] args) {
		String[] arr = {"Hi","Hello","Hi"};
		SearchForString obj = new SearchForString(arr);
		System.out.println(obj.search("Yes"));
		System.out.println(obj.search("Hi"));
	}
}
