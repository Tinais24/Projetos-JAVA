/* Algoritmo IMC – Elabore um algoritmo em fluxograma para calcular o IMC de uma pessoa
e mostre a sua classificação.

IMC =
Peso(Kg) / Altura 2(m)

Realizar o cálculo, verificar e dizer a classificação.
IMC Classificação
<18.5 Abaixo do peso
18.6 - 24.9 Peso ideal
25 -29.9 Peso em excesso
30 - 34.9 Obesidade Grau I
35 - 39.9 Obesidade Grau II (severa)
>= 40 Obesidade Grau III (mórbida)*/

import java.util.Scanner;

public class Ex13_AlgoritmoIMC {

    final static Scanner LER_TECLADO = new Scanner(System.in);

    public static void main(String[] args) {

        // variáveis e CONSTANTES
        double altura = 0;
        double peso = 0;

    }

    public static double lerValorReal() {
        double valor = 0;
        valor = LER_TECLADO.nextInt();
    }

    public static void imprimir(String texto) {
        System.out.println(texto);
    }
}
