public class ex1 {
    static void main() {
        int[] vetor = {11, 30, 21, 14, 9, 43, 21};
        int menor = vetor[0];
        int maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            } else if (vetor[i] > maior) {
                maior = vetor[i];
            }

        }

        System.out.println(menor);
        System.out.println(maior);

    }
}
