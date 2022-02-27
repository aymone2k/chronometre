package chronometre;
// gère l'affichage de l'interface du chrono

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


public class ChronoView extends JFrame {
	private JPanel container = new JPanel();
	
	//affichage des bouttons
		//---dimension des btns
	private Dimension btnSize = new Dimension(90, 70);
	
		//---gestion du nom et nbre de btns
	String[] tab_btnName = {"Start", "Record", "Stop", "Restart", "Reset"};
	JButton[] tab_btns = new JButton[tab_btnName.length];
	
	
	//affichage de l'écran( chnono principal + 5Records)
	private JLabel[] tab_screen = new JLabel[6];
	
	//format d'affichage du temps (hh:mm:ss:ms)
	long hour, minute, second, mili;
	
	
	long initVar, nowVar, pauseDepart =0, pauseFin =0; // initalisation des variables pr stocker le tps
	//pour trouver la durée: 
		//initVar= nbre de miliseconde depuis 1970
		//nowvar= calcule le tepms à partir de l'instant présent
	//pauseDepart=losqu'on arrete le chrono(stopbtn), pauseFin= lorsqu'on met le chrono en pause( recordbtn)
	private SwingWorker<Void, Integer> worker;// variable permettant de lance le chono en arrière plan
	
	
	//constructeur: fenetre chrono
	public ChronoView() {
		this.setSize(600, 600);
		this.setTitle("Mon Chrono");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		initComposant();
		
		this.setContentPane(container);
		this.setVisible(true);
	}
	
	//fct permettant de positionner les différents éléments dans le fenetre de vue
		private void initComposant(){
		
			JPanel buttons = new JPanel();
			buttons.setPreferredSize(new Dimension(550, 200));
			
			JPanel panEcran = new JPanel();
			panEcran.setPreferredSize(new Dimension(550, 400));
			panEcran.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
			panEcran.setBackground(Color.white);
			
					
			Font police1 = new Font("Arial", Font.BOLD, 60);
			Font police2 = new Font("Arial", Font.BOLD, 25);
			
			//Ecran d'affichage de départ
			
			for (int i=0; i<6; i++) {
				if(i == 0) {
					tab_screen[i] = new JLabel("00:00:00.00");
					tab_screen[i].setFont(police1);
				}else {
					tab_screen[i] = new JLabel(i+" : 00:00:00.00");
					tab_screen[i].setFont(police2);
				}
				
				tab_screen[i].setHorizontalAlignment(JLabel.CENTER);
				tab_screen[i].setPreferredSize(new Dimension(500, 60));
				panEcran.add(tab_screen[i]);
			}
			
			//L'affichage des btns 
			for(int i=0; i< tab_btnName.length; i++) {
				tab_btns[i]= new JButton(tab_btnName[i]);
				tab_btns[i].setPreferredSize(btnSize);
				buttons.add(tab_btns[i]);
				if(i != 0) {
					tab_btns[i].setEnabled(false);
				}
			}
			
			
			tab_btns[0].addActionListener(new StartBtn()); tab_btns[0].setForeground(Color.PINK);
			tab_btns[1].addActionListener(new RecordBtn()); tab_btns[1].setForeground(Color.GREEN);
			tab_btns[2].addActionListener(new StopBtn()); tab_btns[2].setForeground(Color.RED);
			tab_btns[3].addActionListener(new ReStartBtn()); tab_btns[3].setForeground(Color.BLUE);
			tab_btns[4].addActionListener(new ResetBtn()); tab_btns[4].setForeground(Color.YELLOW);
			
			
			container.add(panEcran, BorderLayout.NORTH);
			container.add(buttons, BorderLayout.CENTER);
	}
	
}
