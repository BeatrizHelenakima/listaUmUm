public class Animal {
   private String nome;
   private String tipo;
   public Animal(String nome, String tipo) {
       this.nome = nome;
       this.tipo = tipo;


   }
   
public String getNome() {
       return nome;
   }
   
public void setNome(String nome) {
       this.nome = nome;
   }
   
public String getTipo() {
       return tipo;
   }
   
public void setTipo(String tipo) {
       this.tipo = tipo;
   }
 
   public void emitirSom() {
       System.out.println("O " + tipo + " " + nome + " emite um som.");
   }
}
