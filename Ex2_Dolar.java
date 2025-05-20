import  java.util.Scanner;

public class Ex2_Dolar {
    final static Scanner teclado = new Scanner(System.in);

    //Recebe um texto = mostra na tela
    public static double lerValorReal(){
        double valor;
        valor = teclado.nextDouble();
        return valor;

    }

    public static void imprimir(String texto){
        System.out.println(texto);

    }

    //Calcula o valor em reais a partir do valor em dolares e a cotacao
    public static double calcularDolarReal(double cotacaoDOlar, double valorDolares){
        double valorReais;
        valorReais = cotacaoDOlar * valorDolares;
        return valorReais;

    }
    public static void main(String[] args) {
        
        double cotacaoDOlar = 0;
        double valorDolares = 0;
        double valorReais = 0;
        String saida;

        //entrada de dados
        imprimir("Informe a cotação do dólar");
        cotacaoDOlar = lerValorReal();

        imprimir("Informe a quantidade de dólares");
        valorDolares = lerValorReal();

        //processamento
        valorReais = calcularDolarReal(cotacaoDOlar, valorDolares);

        //saida
        saida = ("O valor em reais é " + valorReais);
        imprimir(saida);
    }
}