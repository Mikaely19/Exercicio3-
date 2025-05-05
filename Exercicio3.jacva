public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[20];
        int contadorPares = 0;

        // Leitura dos números
        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Contagem de números pares
        for (int num : vetor) {
            if (num % 2 == 0) {
                contadorPares++;
            }
        }

        // Exibição do resultado
        System.out.println("Quantidade de números pares: " + contadorPares);
        
        scanner.close();
    }
}
