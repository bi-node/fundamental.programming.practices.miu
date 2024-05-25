package June2022;

import java.util.HashMap;

public class Main {
	HashMap<Key, Record> map = new HashMap<>();
	Key defaultKey = new Key("secret");
	
	public Main() {
		map.put(defaultKey, new Record("001","data"));
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		Key k = new Key("secret");
		
		System.out.println(k.equals(m.defaultKey));
		Record recFound = m.map.get(k);
		System.out.println(recFound);
		
		System.out.println(k.hashCode() + " " + m.defaultKey.hashCode());
	}

}
