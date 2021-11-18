package demkytu;

import jdk.nashorn.internal.objects.NativeString;

import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String str = "alo em oi ";
        String upperStr = str.toUpperCase();
        TreeMap<Character,Integer> map = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {

            if (!map.containsKey(upperStr.charAt(i))) {
                map.put(upperStr.charAt(i), 1);
            } else {
                map.put(upperStr.charAt(i), map.get(upperStr.charAt(i)) + 1);
            }
        }
        Set<Character> keySet = map.keySet();
        for (Character key : keySet) {
            System.out.println(key + " - " + map.get(key));
        }
    }
}
