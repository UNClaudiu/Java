package Lab8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args) {
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 4, 2, 3, 5, 6, 1,2,3,45,6,12,543,12,2,2,8,77,44);
        List<Integer> distinctNumbers = numbersWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Lista originala: " + numbersWithDuplicates);
        System.out.println("Lista duplicatelor: " + distinctNumbers);
    }
}
