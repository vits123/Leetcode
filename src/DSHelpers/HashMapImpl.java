package DSHelpers;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap implements Map<K, V>, Serializable, Cloneable interfaces. HashMap extends AbstractMap
 * class LinkedHashMap is subclass to HashMap class HashMap() is the default constructor which
 * creats the instance of the HashMap with initial capacity 16 and load factor 0.75
 * <p>
 * HashMap makes no guarantee of ordering of map entries will remain constant. HashMap is similar to
 * HashTable but it is unsynchronized. HashSet also uses HashMap internally. HashMap doesn't allow
 * duplicate keys but allows duplicate values. so, single key cannot have more than 1 value but more
 * than 1 key can have same values. HashMap allows only 1 null key and multiple null values.
 * <p>
 * From Java 8 onward, Java started using Self Balancing BST instead of linked list for chaining
 * Advantage of self balancing is when every key maps to the same slot search time is O(log n).
 */

public class HashMapImpl {

  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();
    map.put("Vishal", 10);
    map.put("Sachin", 20);
    map.put("Vaibhav", 30);

    System.out.println("Size of map is: " + map.size());
    System.out.println(map);

    // Check if key is present and print value

    if (map.containsKey("Vishal")) {
      Integer a = map.get("Vishal");
      System.out.println("Value for key " + " \"Vishal\" is:- " + a);
    }

    // HashMap<K, V> hm = new HashMap<K, V>(int initialCapacity);

    HashMap<Integer, String> hm1 = new HashMap<>(5);
    hm1.put(1, "one");
    hm1.put(2, "two");
    hm1.put(3, "three");

    System.out.println("Mappings of HashMap hm1 are: " + hm1);

    // HashMap<K, V> hm = new HashMap<K,V>(Map map);

    Map<Integer, String> hm2 = new HashMap<>();
    hm2.put(4, "Four");
    hm2.put(7, "Seven");
    hm2.put(9, "Nine");

    HashMap<Integer, String> hm3 = new HashMap<>(hm2);

    System.out.println("Mappings of hm2: " + hm2);

    System.out.println("Mappings of hm3: " + hm3);

    // Traversal of HashMap

    HashMap<String, Integer> hmap = new HashMap<>();
    hmap.put("a", 50);
    hmap.put("b", 60);
    hmap.put("c", 70);

    for (Map.Entry<String, Integer> e : hmap.entrySet()) {
      System.out.println(" Key: " + e.getKey() + " Value: " + e.getValue());
    }

    // How to copy 1 HashMap to another?

    Map<String, Integer> hashmap = new HashMap<>();
    hashmap.put("V", 9);
    hashmap.put("E", 1);
    hashmap.put("D", 0);

    Map<String, Integer> second_map = copyMap(hashmap);
    System.out.println("second map is : " + second_map);

    // Using putAll()

    Map<String, Integer> third_map = copyMapUsingPutAll(hashmap);
    System.out.println("third map is : " + third_map);

    // Using Copy constructor

    Map<String, Integer> fourth_map = copyUsingConstructor(hashmap);
    System.out.println("fourth map is : " + fourth_map);

    // HashMap compute() with examples
    /**
     * compute(key, BiFunction) allows you to update a value in HashMap. It tries to compute a mapping
     * for specified key and it's current mapped value (or null if no current mapping is found)
     * 1. If the remapping function passed in method returns null, then mapping is removed from map.
     * 2. If remapping function throws exception then exception is rethrown and current mapping is left unchanged.
     * During computation remapping function should not be able to modify this map.
     * compute() can be used to update an existing value inside hashmap.
     */

    Map<String, String> mp = new HashMap<>();
    mp.put("Name", "Aman");
    mp.put("Address", "KolKata");

    System.out.println("Map :" + mp);

    // remap values using compute
    mp.compute("Name", (K, V) -> V.concat(" Singh"));

    mp.compute("Address", (K, V) -> V.concat(" West-Bengal"));

    System.out.println("New map : " + mp);

    // computeIfAbsent() - This method returns current (existing or computed) value associated with
    // specified key or null if mapping returns null

    HashMap<String, Integer> absent = new HashMap<>();
    absent.put("key1", 10000);
    absent.put("key2", 55000);
    absent.put("key3", 44300);
    absent.put("key4", 53200);

    System.out.println("HashMap :" + absent.toString());

    absent.computeIfAbsent("Key5", K -> 2000 + 33000);
    absent.computeIfAbsent("Key6", K -> 2000 * 34);

    System.out.println("New HashMap : " + absent);

    /**
     * HashMap replace(key, oldValue, newValue)
     *  It is used to replace old value of specified key with new value only if specified key is
     *  mapped with specified old value
     *  replace returns boolean value true if old value is replaced with new otherwise false.
     *  It throws NullPointerException if specified key or value is null.
     */

    /**
     * default void replaceAll(BiFunction<K, V> function)
     * This method replacs each value with the result of applying given function on corresponding value.
     * This continues until all entries are precessed or exception is thrown.
     * It can throw ClassCastException, NullPointerException, ConcurrentModificationException, IllegalArgumentException,
     * UnsupportedOperationException.
     */

    HashMap<String, Integer> mapForReplaceAll = new HashMap<>();
    mapForReplaceAll.put("Tushar", 2000);
    mapForReplaceAll.put("Anushka", 2001);
    mapForReplaceAll.put("Sanskriti", 2003);
    mapForReplaceAll.put("Anuj", 2002);

    // replace yearOfBirth with current age

    mapForReplaceAll.replaceAll((key, yearOfBirth) -> 2021 - yearOfBirth);

    System.out.println("New HashMap after replaceAll() : " + mapForReplaceAll);

    /**
     * The merge(Key, Value, BiFunction) method is used to combine multiple mapped values for a key using given mapping function.
     * If key is not present or mapped to null, it simply outputs the key along with the corresponding value in the hashmap.
     * In case if key is null, it is always mapped to bucket 0 as hash is not calculated for null keys due to NullPointerException.
     */

    HashMap<Integer, String> mapForMerge1 = new HashMap<>();
    mapForMerge1.put(1, "L");
    mapForMerge1.put(2, "M");
    mapForMerge1.put(3, "N");

    HashMap<Integer, String> mapForMerge2 = new HashMap<>();
    mapForMerge2.put(1, "B");
    mapForMerge2.put(2, "G");
    mapForMerge2.put(3, "R");

    mapForMerge2.forEach((key, value) -> mapForMerge1
        .merge(key, value, (v1, v2) -> v1.equalsIgnoreCase(v2) ? v1 : v1 + ", " + v2));

    System.out.println("New HashMap after Merge : " + mapForMerge1);

    /**
     * getOrDefault(key, defaultValue) is used to get the value mapped for specified key. If
     * no value is mapped for given key then default value is returned.
     */

    HashMap<String, Integer> mapFor_getOrDefault = new HashMap<>();
    mapFor_getOrDefault.put("a", 100);
    mapFor_getOrDefault.put("b", 200);
    mapFor_getOrDefault.put("c", 300);
    mapFor_getOrDefault.put("d", 400);

    System.out.println("Given hashmap is : " + mapFor_getOrDefault.toString());
    int k = mapFor_getOrDefault.getOrDefault("y", 500);
    System.out.println("Returned value : " + k);

    /**
     * java.util.HashMap.containsKey() is used to check whether a particular key is mapped into
     * the hashmap or not
     */

    HashMap<Integer, String> mapFor_containsKey = new HashMap<>();
    mapFor_containsKey.put(10, "Geeks");
    mapFor_containsKey.put(15, "4");
    mapFor_containsKey.put(20, "Geeks");
    mapFor_containsKey.put(25, "Welcomes");
    mapFor_containsKey.put(30, "You");

    System.out.println("Is the key '5' present? " + mapFor_containsKey.containsKey(5));

    /**
     * clone() is used to return a shallow copy of the mentioned hashmap. It just creates a
     * copy of the map.
     */

    HashMap<Integer, String> mapFor_clone = new HashMap<Integer, String>();
    mapFor_clone.put(10, "Geeks");
    mapFor_clone.put(15, "4");
    mapFor_clone.put(20, "Geeks");
    mapFor_clone.put(25, "Welcomes");
    mapFor_clone.put(30, "You");

    System.out.println("Cloned hash map : " + mapFor_clone.clone());

    /**
     * values() is used to create a collection out of the values of the map. It returns a collection
     * view of the values in the hashmap
     * The method does not accept any parameters
     */

    HashMap<Integer, String> mapFor_values = new HashMap<>();
    mapFor_values.put(10, "Geeks");
    mapFor_values.put(15, "4");
    mapFor_values.put(20, "Geeks");
    mapFor_values.put(25, "Welcomes");
    mapFor_values.put(30, "You");

    System.out.println("The collection view of map is  : " + mapFor_values.values());

    /**
     * clear() is used to remove all of the elements or mappings from a specified hashmap
     */

    HashMap<Integer, String> mapFor_clear = new HashMap<Integer, String>();

    // Mapping string values to int keys 
    mapFor_clear.put(10, "Geeks");
    mapFor_clear.put(15, "4");
    mapFor_clear.put(20, "Geeks");
    mapFor_clear.put(25, "Welcomes");
    mapFor_clear.put(30, "You");

    mapFor_clear.clear();

    System.out.println("map after using clear : " + mapFor_clear);


  }

  private static Map<String, Integer> copyUsingConstructor(Map<String, Integer> hashmap) {
    return new HashMap<>(hashmap);
  }

  private static Map<String, Integer> copyMapUsingPutAll(Map<String, Integer> hashmap) {
    Map<String, Integer> target_1 = new HashMap<>();
    target_1.putAll(hashmap);
    return target_1;
  }

  private static Map<String, Integer> copyMap(Map<String, Integer> hashmap) {
    Map<String, Integer> target = new HashMap<>();
    for (Map.Entry<String, Integer> x : hashmap.entrySet()) {
      target.put(x.getKey(), x.getValue());
    }
    return target;
  }
}
