//Scrivere una funzione che accetti in input 2 int e ne stampi la somma
//Scrivere una funzione che accetti in input 1 char lo stampi
//Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
//Scrivere una funzione che accetti in input 1 Character lo stampi
//Scrivere un un valore primitivo per int, double e char e fare autoboxing
//Scrivere un oggetto per Integer, Double e Character e fare Unboxing
//Usare le funzioni scritte con i valori creati

public class Autoboxing {
    public static void main(String[] args) {
        int Int = 2;
        double Doup = 4.55;
        char Char = 'M';
        Integer Int2 = Int;
        Double Doup2 = Doup;
        Character Char2 = Char;

        Integer IntI = 7;
        Double DoupD = 8.78;
        Character CharC = 'C';
        int IntI2 = IntI;
        double DoupD2 = DoupD;
        char CharC2 = CharC;

        System.out.println(sum(Int, IntI2));
        printChar(CharC2);
        System.out.println(sumI(Int2, IntI));
        printC(Char2);
    }

    public static int sum(int val1, int val2) {
        return val1 + val2;
    }
    public static void printChar(char x) {
        System.out.println(x);
    }
    public static int sumI(Integer val1, Integer val2) {return val1 + val2;}
    public static void printC(Character x) {
        System.out.println(x);
    }
}