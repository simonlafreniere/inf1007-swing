package inf1007;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.plaf.basic.BasicComboBoxRenderer;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JComboBox.KeySelectionManager;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Properties;
import java.awt.event.ActionEvent;

import org.jdesktop.swingx.JXDatePicker;

public class conception {

	private JFrame frame;
	private DossierClient DC;
	private CatalogueVehicule CV;
	private JComboBox<Item> comboBox;
	private JComboBox<Item> comboBox_1;

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
		DC = new DossierClient();
		CV = new CatalogueVehicule();
		fillData();
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
		lblReserverUnVehicule.setBounds(12, 17, 188, 15);
		panelPatrick.add(lblReserverUnVehicule);
		
		comboBox = new JComboBox<Item>();
		comboBox.setBounds(347, 12, 166, 24);
		panelPatrick.add(comboBox);
		
		comboBox_1 = new JComboBox<Item>();
		comboBox_1.setBounds(347, 50, 166, 24);
		panelPatrick.add(comboBox_1);
		
		JXDatePicker picker = new JXDatePicker(new Date());
		picker.setBounds(347,80,140,30);
		panelPatrick.add(picker);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(347, 156, 166, 25);
		panelPatrick.add(btnNewButton);
		
		JLabel lblClient = new JLabel("Client:");
		lblClient.setBounds(259, 17, 70, 15);
		panelPatrick.add(lblClient);
		
		JLabel lblVehicule = new JLabel("Vehicule:");
		lblVehicule.setBounds(240, 55, 70, 15);
		panelPatrick.add(lblVehicule);
		
	}
	
	private void fillData()
	{
		for(int i = 1; i <= 100; i++)
		{
			DC.ajouterClient(new Client(i, "Client " + i, "Prenom" + i, "Adresse" + i, "Ville" + i, "Province" + i, "CodePostal" + i, "Telephone" + i, "NoPermis" + i, "Courriel" + i));
			Item item = new Item("Nom" + i, DC.getClient(i - 1), null);
			comboBox.addItem(item);
		}
		
		for(int i = 1; i <= 1000; i++)
		{
			CV.ajouterVehicule(new Vehicule("IDVehicule" + i, "Vehicule " + i, "Type" + i, "Marque" + i, "Moteur" + i, 9785 + i));
			Item item = new Item("Vehicule" + i, null, CV.getVehicule(i - 1));
			comboBox_1.addItem(item);
		}
	}
}


