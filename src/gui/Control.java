package gui;

/**
 * @author Gruppe 1 
 *Implementierende Klassen verwalten die Simulation.
 *(Folgendes in die implementierede Klasse)
 *Geplant ist das Einladen von Konfigdaten aus einer CSV Datei.
 *(Syntax wird im file und Methodenrumpf beschrieben)
 *Aus den Konfigurationsdaten wird dann die Simulation
 *initialisiert.
 *Die Simulation kann von au�en w�rend des laufens 
 *beeinflusst werden , hierf�r sind die folgenden Methoden des 
 *Interfaces vorgesehen 
 */
public interface Control {
	
	/**
	 * L�sst den n�chsten Simulationsschritt sofort ausf�hren
	 */
	public void next_simuation();
	
	/**
	 * H�llt den Simulationszyklus an
	 */
	public void pause_simuation();
	
	/**
	 * Setzt die Simulation im Standard Interwall fort
	 */
	public void run_simuation();
	
	
	//Optional
	//public void restart_simulation();
	
	//Vermerk notwengig an gui???
	//Aufbereitetes Feld in Format auf das wir  uns einigen m�ssen
	//Aktuelle Informationen �ber Roboter und Auftragsabarbeitung + (Urauftrag?)
		
	//Vermerk von GUI ??
	//Konstruktor mit notwendigen Initdaten
}
