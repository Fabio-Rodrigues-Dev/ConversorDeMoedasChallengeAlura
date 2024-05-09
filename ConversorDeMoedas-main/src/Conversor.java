import com.google.gson.Gson;

import java.io.IOException;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) throws IOException, InterruptedException {

        // Passo 1: Impressão do menu.
        System.out.println("""
        ************************************
        *                                  *
        * Bem vindo ao Conversor de Moedas *
        *                                  *
        ************************************
        """);
        System.out.println("""
                DIGITE A OPÇÃO DESEJADA:
                
                [1] DÓLAR CANADENSE PARA REAL
                [2] REAL PARA DÓLAR CANADENSE
                [3] DÓLAR CANADENSE PARA EURO
                [4] EURO PARA PESO CHILENO
                [5] REAL PARA YEN
                [6] REAL PARA PARA PESO ARGENTINO
                [7] SAIR
                """);


        // Passo 2: entrada dos dados e selecao.
            CurrencyPair pair = new CurrencyPair();

            System.out.println("Digite o número da conversão desejada: ");
            Scanner entrada = new Scanner(System.in);
            int optionNumber = entrada.nextInt();

            switch (optionNumber) {
                case 1:
                    pair.setBase_code("CAD");
                    pair.setTarget_code("BRL");
                    break;
                case 2:
                    pair.setBase_code("BRL");
                    pair.setTarget_code("CAD");
                    break;
                case 3:
                    pair.setBase_code("CAD");
                    pair.setTarget_code("EUR");
                    break;
                case 4:
                    pair.setBase_code("CLP");
                    pair.setTarget_code("EUR");
                    break;
                case 5:
                    pair.setBase_code("BRL");
                    pair.setTarget_code("JPY");
                    break;
                case 6:
                    pair.setBase_code("BRL");
                    pair.setTarget_code("ARS");
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("OPÇÃO INVALIDA, TENTE NOVAMENTE");
                    break;
            }
        System.out.println("DIGITE O VALOR A SER CONVERTIDO: ");
        double coinValue = entrada.nextDouble();

        // Passo 3: Consumo da API, Deserializacao.
        ApiGet getApi = new ApiGet(pair.getBase_code(), pair.getTarget_code());

        Gson gson = new Gson();
        pair = gson.fromJson(getApi.getJson(), CurrencyPair.class);

        // Passo 4 Impressão do resultado
        System.out.println("Codigo da Moeda Origem: "+ pair.getBase_code());
        System.out.println("Codigo da Moeda Destino: "+ pair.getTarget_code());
        System.out.println("Valor a ser convertido: "+ coinValue);
        System.out.println("Resultado: "+ coinValue*pair.getConversionRate());
    }
}
