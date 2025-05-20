import java.util.Scanner;

public class Ex_3Triangulo {

    final static Scanner LER_TECLADO = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static double lerValorReal() {
        double valor = LER_TECLADO.nextDouble();
        return valor;
    }

    public static String classificarTriangulo(double lado1, double lado2, double lado3) {
        String resultado = null;
        if (lado1 == lado2 && lado1 == lado3) {
            resultado = "Equilátero";
        } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            resultado = "Escaleno";
        } else {
            resultado = "Isósceles";
        }

        return resultado;

    }

    public static void main(String[] args) {
        double lado1 = 0;
        double lado2 = 0;
        double lado3 = 0;
        String tipoTriangulo = null;

        imprimir("Informe o tamanho do lado 1");
        lado1 = lerValorReal();

        imprimir("Informe o tamanho do lado 2");
        lado2 = lerValorReal();

        imprimir("Informe o tamanho do lado 3");
        lado3 = lerValorReal();

        tipoTriangulo = classificarTriangulo(lado1, lado2, lado3);

        String saida = "Triangulo "  + tipoTriangulo;
        imprimir(saida);
    }

}