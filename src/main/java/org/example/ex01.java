import java.util.Scanner;

void main(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Nome do aluno: ");
    String nome = scanner.nextLine();

    System.out.println("Nota 1: ");
    double nota1 = scanner.nextDouble();

    System.out.println("Nota 2: ");
    double nota2 = scanner.nextDouble();

    System.out.println("Nota 3: ");
    double nota3 = scanner.nextDouble();

    double media = (nota1 + nota2 + (nota3 * 2)) / 4.0;

    System.out.println("\nAluno: " + nome);

    if (media >= 7){
        System.out.println("APROVADO\n");
    }
    if (media < 7){
        System.out.println("REPROVADO\n");
    }

    System.out.printf("Média: %.2f", media);
}