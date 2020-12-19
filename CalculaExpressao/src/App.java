import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {        
        Scanner entrada = new Scanner(System.in);
        
        double A, B, C, D, F, R;

        // {Leitura das vari�veis de entrada}
        System.out.print("Digite o valor de A: ");
        A = entrada.nextDouble();
        System.out.print("Digite o valor de B: ");
        B = entrada.nextDouble();
        System.out.print("Digite o valor de C: ");
        C = entrada.nextDouble();
        System.out.print("Digite o valor de D: ");
        D = entrada.nextDouble();

        //valida o valor de F (n�o pode ser zero)
        do
        {
            System.out.print("Digite o valor de F: ");
            F = entrada.nextDouble();
            System.out.println(); //salta linha
        } while (F == 0); //fim da valida��o da vari�vel F

        //{Faz os c�lculos}

        R = A - B * (C + Math.pow(D, 2)) / F;
        System.out.println(); //salta linha

        // {Apresenta o resultado}
        System.out.println(A + " - " + B + " * (" + C + " + " + D + "�) / " + F + " = " + R);
        
        entrada.close();
    }
}
