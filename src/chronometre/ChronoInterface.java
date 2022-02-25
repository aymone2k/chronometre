package chronometre;
// gère l'affichage de l'interface

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


public class ChronoInterface extends JFrame {
	private JPanel container = new JPanel();
	
	//affichage des bouttons
		//dimension
	private Dimension btnSize = new Dimension(90, 70);
		//nom et nbre
	String[] btnName = {"Start", "Lap", "Stop", "Resume", "Reset"};
	JButton[] btns = new JButton[btnName.length];
	
	//affichage de l'écran( chnono principal + 3laps)
	private JLabel[] ecran = new JLabel[4];
	
	//format d'affichage du temps (hh:mm:ss:ms)
	long hour, minute, second, mili;
}
