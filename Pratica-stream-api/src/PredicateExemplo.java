import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemplo {

    public static void main(String[] args) {
        
        //Criar uma lista de palavras
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "c#", "javascript", "go");
    
        //Cria um Predicate que verifica se a palabra tem mais de 5 caracteres.
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        //Usa o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
        //imprimir cada palavra que passou no filtro.
        palavras.stream().filter(maisDeCincoCaracteres).forEach(p -> System.out.println(p));
    }
}
