import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] notas = new double[8];

        // Entrada das 8 notas
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = input.nextDouble();
        }

        // Cálculos das médias
        double media1Bim = (notas[0] + notas[1]) / 2;
        double media2Bim = (notas[2] + notas[3]) / 2;
        double media1Sem = (media1Bim + media2Bim) / 2;

        double media3Bim = (notas[4] + notas[5]) / 2;
        double media4Bim = (notas[6] + notas[7]) / 2;
        double media2Sem = (media3Bim + media4Bim) / 2;

        double mediaFinal = (media1Sem + media2Sem) / 2;

        // Saída formatada
        System.out.println("\n--- Resultados ---");
        System.out.printf("1º Bimestre: %.1f\n", media1Bim);
        System.out.printf("2º Bimestre: %.1f\n", media2Bim);
        System.out.printf("1º Semestre: %.1f\n", media1Sem);
        System.out.println("-----------------------------");
        System.out.printf("3º Bimestre: %.1f\n", media3Bim);
        System.out.printf("4º Bimestre: %.1f\n", media4Bim);
        System.out.printf("2º Semestre: %.1f\n", media2Sem);
        System.out.println("-----------------------------");
        System.out.printf("Média Final: %.1f\n", mediaFinal);

        input.close();
    }
}
