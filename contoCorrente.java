/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcontocorrente;

/**
 * classe per gestire un conto corrente
 * @author utente
 */
public class contoCorrente {
    
    
    /**
     * attributi privati
     */
    private String iban;
    private proprietario titolare;
    private double saldo;
    
   /**
    * metodo costruttore per creare un nuovo conto corrente  
    * @param iban Codice iban del conto
    * @param titolare Proprietario del conto
    * @param saldo Saldo iniziale nel conto
    */
    public contoCorrente(String iban, proprietario titolare, double saldo) {
        this.iban = iban;
        this.titolare = titolare;
    
    
      if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0;
            System.out.println("Attenzione: il saldo iniziale non può essere negativo.");
      }
      
    }
    
    /**
     * restituisce l'iban del conto corrente
     * @return iban
     */
        public String getIban() {
        return iban;
        }
      
        /**
         * restituisce il titolare del conto corrente 
         * @return proprietario
         */
        public proprietario getTitolare() {
            return titolare;
        }

        /**
         * restituisce il saldo attuale
         * @return saldo
         */
        
        public double getSaldo() {
            return saldo;
        }
    
        /** 
         * permette di versare dei soldi sul conto corrente
         * @param importo Somma da versare 
         */
        
         public void versa(double importo) {
        if (importo > 0) {
            this.saldo = this.saldo + importo;
            System.out.println("Versamento effettuato di " + importo + " euro.");
        } else {
            System.out.println("L'importo da versare deve essere maggiore di zero.");
        }
}
 
         /**
          * permette di prelevare dei soldi dal conto corrente 
          * @param importo Somma da prelevare 
          */
         
         public void preleva(double importo) {
        if (importo <= 0) {
            System.out.println("L'importo da prelevare deve essere maggiore di zero.");
        } else if (importo <= this.saldo) {
            this.saldo = this.saldo - importo;
            System.out.println("Prelievo effettuato di " + importo + " euro.");
        } else {
            System.out.println("Operazione annullata: saldo insufficiente per prelevare " + importo + " euro");
       }
  }
}
   