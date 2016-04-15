package hashmap;

/**
 * Created by bingkunyang on 16/2/8.
 */
public class MyMap {
    private int count;
    private Node[] list;
    private static final int DEFAULT_CAPACITY = 3;


    public MyMap() {
        list = new Node[DEFAULT_CAPACITY];
        count = 0;
    }


    public int size() {
        return count;
    }


    public boolean isEmpty() {
        return count == 0;
    }


    public Integer get(String key) {
        int index = getIndex(key);
        if (list[index] == null) {
            return null;
        }
        else {
            Node temp = list[index];
            while (temp != null) {
                if (temp.equalsKey(key)) {
                    return temp.getValue();
                }
                temp = temp.next;
            }
        }
        return null;
    }


    public Integer put(String key, Integer val) {
        int index = getIndex(key);

        Node dummy = new Node();
        dummy.next = list[index];
        Node cur = dummy;

        while (cur.next != null) {
            if (cur.next.equalsKey(key)) {
                Integer oldValue = cur.next.getValue();
                cur.next.setValue(val);
                return oldValue;
            }
            cur = cur.next;
        }

        cur.next = new Node(key, val);
        list[index] = dummy.next;
        count++;
        return null;
    }


    public Integer remove(String key) {
        int index = getIndex(key);

        Node head = list[index];
        Node dummy = new Node();
        dummy.next = head;
        Node prev = dummy;

        Integer value = null;
        while (head != null) {

            if (head.equalsKey(key)) {
                prev.next = head.next;
                count--;
                value = head.getValue();
                break;
            }

            head = head.next;
            prev = prev.next;
        }

        list[index] = dummy.next;
        return value;
    }


    public boolean containsKey(String key) {
        int index = getIndex(key);

        if (list[index] == null) {
            return false;
        }

        Node temp = list[index];
        while (temp != null) {
            if (temp.equalsKey(key)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }


    private int getIndex(String key) {
        if (key == null) {
            return 0;
        }
        return Math.abs(key.hashCode() % DEFAULT_CAPACITY);
    }
}
