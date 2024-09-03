package ex05;

import java.util.Scanner;

public class InverterString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra, palavraInvertida = "";

        System.out.print("Digite a string que você quer inverter: ");
        palavra = sc.nextLine();

        if (palavra.isEmpty()) {
            sc.close();
            return ;
        }

        for (int i = palavra.length() - 1; i >=0; i--)
            palavraInvertida += palavra.charAt(i);

        System.out.println("String invertida: " + palavraInvertida);
        sc.close();
    }

}
