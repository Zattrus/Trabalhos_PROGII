package Questao2;

public enum StatusPlace {
   EMPTY(0), PLAY1(1), PLAY2(2);
   private final int valor;

   StatusPlace(int valorOP){valor = valorOP; }

   public int getValor(){ return  valor;}
}
