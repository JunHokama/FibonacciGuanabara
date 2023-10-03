public class Main {
    public static void main(String[] args) {

        // Array com 15 posições tal como definido pelo Guanabara

        int[] array = new int[15];

        // Lembrar que o valor do 'próximo' número da sequência de Fibonacci é a soma dos primeiros elementos.

        for(int i = 0; i<array.length;i++){

            if(i < 2){
                array[i] = 1;
            } else{
                array[i] = array[i-1] + array[i-2];
            }
        }

        // O output dos últimos valores

        for(int i = 0; i<array.length;i++){
            System.out.println("O valor do " + i + " é igual a " + array[i]);

        }
    }
}