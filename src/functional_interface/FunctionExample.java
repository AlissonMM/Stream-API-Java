package functional_interface;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
 */
public class FunctionExample {

    public static void main (String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //Funcion doubleIt double the numbers of a list, using lambda expression

                                  //Method 1
       /* Function<Integer, Integer> doubleIt = number -> number * 2;

        List<Integer> doubledNumbers = numbers.stream().map(doubleIt).toList();

        doubledNumbers.forEach(System.out::println);
        */

                                  //Method 2

       /* List<Integer> doubledNumbers = numbers.stream().map(
                new Function<Integer, Integer>() {
                    @Override
                    public Integer apply(Integer n) {
                        return n * 2;
                    }
                }


        ).toList();

        doubledNumbers.forEach(System.out::println);


        */

                                   //Method 3

        List<Integer> doubledNumbers = numbers.stream().map(n -> n * 2).toList();
        doubledNumbers.forEach(System.out::println);
    }
}
