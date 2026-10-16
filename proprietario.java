/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcontocorrente;

/**
 * classe che rappresenta il prorpietario del conto corrente
 * @author utente
 */
public class proprietario {
    
    private String nome; 
    private String cognome;
    
    /**
     * costruttore della classe Proprietario
     * @param nome
     * @param cognome
     */
    
    public proprietario(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }
    
     public String getNome() {
        return nome;
     }
     
     public String getCognome() {
        return cognome;
    }

    @Override
    public String toString() {
        return nome + " " + cognome;
    }
}
    
    
    
    
    
    
    
    
    

