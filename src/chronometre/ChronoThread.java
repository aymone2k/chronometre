package chronometre;
//pour calculer en arrière plan le decompte chrono

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingWorker;


public class ChronoThread {
	long initVar, nowVar, pauseDepart =0, pauseFin =0; // initalisation des variables pr stocker le tps
	//pour trouver la durée: 
		//initVar= nbre de miliseconde depuis 1970
		//nowvar= calcule le tepms à partir de l'instant présent
	//pauseDepart=losqu'on arrete le chrono(stopbtn), pauseFin= lorsqu'on met le chrono en pause( recordbtn)
	private SwingWorker<Void, Integer> worker;// variable permettant de lance le chono en arrière plan
	
	private void initializeWorker() {
		worker = new SwingWorker<Void, Integer>(){

			@Override
			protected Void doInBackground() throws Exception {
			
			initVar = initVar + (pauseFin - pauseDepart);
			pauseDepart = pauseFin =0;
			
			while(!isCancelled()) {
			//	newVar = System.currentTimeMillis()
			}
				
				
				
				return null;
			}
			
		};
	}
	
	
	
	
	
	
}
