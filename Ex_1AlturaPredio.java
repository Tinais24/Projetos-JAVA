import java.util.Scanner;

public class Ex_1AlturaPredio {

        public static Scanner tecladoScanner = new Scanner (System.in);
        
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

        public static double calcularAlturaPredio(double alturaAndares, int qntAndares) {
            double resultado;
            resultado = alturaAndares * qntAndares;
            return resultado;
        }

    public static void main (String[] args) {
        double alturaAndares;
        int qntAndares;
        double alturaPredio;
        String saida;

        //entrada
        imprimir("Informe a altura dos andares");
        alturaAndares = lerValorInteiro();

        imprimir("Informe a quantidade de andares");
        qntAndares = lerValorInteiro();

        //processamento
        alturaPredio = calcularAlturaPredio(alturaAndares, qntAndares);

        //saida
        saida = "A altura do prédio é " + alturaPredio;
        imprimir(saida);
    }
}