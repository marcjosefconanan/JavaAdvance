//Scrivere una funzione che restituisca un hashset riempito
//Leggere l'hashSet e stampre grandezza ed elementi

import java.util.Arrays;
import java.util.HashSet;


public class Hashset1 {
    public static void main(String[] args) {
        HashSet<Integer> hash1 = new HashSet<Integer>();
        Hash(hash1);
        System.out.println("elements in the array :" + hash1);
        System.out.println("this is the size of the has set :" + hash1.size());
        print(hash1);
    }
    public static HashSet Hash (HashSet<Integer> toFill){
        toFill.addAll(Arrays.asList(1, 2, 3));
        return toFill;
    }
    public static void print(HashSet<Integer> toPrint) {
        Integer[] array = toPrint.toArray(new Integer[0]);
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            System.out.println("element: " + element);
        }
    }
}
