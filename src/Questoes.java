import java.util.HashMap;
import java.util.Map;

public class Questoes {

    public static void somaTotal(){
        int indice = 13;
        int k = 0;
        int soma = 0;

        while(k<indice){
            soma = soma + k;
            k = k+1;

        }

        System.out.println("A soma total é: " + soma + "\n\n");

    }

    public static boolean verificacaoFibonacci(){
        final int NUMEROESCOLHIDO = 10;

        if(NUMEROESCOLHIDO == 0 || NUMEROESCOLHIDO == 1){
            System.out.println("O número" + NUMEROESCOLHIDO + "pertence a sequência\n\n");
            return true;
        }

        int primeiro = 0, segundo = 1, terceiro = primeiro + segundo;

        while(terceiro <= NUMEROESCOLHIDO){
            if(terceiro == NUMEROESCOLHIDO){
                System.out.println("O número " + NUMEROESCOLHIDO + " pertence a sequência\n\n");
                return true;
            }

            primeiro = segundo;
            segundo = terceiro;
            terceiro = primeiro + segundo;
        }

        System.out.println("O número " + NUMEROESCOLHIDO + " não pertence a sequência\n\n");
        return false;

    }

    public static void representacaoPercentual(){
        double total = 0;

        Map<String, Double> faturamento = new HashMap<>();
        faturamento.put("SP", 67836.43);
        faturamento.put("RJ", 36678.66);
        faturamento.put("MG", 29229.88);
        faturamento.put("ES", 27165.48);
        faturamento.put("Outros", 19849.53);

        for(double valor : faturamento.values()){
            total += valor;
        }

        for (String estado : faturamento.keySet()) {
            double valor = faturamento.get(estado);
            double percentual = (valor / total) * 100;
            System.out.printf("%s - %.2f%%\n", estado, percentual);
        }
    }

    public static void stringInvertida(){
        final String STRINGINICIAL = "O rato roeu a roupa do rei de roma";
        String stringInvertida = "";

        for(int j = STRINGINICIAL.length() - 1; j >= 0; j--){
            stringInvertida += STRINGINICIAL.charAt(j);
        }

        System.out.println("\n\nA frase invertida é: " + stringInvertida);

    }
}
