package Stream_APi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemplo {
    public static void main(String[] args) {
        //Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso).
        // É comumente usada para filtrar os elementos do Stream com base em alguma condição.

        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() >5;
        palavras.stream()
                .filter(maisDeCincoCaracteres) //filter para filtrar!
                .forEach(System.out::println);

    }
}
