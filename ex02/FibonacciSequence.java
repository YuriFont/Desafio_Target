import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        int     number, next, a = 0, b = 1;
        boolean foundNum = false;

        System.out.print("Digite um número para verificar na sequência de Fibonacci: ");
        number = sc.nextInt();

        if (number == 0) {
            System.out.println("O número 0 pertence à sequencia de Fibonacci.");
            return ;
        }

        while (b <= number && !foundNum) {
            if (b == number)
                foundNum = true;
            next = a + b;
            a = b;
            b = next;
        }

        if (foundNum)
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        else
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
        
        sc.close();
    }
}