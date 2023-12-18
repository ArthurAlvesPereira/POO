import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args){
        double peso, altura, imc;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu peso (kg):");
        peso = sc.nextDouble();

        System.out.println("Informe sua altura (metro e cm):");
        altura = sc.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("O seu IMC é " + imc);
    }
}
