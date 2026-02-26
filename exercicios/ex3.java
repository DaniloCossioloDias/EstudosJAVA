public class ex3 {
    static void main() {
        int[] vetor = {10, 30, 11, 32, 24, 24, 10, 11};
        int[] vetor2 = new int[vetor.length];
        int indice = 0;
        boolean jaExiste = false;

        for(int i = 0; i < vetor.length; i++) {
            jaExiste = false;
            for(int j = 0; j < i; j++) {
                if(vetor[i] == vetor[j]) {
                    jaExiste = true;
                    break;
                }
            }
            if(!jaExiste) {
                vetor2[indice] = vetor[i];
                indice++;
            }
        }

        for(int i = 0; i < indice; i++) {
            System.out.println(vetor2[i]);
        }
    }
}
