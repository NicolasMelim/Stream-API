package Stream_APi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExemplo {


    // Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
    // É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.


    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // EU PODERIA DIZER QUE ELE É INTEGER E DPS STRING
                //VALOR T, VALOR R
        Function<Integer, Integer> dobrar = numero -> numero *2;

        List<Integer> dobrandoNumeros = numeros.stream()
                .map(n -> n *2) // MAP PARA MAPEAR OS ELEMENTOS!!
                .toList();

        dobrandoNumeros.forEach(System.out::println);
    }
}
