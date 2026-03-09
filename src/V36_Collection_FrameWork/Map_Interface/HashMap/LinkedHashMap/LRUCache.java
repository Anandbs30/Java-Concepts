package V36_Collection_FrameWork.Map_Interface.HashMap.LinkedHashMap;

import java.util.LinkedHashMap;

public class LRUCache<K, V> extends LinkedHashMap<K, V>{
	
	private int capacity;
	
	public LRUCache(int cap) {
		super(cap, 0.75f, true);
		this.capacity = cap;
	}
	
	//to make LRU(least recently used) active then we have to override the LinkedHashMap method removeEldestEntry().
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		// So here below will return the boolean value as true or false her in the below case whenever size is increased then.
		//then it will return the false. and the initial one is removed.
		return size() > capacity;
	}
	//NOTE : get is accessing method and also as we know put is also an accessing method where it will update the value.
	public static void main(String[] args) {
		LRUCache<String, Integer> lruCache = new LRUCache<>(3);
		lruCache.put("Bob", 90);
		lruCache.put("Alice", 91);
		lruCache.put("Ram", 92);
		System.out.println(lruCache);//this will print : {Bob=90, Alice=91, Ram=92}
		lruCache.get("Bob");//after this the linkedHashMap is changes as given : {Alice=91, Ram=92, Bob=90} as here we are using or accessing the key.
		lruCache.put("Lalita", 94);//After this the removeEldestEntry method called and remove the initial value of the LInkedHashMap that is Alice.
		System.out.println(lruCache);//FInally the LinkedHashMap is becomes : {Ram=92, Bob=90, Lalita=94}
		//if you write here as another put method then from the above Bob is removed as its an top value.
		lruCache.put("Anand", 93);
		System.out.println(lruCache);//this will print : {Alice=91, Ram=92, Anand=93}
		
		//but you know that if we access an element or a key then that will become at the end.
		//here note that you need to use get method before the put method then only that will work other wise.
		//the new put method uses the initial LinkedHashMap and remove the Bob it self
		lruCache.get("Bob");//But if you use this method before new put method then Alice will be deleted. refer 28, 29 lines.
		System.out.println(lruCache);//This will print {Alice=91, Ram=92, Anand=93}
		
	}

	
}
