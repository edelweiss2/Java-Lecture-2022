package ch13_generic;

public class Q04_Util {
	public static <K,V> V getValue(Q04_Pair<K,V> p, K k) {
		if (p.getKey().equals(k)) {
			return p.getValue();
		} else {
			return null;
		}
	}
	
//	public static <P extends Q04_Pair<K, V> K, V> V getValue(P p, K k) {
//		if (p.getKey().equals(k)) {
////			return p.getValue();
////		} else {
//			return null;
//		}
//	}
}
