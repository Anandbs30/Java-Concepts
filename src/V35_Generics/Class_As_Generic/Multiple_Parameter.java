package V35_Generics.Class_As_Generic;

public class Multiple_Parameter<K, V> {
	private K key;
	private V value;
	
	public Multiple_Parameter(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
}
