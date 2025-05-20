import java.util.Scanner;

public class Condicional {

    public static Scanner tecladoScanner = new Scanner(System.in);

    // método que recebe um texto e imprime na tela
    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static double lerValorReal() {
        double valor;
        valor = tecladoScanner.nextDouble();
        return valor;
    }

    public static int lerValorInteiro() {
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;
    }

    public static void main(String[] args) {
        int nota = 0;
        nota = lerValorInteiro();

        if (nota >= 9){
            imprimir("Nota A");
        }else if (nota >= 8) {
            imprimir("Nota B");
        }else if (nota >= 7) {
            imprimir("Nota C");
        }
        else {
            imprimir("Nota D");
        }

        imprimir("FIMMMM");
    }

    
}

    



