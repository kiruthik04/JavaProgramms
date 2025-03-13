import java.util.*;

class LRUCache<K, V> extends LinkedHashMap<K, V>{
    private final int capacity;

    public LRUCache(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    protected boolean removeEldestEntry(Map.Entry<K, V> eldest){
        return size() > capacity;
    }
}
class CacheSystem {
    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);

        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");

        System.out.println(cache);

        cache.get(1);
        cache.put(4, "D");
        System.out.println(cache);

        cache.put(5, "E");
        System.out.println(cache);
    }
}