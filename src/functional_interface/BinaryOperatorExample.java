package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
 * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
 */
public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

                                          //Method 1

        /*BinaryOperator<Integer> sum = (num1, num2) -> num1 + num2;*/
        //Same thing, but using method reference
        BinaryOperator<Integer> sum = Integer::sum;

        //It starts with 0, and the second parameter tells what to do with it
        //In this case it will sum the following numbers from the list "numbers"
       /* int result = numbers.stream().reduce(0, sum);

        System.out.println("Sum of the numbers is: " + result);

        */

                                          //Method 2
        /*int result = numbers.stream().reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer n1, Integer n2) {

                return n1 + n2;
            }
        });

        System.out.println("Sum of the numbers is: " + result);

         */

                                          //Method 3
        /*int result = numbers.stream().reduce(0,(n1, n2) -> n1 + n2);*/
        int result = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum of the numbers is: " + result);
    }
}
