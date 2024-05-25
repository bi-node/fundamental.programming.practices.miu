package June2022;

import java.util.*;

public class Key {
	private String key;
	
	public Key(String k) {
		this.key = k;
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Key)) return false;
		Key k = (Key)ob;
		return key.equals(k.key);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(key);
	}
//	
}
