package Lab6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
     List<Book>listadecarti = new ArrayList<>();
     List<String>listadestring=new ArrayList<>();

     listadecarti.add(new Book("cartea1", "ION","1345678"));
     listadecarti.add(new Book("carte2","Ionica","34567890"));
     Book cartea1 =listadecarti.get(1);
     listadecarti.contains(cartea1);
     listadecarti.forEach(element->{
         System.out.println(element.getName());
         System.out.println(listadecarti.indexOf(element));
     });
     listadecarti.stream()
             .filter(e -> e.getISBN().length()>10)
             .map(a->a.getAuthor())
             .toList();


    }
}
