# contoCorrente
Esercizio gestione conto corrente in Java con diagramma UML
- Gestione Conto Corrente in Java

## Documentazione delle Classi

### Classe Proprietario
Rappresenta l'intestatario del conto corrente.
* **Attributi:**
  * "nome": String  Nome del proprietario.
  * "cognome": String  Cognome del proprietario.
* **Metodi:**
  * "Proprietario(nome, cognome)": costruttore che inizializza l'oggetto.
  * "getNome()": String Restituisce il nome del proprietario
  * "getCognome()": String Restituisce il cognome del proprietario
  * "toString()": restituisce una rappresentazione testuale del proprietario.

## Classe `ContoCorrente`
Gestisce le operazioni bancarie facendo si che il saldo non vada mai in negativo.
* **Attributi:**
  * "iban": String  Codice iban identificativo del conto.
  * "titolare": Proprietario  Riferimento all'oggetto Proprietario.
  * "saldo": double  Somma di denaro attualmente disponibile.
* **Metodi:**
  * "ContoCorrente(iban, titolare, saldo)": costruttore che assegna l'iban, il titolare e verifica che il saldo iniziale sia ">= 0".
  * "getIban()": String 
  * "getTitolare()": Proprietario
  * "getSaldo()": Double
  * "versa(importo)": incrementa il saldo se l'importo è > di 0.
  * "preleva(importo)": controlla "(importo <= saldo)" ed effettua il prelievo senza mai far andare il conto in negativo.

## Classe `TestContoCorrente`
Contiene il metodo "main" per verificare il corretto funzionamento delle classi e la gestione dei prelievi.
