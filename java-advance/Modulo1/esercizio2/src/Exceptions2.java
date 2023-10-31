//Scrivere una funzione che controlli se un carattere è un numero
//altrimenti lanciare una eccezione.

public class Exceptions2 {

    public static void main(String[] args) {
        try {
            System.out.println(numberFinder ('M'));

        } catch (Exception e) {
            System.out.println("Ops i believe this is not a number " + e);
        }
    }

    public static boolean numberFinder(char Character) throws Exception {
        if (Character >= '0' && Character <= '9') {
            return true;
            // È un numero
        } else {
            throw new Exception(Character + " not a number");
        }
    }
}