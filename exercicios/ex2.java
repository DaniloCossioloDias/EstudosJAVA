public class ex2 {
    static void main() {
        int[] vetor = {10, 20, 30, 9, 8, 1, 23, 31};
        int maior = vetor[0];
        int segundoMaior = vetor[0];

        for(int i = 1; i < vetor.length; i++) {
            if(vetor[i] > maior) {
                segundoMaior = maior;
                maior = vetor[i];
            } else if(vetor[i] > segundoMaior && vetor[i] < maior) {
                segundoMaior = vetor[i];
            }
        }

        System.out.println(maior);
        System.out.println(segundoMaior);
    }
}
