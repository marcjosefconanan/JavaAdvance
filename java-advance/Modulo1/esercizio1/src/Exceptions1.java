
// Scrivere una funzione che controlli se un numero int è in un determinato range

//Se lo è ritorna true se non lo è lancia un'eccezione


public class Exceptions1 {
    public static void main(String[] args) {
        try {
            System.out.println(checkIfItsInRange (9,0,10));

        } catch (Exception e) {
            System.out.println("Ops the number isn't in range" + e);
        }
    }
    public static boolean checkIfItsInRange (int num,int min,int max)throws Exception{
        if (min >= num || num <= max){
            return true;
        }else {
            throw new Exception("this number is not in range");

        }
    }
}






/*
public class Main {
    public static void main(String[] args) {
        int number = 9;
        int min = 0;
        int max = 10;
        try {
            boolean result = checkIfItsInRange(number, min, max);
            System.out.println("number " + number + " is in range of " + min + " and " + max + " : " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static boolean checkIfItsInRange (int num,int min,int max)throws Exception{
        if (min >= num || num <= max){
            return true;
        }else {
            throw new Exception("this number is not in range");

        }
    }
}

 */


