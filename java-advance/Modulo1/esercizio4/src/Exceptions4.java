//Scrivere una funzione che accetti un array in input e provi a dividere un numero dell'array per 0
//e gestista sia l'eccezione della divisione che quella di indice non presente nell'array, leggendone il messaggio.
//Eseguire sempre un blocco di codice scrivendo un messaggio in console.

import java.util.Arrays;

public class Exceptions4 {
    public static void main(String[] args) {
        int[] array = {1,23,4,5,67,8,9,1};
        System.out.println(Arrays.toString(array));

        try {
            System.out.println(dividerArray(array, -5, 4));
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }
    public static int dividerArray(int[] array, int index, int num) {
        if (array.length < index) {
            throw new ArrayIndexOutOfBoundsException("Ops tha i seems to be greater than the length");
        } else if (num == 0) {
            throw new ArithmeticException("Ops the number can't be divided by zero");
        } else if (index < 0) {
            throw new ArrayIndexOutOfBoundsException("Error");
        } else {
            return array[index] / num;
        }
    }
}