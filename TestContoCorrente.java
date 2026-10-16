/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testcontocorrente;

/**
 *
 * @author utente
 */
public class TestContoCorrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    // creazione del proprietario
    proprietario p1 = new proprietario("Matilde", "Donati Sarti");
    
    // creazione del conto corrente 
    contoCorrente conto = new contoCorrente("IT99C0306902128000000123456", p1, 100.0); 
    
  // facciamo un prelievo e un versamento 
    conto.versa(50.0);
    conto.preleva(20.0);
        
    // prova di prelievo per evitare di andare in negativo nel conto corrente 
    conto.preleva(500.0);
    
    
    System.out.println("Titolare: " + conto.getTitolare());
    System.out.println("IBAN: " + conto.getIban());
    System.out.println("Saldo iniziale: " + conto.getSaldo() + " euro\n");

    System.out.println("-- Prova versamento --");
    conto.versa(50.0);
    System.out.println("Saldo aggiornato: " + conto.getSaldo() + " euro\n");

    System.out.println("-- Prova prelievo valido --");
    conto.preleva(30.0);
    System.out.println("Saldo aggiornato: " + conto.getSaldo() + " euro\n");

    System.out.println("-- Prova prelievo troppo alto --");
    conto.preleva(500.0);
    System.out.println("Saldo finale: " + conto.getSaldo() + " euro");   
   }
    
}
