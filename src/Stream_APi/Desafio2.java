package Stream_APi;

import java.util.Arrays;
import java.util.List;

public class Desafio2 {
    public static void main(String[] args) {
        //imprima a soma dos números pares da lista
        List<Integer> numeros = Arrays.asList(1, 0, 4, 1, 2, 3, 9, 9, 6, 5);

        int somaDosPares = numeros.stream()
                .filter(n -> n % 2 == 0) // verificando se sao pares
                .mapToInt(numero -> numero) // Converte para um stream de inteiros
                //mapToInt converte para inteiros
                .sum();
        System.out.println(somaDosPares);


    }
}
