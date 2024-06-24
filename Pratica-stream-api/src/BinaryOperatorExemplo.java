import java.util.Arrays;
import java.util.List;
// import java.util.function.BinaryOperator;

public class BinaryOperatorExemplo {

    public static void main(String[] args) {
        
        //Cria uma lista de números inteiros.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Usa o BinaryOperator com expressão lambda para somar dois números inteiros.
        // BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        //Usa o BinaryOperator para somar todos os números no Stream.
        int resultado = numeros.stream()
            .reduce(0, (n1, n2) -> n1 + n2);
        

        //Imprime o resultado final.
        System.out.println("A soma de todos os números é: " + resultado);
    }
}
