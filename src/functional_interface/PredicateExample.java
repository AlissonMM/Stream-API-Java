package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */
public class PredicateExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

                                          //Method 1

        //Predicate, to verify if the words have more than five characters,
        // then filter them below
       /* Predicate<String> moreThanFiveCha = word -> word.length() > 5;

        words.stream().filter(moreThanFiveCha).forEach(System.out::println);

        */

                                          //Method 2
        /*words.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String word) {
                return word.length() > 5;
            }
        }).forEach(System.out::println);

         */


                                           //Method 3
        words.stream().filter(word -> word.length() > 5).forEach(System.out::println);
    }
}
