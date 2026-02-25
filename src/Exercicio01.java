import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nota1 = new double[10];
        double[] nota2 = new double[10];

        int[] rm = new int[3];

        for (int i = 0; i < rm.length; i++){
            System.out.println("QUal Rm do aluno: ");
            rm[i] = sc.nextInt();

            if (rm[i] >= 0){
                System.out.println("qual a nota 1 do aluno? ");
                nota1[i] = sc.nextDouble();
                System.out.println("qual a nota 2 do aluno?");
                nota2[i] = sc.nextDouble();


                double[] media = new double[i];
                media[i] = (nota1[i] + nota2[i]) / 2;

                System.out.println(" O RM" + rm[i] + " Esta com a media " + media);
            } else {
                System.out.println("RM invalido");
                break;
            }






        }


    }
}
