import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExemplo {
    public static void main(String[] args) {
        
        //Cria uma lista de números inteiros.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Usar a Function com expressão lambda para dobrar todos os números.
        Function<Integer, Integer> dobrarNumeros = numero -> numero * 2;

        //Usar a função dobrar todos os números no Stream e
        //armazená-los em outra lista.
        List<Integer> numerosDobrados = numeros.stream().map(dobrarNumeros).collect(Collectors.toList());
    
        //Imprimir a lista de números dobrados.
        numerosDobrados.forEach(n -> System.out.println(n));
    }
}
