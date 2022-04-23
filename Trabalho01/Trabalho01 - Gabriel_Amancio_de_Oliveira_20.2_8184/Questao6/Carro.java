package Questao6;

public class Carro {
      public int preco;
      public String marca;
      private String ligar;
      private String acelerando;
      private String freiando;

      public void ligar() {
          this.ligar = " ligou!";
      }

      public void desligar() {
          this.ligar = " desligou!";
      }

      public String estaLigado() {
          return this.ligar;
      }

      public void acelerar() {
          this.acelerando = " estar acelerando...";
      }

      public String estaAcelerando() {
          return this.acelerando;
      }

      public void freiar() {
        this.freiando = " estar freiando...";
      }

      public String estaFreiando() {
        return this.freiando;
      }



}
