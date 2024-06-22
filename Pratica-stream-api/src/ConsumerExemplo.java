import java.util.Arrays;
import java.util.List;
// import java.util.function.Consumer;
// import java.util.function.Predicate;

//Utilizando o consumer<T>, ele aceita um argumento do tipo T e não retorna nenhum resultado.
//É utilizado para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar ou retornar um valor.
public class ConsumerExemplo {
    public static void main(String[] args) throws Exception {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Utilizando o Consumer com expressão lambda:
        // Consumer<Integer> imprimirNumeroPar = numero -> {
        //     if(numero % 2 == 0) {
        //         System.out.println(numero);
        //     }
        // };

        // e utilizando o Consumer para imprimir números pares no Stream com expressão lambda:
        // não precisando nem usar o stream para otimizar mais.
        // filtrar antes de imprimir
        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        
    }
}
