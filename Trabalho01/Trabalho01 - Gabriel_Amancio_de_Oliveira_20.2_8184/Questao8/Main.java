package Questao8;

public class Main {
    public static void main(String[] args) {
        IntegerSet set = new IntegerSet(15);

        System.out.println("Conjunto 1: 1, 3, 4, 5, 6, 8");
        set.insert(1);
        set.insert(3);
        set.insert(4);
        set.insert(5);
        set.insert(6);

        IntegerSet set2 = new IntegerSet(15);

        System.out.println("Conjunto 2: 1, 2, 3, 4, 7, 9, 10");
        set2.insert(1);
        set2.insert(2);
        set2.insert(3);
        set2.insert(4);
        set2.insert(10);
        set2.insert(7);
        set2.insert(9);

        IntegerSet set3 = set.union(set2);

        System.out.println("União: " + set3.toString());

        IntegerSet set4 = set.intersection(set2);

        System.out.println("Interseção: " + set4.toString());

        IntegerSet set5 = set.difference(set2);

        System.out.println("Diferença: " + set5.toString());

    }
}