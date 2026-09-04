// Utilização do Scanner
// o scanner é utilizado para fazer a leitura de dados através da linha de comando e realizar a captura desse dado para dentro de uma variável, ou seja armazena-lo.

// Utilização do System.out.printf
// É como o printf do C, seu uso tem como objetivo imprimir valores com formatação específica, como inserir varias variáveis na string e também formatar quantiade de casas decimais para números

import java.util.Scanner;

void main(){
    Scanner scanner = new Scanner(System.in);
    double numero = scanner.nextDouble();

    System.out.printf("%.2f", numero);
}