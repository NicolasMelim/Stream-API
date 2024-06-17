package Stream_APi;

import java.util.Arrays;
import java.util.List;

public class Desafio1 {
    public static void main(String[] args) {
        //Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
        numerosAleatorios.stream()
                .forEach(System.out::println);
    }
}
