package hashmap;

/**
 * Created by bingkunyang on 16/2/8.
 */
public class Node {
    private Integer val;
    private String key;
    Node next;
    Node (String key, Integer val) {
        this.key = key;
        this.val = val;
        this.next = null;
    }

    Node() {
        key = "";
        val = null;
        next = null;
    }

    public Integer getValue() {
        return val;
    }

    public void setValue(Integer value) {
        val = value;
    }

    public String getKey() {
        return key;
    }

    public boolean equalsKey(String key) {
        if (this.key == null) {
            return key == null;
        }
        return this.key.equals(key);
    }


}
