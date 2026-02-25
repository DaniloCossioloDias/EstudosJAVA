public class numeroPrimo {
    static void main() {
        int num = 4;
        boolean confere = ehPRimo(num);
        System.out.println(confere);
    }

    public static boolean ehPRimo(int num) {
        if(num <= 1) {
            return false;
        }

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }
}

//aqui foi a solução mais simples que encontrei, daria também para fazer pegando a raiz quadrada, seria mais simples e usaria menos recurso
