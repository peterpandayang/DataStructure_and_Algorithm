package hashmap;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bingkunyang on 16/2/8.
 */
public class MapTest {
    @Test
    public void testMap() {
        MyMap test = new MyMap();
        Assert.assertEquals(0, test.size());
        Assert.assertEquals(true, test.isEmpty());

        Assert.assertEquals(null, test.put(null, null));
        Assert.assertEquals(null, test.put("test", 1));

        Assert.assertEquals(2, test.size());
        Assert.assertEquals(false, test.isEmpty());
        Assert.assertEquals(1, test.get("test").intValue());
        Assert.assertEquals(1, test.put("test", 2).intValue());
        Assert.assertEquals(2, test.get("test").intValue());
        Assert.assertEquals(null, test.remove("dummy"));
        Assert.assertEquals(2, test.remove("test").intValue());
        Assert.assertEquals(null, test.get("test"));
        Assert.assertEquals(1, test.size());

        Assert.assertEquals(null, test.get(null));
        Assert.assertEquals(null, test.remove(null));
        Assert.assertEquals(0, test.size());
        Assert.assertEquals(true, test.isEmpty());
    }


    @Test
    public void testBigMap() {
        MyMap test = new MyMap();
        for (int i = 0; i < 20; i++) {
            test.put(String.valueOf(i), i);
            Assert.assertTrue(test.containsKey(i + ""));
        }
        Assert.assertEquals(20, test.size());
        Assert.assertEquals(4, test.put("4", 44).intValue());
        Assert.assertEquals(44, test.get("4").intValue());
        Assert.assertEquals(7, test.remove("7").intValue());
        Assert.assertEquals(44, test.put("4", 4).intValue());

        int size = test.size();
        for (int i = 25; i >= 0; --i) {
            Integer old = test.remove(i + "");
            if (old == null) {
                Assert.assertEquals(size, test.size());
            } else {
                Assert.assertEquals(i, old.intValue());
                Assert.assertEquals(--size, test.size());
            }
            Assert.assertFalse(test.containsKey(i + ""));
        }

        Assert.assertEquals(0, test.size());
    }


//    public static void main (String[] arges) {
//        MyMap test = new MyMap();
//        System.out.println(test.size());
//        System.out.println(test.isEmpty());
//
//        System.out.println(test.put(null, null));
//        System.out.println(test.put("test", 1));
//
//        System.out.println(test.size());
//        System.out.println(test.isEmpty());
//
//        System.out.println(test.get("test").intValue());
//        System.out.println(test.put("test", 2).intValue());
//
//        System.out.println(test.get("test").intValue());
//        System.out.println(test.remove("dummy"));
//
//        System.out.println(test.remove("test").intValue());
//        System.out.println(test.get("test"));
//
//        System.out.println(test.get(null));
//        System.out.println(test.remove(null));
//        System.out.println(test.size());
//        System.out.println(test.isEmpty());
//
//    }
}
