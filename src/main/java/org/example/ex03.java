import java.util.Scanner;

void main(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe um número: ");
    int n = scanner.nextInt();
    for (int i = 2; i <= n; i++){
        int count = 0;
        for (int j = 1; j <= i; j++){
            if (i % j == 0){
                count += 1;
            }
        }
        if (count == 2){
            System.out.println(i + "\n");
        }
    }
}