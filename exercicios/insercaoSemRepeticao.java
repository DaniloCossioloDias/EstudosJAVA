/*
int[] a = {1, 2, 3, 4, 5, 3, 2};
int[] b = {3, 5, 7, 3};
Crie um novo array contendo apenas os valores que existem nos dois arrays,
sem repetir valores no resultado.

Resultado esperado:

3
5
 */

public class insercaoSemRepeticao {
    static void main() {
        int[] a = {1, 2, 3, 4, 5, 3, 2};
        int[] b = {3, 5, 7, 3};
        int[] c = new int[a.length];
        boolean numeroIgual = false;
        boolean jaExiste = false;
        int indice = 0;

        for(int i = 0; i < a.length; i++) {
            numeroIgual = false;
            for(int j = 0; j < b.length; j++) {
                if(a[i] == b[j]) {
                    numeroIgual = true;
                    break;
                }

            }
            if(numeroIgual) {

                jaExiste = false;

                for(int z = 0; z < indice; z++) {
                    if(a[i] == c[z]) {
                        jaExiste = true;
                        break;
                    }
                }
                if(!jaExiste) {
                    c[indice] = a[i];
                    indice++;
                }
            }
        }

        for(int i = 0; i < indice; i++) {
            System.out.println(c[i]);
        }
    }
}
