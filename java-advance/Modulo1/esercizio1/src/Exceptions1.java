
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


