package ex03;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class FaturamentoDistribuidora {

    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(new File("C:\\Users\\yurif\\OneDrive\\Área de Trabalho\\Projetos\\Desafio_Target\\Desafio_Target\\src\\main\\java\\ex03\\dados.json"));

            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;
            double somaFaturamento = 0;
            int diasComFaturamento = 0;

            Iterator<JsonNode> elements = rootNode.elements();
            while (elements.hasNext()) {
                JsonNode node = elements.next();
                double faturamentoDiario = node.get("valor").asDouble();

                if (faturamentoDiario > 0) {
                    if (faturamentoDiario < menorFaturamento)
                        menorFaturamento = faturamentoDiario;
                    else if (faturamentoDiario > maiorFaturamento)
                        maiorFaturamento = faturamentoDiario;
                    somaFaturamento += faturamentoDiario;
                    diasComFaturamento++;
                }
            }

            double mediaMensal = somaFaturamento / diasComFaturamento;
            int diasAcimaDaMedia = 0;

            elements = rootNode.elements();
            while (elements.hasNext()) {
                JsonNode node = elements.next();
                double faturamentoDiario = node.get("valor").asDouble();
                if (faturamentoDiario > mediaMensal)
                    diasAcimaDaMedia++;
            }

            System.out.println("Menor faturamento: " + menorFaturamento);
            System.out.println("Maior faturamento: " + maiorFaturamento);
            System.out.print("Dias com faturamento acima da média: " + diasAcimaDaMedia);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
