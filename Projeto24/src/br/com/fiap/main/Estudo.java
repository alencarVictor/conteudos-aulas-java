package br.com.fiap.main;

public class Estudo {
    static void main() {
        //declarando e instanciando vetores(array)
        String[] carros = {"Volvo", "BMW", "Ford", "Mazda"};
        float[] numeros = new float[3];
        numeros[0] = 13;
        numeros[1] = 7;
        numeros[2] = 82;
        System.out.println("Tamanho do vetor: carros = "+ carros.length);
        System.out.println("Tamanho do vetor: numeros = "+ numeros.length);

        for (int i = 0; i < carros.length ; i++) {
            System.out.println(carros[i]);
        }

        //for-each - comando de repetição para Arrays
        for (float i : numeros  ){
            System.out.println(i);

        }

    }
}
