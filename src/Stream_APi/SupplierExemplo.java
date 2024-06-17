package Stream_APi;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExemplo {
    public static void main(String[] args) {
//Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
// É comumente usada para criar ou fornecer novos objetos de um determinado tipo.

        //SEM ARGUMENTO OLHA () ;
        Supplier<String> saudacao = () -> "Ola mundo";

        List<String> listaSudacao = Stream.generate(() -> "Olá mundo")
                .limit(5) //dizendo quantas vezes quero imprimir a frase
                .toList();// transformando em lista!

        //IMPRIMINDO COM O METHOD REFERENCE
        listaSudacao.forEach(System.out::println);
    }

}
