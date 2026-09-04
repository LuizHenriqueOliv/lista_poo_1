// import java.util.Scanner;

// public class Contador {
//    public static void main(String(faltam arrays aqui) args) {
//        Scanner sc = new Scanner(System.in);
//        int contador = 0;
//        while (contador <= 5) {
//            System.out.println("Contador: " + contador) falta de ";" aqui
//            falta de um incrementador para o contador, deixando o while infinito
//        }
//    }
//}

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador += 1;
        }
    }
}