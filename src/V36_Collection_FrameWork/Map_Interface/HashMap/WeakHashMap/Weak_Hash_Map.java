package V36_Collection_FrameWork.Map_Interface.HashMap.WeakHashMap;

import java.util.Map;
import java.util.WeakHashMap;

/*
 * Before this you to know about the GarbageCollection.
 * The WeakHashMap is extends the AbstractMap<K, V> and implements Map<K, V> 
 * Example explanation : we are using an editing application and while editing we are initially using an image continuously and after some time we
 * are using another image so at the time of continuous usage we have to store that into cache memory and once we stop usage of that image then that
 * image will removed from the cache.
 */
public class Weak_Hash_Map {
	public static void main(String[] args) {
		WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
		
		//creating the values : 
		//Here below img1 and img2 are string literals which are stored into the String pool and they have the strong referral thought the program
		//life cycle.
		imageCache.put("img1", new Image("Image 1"));
		imageCache.put("img2", new Image("Image 2"));
		
		//through the above we can't make garbage collection after suggesting the jvm for the garbage as img1 and img2 have strong referral from string pool.
		System.out.println(imageCache);
		simulateApplicationRunning();
		System.gc();//here we are suggesting the JVM for the Garbage collection.
		System.out.println("Cache after running (here some entries are may be cleared..)"+imageCache);//might be this will print the values.
		
		//To avoid the strong referral we have to create objects as given below : 
		WeakHashMap<String, Image> imageCache1 = new WeakHashMap<>();
		
		imageCache1.put(new String("P1"), new Image("Picture 1"));
		imageCache1.put(new String("P2"), new Image("Picture 2"));
		System.out.println(imageCache1);
		System.gc();
		simulateApplicationRunning();
		System.out.println("Cache after running (here some entries are may be cleared..)"+imageCache1);//might be this will print the values.
		
		//We can load the cache through the method as given below.
		WeakHashMap<String, Image> imageCache2 = new WeakHashMap<>();
		loadCache(imageCache2);
		System.out.println(imageCache2);
		System.gc();
		simulateApplicationRunning();
		System.out.println("Cache after running (here some entries are may be cleared..)"+imageCache2);//might be this will print the values.
		
	}
	
	public static void loadCache(Map<String, Image> imageCacheByMethod) {
		//The p3 and p4 strong reference scope will be present till the method only. due to this reason will get as null values after 5 second.
		String p3 = new String("P3");
		String p4 = new String("P4");
		imageCacheByMethod.put(p3, new Image("Picture 3"));
		imageCacheByMethod.put(p4, new Image("Picture 4"));
	}
	
	//creating an method where we are making an simulateApplicationRunning() method which is basically make main thread sleep.
	
	public static void simulateApplicationRunning() {
		try {
			System.out.println("Simulating Application is running........");
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Image{
	private String name;
	
	public Image(String n) {
		this.name = n;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
