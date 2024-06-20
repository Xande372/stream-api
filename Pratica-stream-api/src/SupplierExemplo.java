import java.util.List;
// import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExemplo {
    public static void main(String[] args) {
    
        //Usa o supplier com expressão lambda para entregar uma saudação personalizada.
        // Supplier<String> saudacao = () -> "Olá, sejam bem-vindos(a)!";

        //Usa o supplier para obter uma lista com 5 saudações.
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, sejam bem-vindos(a)!")
        .limit(5)
        .collect(Collectors.toList());

        //Imprimir as saudações geradas.
        //forEach se utiliza de um consumer.
        //convertido para method reference.
        listaSaudacoes.forEach(System.out::println);
    }
}
