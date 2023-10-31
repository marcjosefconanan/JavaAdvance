//Scrivere una funzione che restituisca un hashset riempito
//Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
//Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
//Svuotare l'hashset, verificarlo e stampare il risultato

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset3 {
    public static void main(String[] args) {
        HashSet<Integer> numbersSet = new HashSet<Integer>();
        fillHashSet(numbersSet);
        System.out.println(numbersSet);
        System.out.println(getSetSize(numbersSet));
        printElements(numbersSet);
        Integer elementToCheck = 9;
        System.out.println(isElementPresent(numbersSet, elementToCheck));
        removeElement(numbersSet, 4);
        System.out.println(clearHashSet(numbersSet));
    }

    public static boolean isElementPresent(HashSet<Integer> set, Integer element) {
        if (set.contains(element)) {
            return true;
        }
        System.out.println("L'elemento non è presente.");
        return false;
    }

    public static HashSet<Integer> fillHashSet(HashSet<Integer> set) {
        set.addAll(Arrays.asList(1, 2, 3, 4, 5));
        return set;
    }

    public static void printElements(HashSet<Integer> set) {
        for (int element : set) {
            System.out.println("Elemento: " + element);
        }
    }

    public static void removeElement(HashSet<Integer> set, Integer toRemove) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element.equals(toRemove)) {
                iterator.remove();
            }
        }
    }

    public static HashSet<Integer> clearHashSet(HashSet<Integer> set) {
        set.clear();
        if (set.isEmpty()) {
            System.out.println("The Hashset is empty");
        } else {
            System.out.println("The Hashset is not empty");
        }
        return set;
    }

    public static int getSetSize(HashSet<Integer> set) {
        return set.size();
    }
}
