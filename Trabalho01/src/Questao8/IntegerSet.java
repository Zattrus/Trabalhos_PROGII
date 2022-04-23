package Questao8;

public class IntegerSet {

    private boolean conjunto[] = new boolean[15];
    private boolean[] set;
    private int max;

    public IntegerSet(int max) {
        this.max = max;
        this.set = new boolean[max];
    }

    public void insert(int num) {
        if (num >= 0) {
            if (this.conjunto[num] == false) {
                this.conjunto[num] = true;
            } else {
                System.out.println("Este número não pertence ao conjunto\n");
            }
        } else {
            System.out.println("Número Inválido\n");
        }
    }

    public void remove(int num) {
        if (num >= 0) {
            if (this.conjunto[num] == true) {
                this.conjunto[num] = false;
            } else {
                System.out.println("Este número não pertence ao conjunto\n");
            }
        } else {
            System.out.println("Número Inválido \n");
        }
    }

    public IntegerSet union(IntegerSet set) {
        for (int i = 0; i < this.max; i++) {
            if (this.conjunto[i] == true) {
                this.set[i] = true;
            }
        }

        for (int i = 0; i < this.max; i++) {
            if (set.conjunto[i] == true) {
                this.set[i] = true;
            }
        }

        return this;
    }

    public IntegerSet intersection(IntegerSet set) {
        for (int i = 0; i < this.max; i++) {
            if (this.conjunto[i] == true && set.conjunto[i] == true) {
                this.set[i] = true;
            } else {
                this.set[i] = false;
            }
        }

        return this;
    }

    public IntegerSet difference(IntegerSet set) {
        for (int i = 0; i < this.max; i++) {
            if (this.conjunto[i] == true && set.conjunto[i] == true) {
                this.set[i] = false;
            } else {
                this.set[i] = true;
            }
        }

        return this;
    }

    public String toString() {
        String str = "";

        for (int i = 0; i < this.max; i++) {
            if (this.set[i] == true) {
                str += i + " ";
            }
        }

        return str;
    }


}

