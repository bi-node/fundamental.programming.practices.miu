
public class Singleton {
	private static Singleton instance=null;
	
	private Singleton() {
	}
	
	public  void getInstance()
	{
		if(instance==null) {
			new Singleton();
		}
		
	}
	
	public static void main(String[] args) {
		instance=new Singleton();
		
	}

}
