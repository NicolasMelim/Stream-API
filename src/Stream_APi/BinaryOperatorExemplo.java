package Stream_APi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExemplo {
    public static void main(String[] args) {
        // Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
        // É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        int resultado = numeros.stream()
                .reduce(0, (n1,n2) -> n1+n2); //reduce para redução


        System.out.println("O resultado da soma dos numeros é: " + resultado);

    }
}
