import java.util.Scanner;

public class Aula {

    final static Scanner teclado = new Scanner(System.in);

    public static int lerInteiro() {
        int valor = teclado.nextInt();
        return valor;
    }

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static void processar(int inicio, int fim) {
        int i = 0;
        String texto;

        for (i = inicio; i <= fim; i = i + 1) {
            texto = "" + i;

            // Saída
            imprimir(texto);
        }

    }

    public static void main(String[] args) {

        // Variáveis
        int inicio = 0;
        int fim = 0;

        // Leitura de valores
        imprimir("Valor inicial");
        inicio = lerInteiro();
        imprimir("Valor final");
        fim = lerInteiro();

        // Processamento
        processar(inicio, fim);

        // Saída
        processar(inicio, fim);
    }
}