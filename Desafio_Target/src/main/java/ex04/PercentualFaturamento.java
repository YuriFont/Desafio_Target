package ex04;

public class PercentualFaturamento {

    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        double faturamentoTotal = sp + rj + mg + es + outros;

        System.out.println("\nPercentual de representação por estado:");
        System.out.printf("SP: %.2f%%\n", (sp / faturamentoTotal) * 100);
        System.out.printf("RJ: %.2f%%\n", (rj / faturamentoTotal) * 100);
        System.out.printf("MG: %.2f%%\n", (mg / faturamentoTotal) * 100);
        System.out.printf("ES: %.2f%%\n", (es / faturamentoTotal) * 100);
        System.out.printf("Outros: %.2f%%\n", (outros / faturamentoTotal) * 100);
    }

}
