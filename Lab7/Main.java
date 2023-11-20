package Lab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
     //prob2();
        prob4();
    }
       public static void prob2(){
        List <Integer> numereIntregi = Arrays.asList(1,6,81324,42,135,1232,436);
         double v= numereIntregi.stream()
                 .mapToDouble(i-> i.doubleValue())
                 .average()
                 .orElse(0.0);
         System.out.println(v);
    }
    public static void prob3(){
        List<String> lista= Arrays.asList("mere", "pere", "Ion");
        lista.forEach(s->{
            lista.set(lista.indexOf(s), s.toUpperCase());

        });
        System.out.println(lista);
    }

    // list.stream().map(String::toUpperCase).collect(Collectors.toList());
    public static void prob4() {
        List<String> listele = Arrays.asList("mere", "pere", "ion");
        List<String> l= listele.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(l);
    }

}

