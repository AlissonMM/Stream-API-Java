package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */
public class ConsumerExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 8);

        // Use Consumer with lambda expression to print even numbers

        /*
        Consumer<Integer> PrintEvenNumbers = number -> {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        };

         */
        //stream.forEach receives Consumer

        /*
        numbers.stream().forEach(new Consumer<Integer>() {

            //Consumer is abstract, so we need to Override the accept method,
            //which is a void, we will put the arguments

            @Override
            public void accept(Integer n) {
                if (n % 2 == 0) {
                    System.out.println(n);
                }
            }
        });

         */

        //Smaller, and better way to use Consumer, within lambda expression
        numbers.forEach(n -> {
            if (n % 2 == 0){
                System.out.println(n);
            }
        });
    }

}

