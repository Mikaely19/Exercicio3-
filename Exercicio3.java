public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[20];
        int contadorPares = 0;

        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < vetor; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        for (int : vetor) {
            if (num % 2 == 0) {
                contadorPares++;
            }
        }
        System.out.println("Quantidade de números pares: " + contadorPares);
        
        scanner.close();
    }
}
