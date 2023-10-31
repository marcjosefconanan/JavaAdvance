//Scrivere una funzione che provi a dividere un numero per 0 e catturi l'eccezione leggendone il messaggio.

public class Exceptions3 {
    public static void main(String[] args) {

        try {
            System.out.println(divider(10));
        }

        catch (Exception e){
            System.out.println("Ops the number can't be divided by 0 " + e);
        }

    }
    public static int divider (int num) throws ArithmeticException {
        return num / 0;
    }
}
