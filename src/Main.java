public class Main {
    public static void main(String[] args) {

        // Array com 15 posições tal como definido pelo Guanabara

        int[] array = new int[15];

        for(int i = 0; i<array.length;i++){

            if(i < 2){
                array[i] = 1;
            } else{
                array[i] = array[i-1] + array[i-2];
            }
        }

        for(int i = 0; i<array.length;i++){
            System.out.println("O valor do " + i + " é igual a " + array[i]);

        }
    }
}