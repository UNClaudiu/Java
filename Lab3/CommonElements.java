package Lab3;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        Set<String> a = new HashSet<>();
        a.add("java");
        a.add("test");
        a.add("university");

        Set<String> b = new HashSet<>();
        b.add("car");
        b.add("university");
        b.add("plane");

        Set<String> commonElements = new HashSet<>(a);
        commonElements.retainAll(b);

        System.out.println(commonElements);
    }
}