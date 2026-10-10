import java.util.*;

public class concatStrings {
    public static void main(String[] args) {

        String[] arr = { "Hello", "Dheeraj", "Utakarsh" };
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        System.out.println(sb);

    }
}