package chronometre;
// btn pour enregistrer un chrono , enregistre uniquement les 3 dernier , puis est déactivé après

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


public class RecordBtn implements ActionListener{
// enregistre dans un tableau
	
	private int Record =1; // initialisation du nbre d'action btnrecord

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	// si record > 7 le btn sera désactivé
	// tant que <7 lorsqu'on clique, va enregister le chrono dans le tableau
}
