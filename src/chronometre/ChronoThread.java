package chronometre;
//pour calculer en arrière plan le decompte chrono

import javax.swing.SwingWorker;


public class ChronoThread {
	long initVar, nowVar, pauseDepart =0, pauseFin =0;
	private SwingWorker<Void, Integer> worker;
}
