//Scrivere una funzione che accetti in input un numeratore e un denominatore
//Controlli che il numeratore e il denominatore non siano null
//Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione.

public class Nullability {
    public static void main(String[] args) {
        try {
            System.out.println(divider(50, null));
        } catch (NullPointerException e) {
            System.out.println("Ops either numerator or denomerator is null " + e);
        }

    }

    public static int divider(Integer numerator, Integer denominator) {
        int result = numerator / denominator;
        if (numerator == null || denominator == null) {
            throw new NullPointerException();
        }
        return result;
    }
}