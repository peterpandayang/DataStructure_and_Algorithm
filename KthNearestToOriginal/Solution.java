package KthNearestToOriginal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by bingkunyang on 16/2/21.
 */
class Solution {
    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return x + " " + y;
        }
    }

    static List<Point> findKCloest(List<Point> points, int k) {
        ArrayList<Point> res = new ArrayList<Point>();
        if (points == null || points.size() == 0)
            return res;

        PriorityQueue<Point> kNear = new PriorityQueue<Point>(k,
                new Comparator<Point>() {
                    public int compare(Point a, Point b){
                        return (b.x * b.x + b.y * b.y) - (a.x * a.x + a.y * a.y);
                    }
                });

        for (int i = 0; i < points.size(); i++) {
            Point p = points.get(i);
            if (i < k) {
                kNear.offer(p);
            } else {
                Point temp = kNear.peek();
                if ((p.x * p.x + p.y * p.y) - (temp.x * temp.x + temp.y * temp.y) < 0) {
                    kNear.poll();
                    kNear.offer(p);
                }
            }
        }

        res.addAll(kNear);
        return res;
    }

    public static void main(String[] args) {
        Point p1 = new Point(0, 1);
        Point p2 = new Point(3, 5);
        Point p3 = new Point(-1,3);
        List<Point> point = new ArrayList<Point>();
        point.add(p1);
        point.add(p2);
        point.add(p3);
        point.add(new Point(0, 0));
        System.out.println(findKCloest(point, 41));
    }
}
