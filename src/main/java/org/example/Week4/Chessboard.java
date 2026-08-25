package org.example.Week4;

public class Chessboard {

            /* Aufgabe 1: Schachbrett (Java-Programm ausführen und debuggen)

        Lernziele:
        1. Nutzung des Debugers üben;
        2. üben, selbständig Fehler zu finden

        1.1: Kopieren Sie dieses Programm in Ihr eclipse-System, korregiere Syntax Fehler, übersetze es
               und lassen es dort laufen.

        1.2: Überwachen Sie im Debugger die Variablen
             Linie und Reihe, führen Sie das Programm schrittweise aus.
             Was ändert sich jeweils (Variablenwerte,Consoleausgabe,...) und warum?

        1.3: Verändern Sie das Programm so, dass es ein 4x4 Schachbrett ausgibt,
             außerdem soll der Zeilenabstand um 1 Zeile und der Spaltenabstand um
             3 Zeichen vergrößert werden.

        1.4: Verwenden Sie while-Schleifen statt for-schleifen

        1.5: Verwenden Sie do-while-Schleifen statt while-schleifen

        */

    public static void main( String[] args ) {
        char linie = 'A';                             // Definition der Linie, z.B. A-Linie
        int reihe = 1;                              // Definition der Reihe, z.B. 3.Reihe

        for ( reihe = 8; reihe >= 1; reihe--)
            // Schreibe alle Schachbrettfelder
        {
            for ( linie = 'A'; linie <= 'H'; linie++)     // alle Felder einer Reihe
            System.out.print(" " + linie + reihe) ;            // Schreibe ein Feld
            System.out.println() ;                        // Felder der nächsten Reihe
            // müssen in die nächste Zeile
        }
    }

}
