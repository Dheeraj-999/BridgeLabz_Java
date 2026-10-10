import java.util.*;

public class Time {
    public static void main(String[] args) {
        int n = 100000;

        StringBuffer sb = new StringBuffer();
        long start1 = System.nanoTime();

        for (int i = 0; i < n; i++) {
            System.out.println("hello");
        }
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // StringBuilder
        StringBuffer sbu = new StringBuffer();
        long start2 = System.nanoTime();

        for (int i = 0; i < n; i++) {
            System.out.println("hello");
        }
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        System.out.println("String buffer time(in nanosec): " + time1);
        System.out.println("String builder time: " + time2);

    }
}