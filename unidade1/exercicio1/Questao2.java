import java.util.LinkedList;
/**
 * Codigo Secreto = 1961762906
 * Explicação do código
 * O que a classe faz 
 *
 * @author Ana Sara 
 * @since 13/08/2024
 *
 */ 
import java.util.LinkedList;
import java.util.Random;

public class Questao2 {

    public static void main(String[] args) {
        LinkedList<Integer> numeros = new LinkedList<>();

        Random random = new Random();

        for (int i = 0; i < 9999; i++) {
            int numeroRandomico = random.nextInt(1000) + 1;
            numeros.add(numeroRandomico);
        }
        int menorValor = Integer.MAX_VALUE;

        for (int numero : numeros) {
            if (numero < menorValor) {
                menorValor = numero;
            }
        }
        System.out.println("O menor número positivo é: " + menorValor);
    }
}