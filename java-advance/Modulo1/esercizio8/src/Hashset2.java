//Scrivere una funzione che restituisca un HashSet riempito
//Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
//Verificare che l' elemento sia parte del Set e stampare il risultato


import java.util.Arrays;
import java.util.HashSet;

public class Hashset2 {
    public static void main(String[] args) {
        HashSet<Integer> hash1 = new HashSet<Integer>();
        fillHash(hash1);
        System.out.println(hash1);
        System.out.println(hash1.size());
        printElement(hash1);
        Integer element = 4;
        System.out.println(isPresent(hash1, element));


    }

    public static boolean isPresent (HashSet<Integer> list, Integer element){
        if(list.contains(element)){
            return true;
        }
        return false;
    }
    public static HashSet fillHash (HashSet<Integer> toFill){
        toFill.addAll(Arrays.asList(1, 2, 3, 4, 5));
        return toFill;
    }
    public static void printElement (HashSet<Integer> toPrint){
        for(int element : toPrint){
            System.out.println("element is " + element);
        }
    }
}
