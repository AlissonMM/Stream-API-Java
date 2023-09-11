package functional_interface;


import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
public class SupplierExample {
    public static void main(String[] args) {

        //There is no parameters, cause it just returns something

       /* Supplier<String> salutation = () -> "Welcome, good lad";*/

        //List of salutations, limited by 5 items
        //Stream.generate has a Supplier as a parameter
       /* List<String> salutationsList = Stream.generate(salutation)
        .limit(5)
              /*  .collect(Collectors.toList());*/
             /*   .toList();*/

                //using lambda
               /* salutationsList.forEach(s -> System.out.println(s));*/


      /*  List<String> salutationsList = Stream.generate(
                        new Supplier<String>() {

                            @Override
                            public String get() {
                                return "Welcome, good lad";
                            }
                        }
                )

                .limit(5)
                .toList();*/

        List<String> salutationsList = Stream.generate( () -> "Welcome, good lad")
                        .limit(5)
                                .toList();

        salutationsList.forEach(System.out::println);
    }

    }

