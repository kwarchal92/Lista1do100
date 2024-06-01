package Lista1do100;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        //generuje wszystkie liczby 1 do 100
        List<Integer> liczby = IntStream.rangeClosed(1, 100)
                .boxed() //opakowanie
                .collect(Collectors.toList()); //umieszcza liczby na liscie

        System.out.println(liczby); //wydruk listy
    }
}
