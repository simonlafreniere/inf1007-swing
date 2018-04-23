package inf1007;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;

public class conception {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					conception window = new conception();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public conception() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 429);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
		tabbedPane.setBounds(12, 12, 624, 380);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panelSimon = new JPanel();
		tabbedPane.addTab("Simon", null, panelSimon, null);
		panelSimon.setLayout(null);
		
		JLabel lblSimonEffectuer = new JLabel("Simon - Effectuer un paiement");
		lblSimonEffectuer.setBounds(12, 12, 213, 15);
		panelSimon.add(lblSimonEffectuer);
		
		JPanel panelPatrick = new JPanel();
		tabbedPane.addTab("Patrick", null, panelPatrick, null);
		panelPatrick.setLayout(null);
		
		JLabel lblReserverUnVehicule = new JLabel("Reserver un vehicule");
		lblReserverUnVehicule.setBounds(12, 12, 188, 15);
		panelPatrick.add(lblReserverUnVehicule);
	}
}
