import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = 3;

        int rm[] = new int[n];
        double nota1[] = new double[n];
        double nota2[] = new double[n];

        int N;
        System.out.println(" informe o RM: ");
        int rmlido = sc.nextInt();
        for (N = 0; N<n && rmlido>0; N++){
            rm[N] = rmlido;
            System.out.println("Nota 1: ");
            nota1[N] = sc.nextDouble();
            System.out.println("Nota 2: ");
            nota2[N] = sc.nextDouble();
            System.out.println("informe o RM: ");
            rmlido = sc.nextInt();
        }
        double media[] = new double[N];
        for (int i = 0; i < N; i++){
            media[i] = (nota1[i] + nota2[i])/2;
            System.out.println("Rm: " + rm[i] + "\t media: " + media[i]);

        }




    }
}
