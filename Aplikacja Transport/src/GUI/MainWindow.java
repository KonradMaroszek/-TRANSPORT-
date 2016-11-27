package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.JDesktopPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.LayoutStyle.ComponentPlacement;
import net.miginfocom.swing.MigLayout;
import java.awt.List;
import javax.swing.JTable;
import javax.swing.JList;
import java.awt.Choice;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow {

	private JFrame frmAplikacjaTransport;
	private JTextField EmployessMainTextName;
	private JTextField EmployessMainTextSurname;
	private JTextField EmployessMainTextAge;
	private JTextField EmployessMainTextHolidays;
	private JTextField EmployessMainTextNumber;
	private JTextField EmployessPersonalDataTextName;
	private JTextField EmployessPersonalDataTextSecondName;
	private JTextField EmployessPersonalDataTextSurname;
	private JTextField EmployessPersonalDataTextDateOfBirth;
	private JTextField EmployessPersonalDataTextAge;
	private JTextField EmployessPersonalDataTextPhoneNumberTwo;
	private JTextField EmployessPersonalDataTextPhoneNumberOne;
	private JTextField EmployessPersonalDataTextPeselNumber;
	private JTextField EmployessPersonalDataTextEvidenceNumber;
	private JTextField EmployessPersonalDataTextCountry;
	private JTextField EmployessPersonalDataTextLand;
	private JTextField EmployessPersonalDataTextCity;
	private JTextField EmployessPersonalDataTextPostalCode;
	private JTextField EmployessPersonalDataTextLocalNumber;
	private JTextField EmployessPersonalDataTextStreet;
	private JTextField EmployessPersonalDataTextWorkplaceAddress;
	private JTextField VehiclesMainTextEnigne;
	private JTextField VehiclesMainTextModel;
	private JTextField VehiclesMainTextBrand;
	private JTextField VehiclesMainTextOverview;
	private JTextField VehiclesMainTextMileage;
	private JTextField VehiclesMainTextFuel;
	private JTextField InstytutionMainTextName;
	private JTextField InstytutionMainTextYear;
	private JTextField InstytutionMainTextLoses;
	private JTextField InstytutionMainTextStreet;
	private JTextField InstytutionMainTextBuldingNumber;
	private JTextField InstytutionMainTextCity;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTable EmployessTasksHistoryTable;
	private JTable EmployessVehiclesTable;
	private JTable EmployessCalendarTable;
	private JTextField VehiclesMainTextCapacity;
	private JTextField VehiclesInformationTextTopSpeed;
	private JTextField VehiclesInformationTextChassisNumber;
	private JTextField VehiclesInformationTextSelfMass;
	private JTextField VehiclesInformationTextMaxCapacity;
	private JTextField VehiclesInformationTextRegistrationNumber;
	private JTextField VehiclesInformationTextFirstRegistration;
	private JTextField VehiclesInformationTextCountry;
	private JTextField VehiclesInformationTextYear;
	private JTextField VehiclesInformationTextModel;
	private JTextField VehiclesInformationTextBrand;
	private JTextField VehiclesInformationTextEngineNumber;
	private JTextField VehiclesInformationTextEngineCapacity;
	private JTextField VehiclesInformationTextOil;
	private JTextField VehiclesInformationTextMilage;
	private JTable table;
	private JTable table_1;
	private JTable InstytutionEmployeesTable;
	private JTextField InstytutionMainTextCountry;
	private JTextField InstytutionInformationTextName;
	private JTextField InstytutionInformationYear;
	private JTextField InstytutionInformationTextManager;
	private JTextField InstytutionInformationTextDirector;
	private JTextField InstytutionInformationTextSecrurity;
	private JTextField InstytutionInformationTextLoses;
	private JTextField InstytutionInformationTextEarnings;
	private JTextField InstytutionInformationTextTurnover;
	private JTextField InstytutionInformationTextStreet;
	private JTextField InstytutionInformationTextBuldingNumber;
	private JTextField InstytutionInformationTextCity;
	private JTextField InstytutionInformationTextLand;
	private JTextField InstytutionInformationTextCountry;
	private JTable InstytutionEquipmentTable;
	private JTextField InstytutionInformationTextPostalCode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmAplikacjaTransport.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAplikacjaTransport = new JFrame();
		frmAplikacjaTransport.setResizable(false);
		frmAplikacjaTransport.setTitle("Aplikacja Transport");
		frmAplikacjaTransport.setBounds(100, 100, 1080, 740);
		frmAplikacjaTransport.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAplikacjaTransport.getContentPane().setLayout(new BoxLayout(frmAplikacjaTransport.getContentPane(), BoxLayout.X_AXIS));
		
		JTabbedPane TabPanel = new JTabbedPane(JTabbedPane.TOP);
		TabPanel.setBackground(Color.LIGHT_GRAY);
		
		JPanel MainMenuPanle = new JPanel();
		TabPanel.addTab("Menu g\u0142\u00F3wne", new ImageIcon(MainWindow.class.getResource("/resources/menu.png")), MainMenuPanle, null);
		MainMenuPanle.setLayout(null);
		frmAplikacjaTransport.getContentPane().add(TabPanel);
		
		JPanel EmployeesPanel = new JPanel();
		TabPanel.addTab("Pracownicy", new ImageIcon(MainWindow.class.getResource("/resources/pracownicy.png")), EmployeesPanel, null);
		
		JLabel EmployeesPhotoLabel = new JLabel("");
		EmployeesPhotoLabel.setBounds(7, 38, 230, 217);
		EmployeesPhotoLabel.setIcon(new ImageIcon(MainWindow.class.getResource("/resources/brakzdjecia.png")));
		
		JLabel lblNewLabel = new JLabel("Imi\u0119:");
		lblNewLabel.setBounds(247, 83, 90, 20);
		
		JLabel lblNazwisko = new JLabel("Nazwisko:");
		lblNazwisko.setBounds(247, 125, 90, 20);
		
		JLabel lblWiek = new JLabel("Wiek:");
		lblWiek.setBounds(247, 167, 90, 20);
		
		JLabel lblMiejscePracy = new JLabel("Miejsce Pracy:");
		lblMiejscePracy.setBounds(557, 167, 110, 20);
		
		EmployessMainTextName = new JTextField();
		EmployessMainTextName.setBounds(347, 83, 200, 20);
		EmployessMainTextName.setColumns(10);
		
		EmployessMainTextSurname = new JTextField();
		EmployessMainTextSurname.setBounds(347, 125, 200, 20);
		EmployessMainTextSurname.setColumns(10);
		
		EmployessMainTextAge = new JTextField();
		EmployessMainTextAge.setBounds(347, 167, 200, 20);
		EmployessMainTextAge.setColumns(10);
		EmployeesPanel.setLayout(null);
		EmployeesPanel.add(EmployeesPhotoLabel);
		EmployeesPanel.add(lblNewLabel);
		EmployeesPanel.add(lblNazwisko);
		EmployeesPanel.add(lblWiek);
		EmployeesPanel.add(lblMiejscePracy);
		EmployeesPanel.add(EmployessMainTextName);
		EmployeesPanel.add(EmployessMainTextSurname);
		EmployeesPanel.add(EmployessMainTextAge);
		
		JLabel lblNajbliszyDzieWolny = new JLabel("Najbli\u017Cszy urlop:\r\n");
		lblNajbliszyDzieWolny.setBounds(557, 83, 122, 20);
		EmployeesPanel.add(lblNajbliszyDzieWolny);
		
		JLabel lblUlubionyPojazd = new JLabel("Numer konraktowy:");
		lblUlubionyPojazd.setBounds(557, 125, 122, 20);
		EmployeesPanel.add(lblUlubionyPojazd);
		
		EmployessMainTextHolidays = new JTextField();
		EmployessMainTextHolidays.setColumns(10);
		EmployessMainTextHolidays.setBounds(678, 83, 200, 20);
		EmployeesPanel.add(EmployessMainTextHolidays);
		
		EmployessMainTextNumber = new JTextField();
		EmployessMainTextNumber.setColumns(10);
		EmployessMainTextNumber.setBounds(678, 125, 200, 20);
		EmployeesPanel.add(EmployessMainTextNumber);
		
		JButton btnNewButton = new JButton("wyszukaj pracownika");
		btnNewButton.setBounds(888, 82, 171, 23);
		EmployeesPanel.add(btnNewButton);
		
		JButton btnDodaj = new JButton("dodaj pracownika");
		btnDodaj.setBounds(888, 124, 171, 23);
		EmployeesPanel.add(btnDodaj);
		
		JButton btnUsu = new JButton("usu\u0144 pracownika");
		btnUsu.setBounds(888, 166, 171, 23);
		EmployeesPanel.add(btnUsu);
		
		Choice EmployessMainChoiceWorkplace = new Choice();
		EmployessMainChoiceWorkplace.setBounds(678, 167, 200, 20);
		EmployeesPanel.add(EmployessMainChoiceWorkplace);
		
		JTabbedPane EmployessTabbedPanel = new JTabbedPane(JTabbedPane.TOP);
		EmployessTabbedPanel.setBackground(Color.LIGHT_GRAY);
		EmployessTabbedPanel.setBounds(7, 266, 1052, 365);
		EmployeesPanel.add(EmployessTabbedPanel);
		
		JPanel EmployessPersonalData = new JPanel();
		EmployessTabbedPanel.addTab("dane ", new ImageIcon(MainWindow.class.getResource("/images32x32/profil.png")), EmployessPersonalData, null);
		EmployessPersonalData.setLayout(null);
		
		JLabel label = new JLabel("Imi\u0119:");
		label.setBounds(10, 11, 100, 20);
		EmployessPersonalData.add(label);
		
		EmployessPersonalDataTextName = new JTextField();
		EmployessPersonalDataTextName.setColumns(10);
		EmployessPersonalDataTextName.setBounds(120, 11, 190, 20);
		EmployessPersonalData.add(EmployessPersonalDataTextName);
		
		JLabel lblNazwisko_1 = new JLabel("Nazwisko:");
		lblNazwisko_1.setBounds(10, 73, 90, 20);
		EmployessPersonalData.add(lblNazwisko_1);
		
		EmployessPersonalDataTextSecondName = new JTextField();
		EmployessPersonalDataTextSecondName.setColumns(10);
		EmployessPersonalDataTextSecondName.setBounds(120, 42, 190, 20);
		EmployessPersonalData.add(EmployessPersonalDataTextSecondName);
		
		JLabel lblNumerKonraktowy = new JLabel("Numer konraktowy 1:");
		lblNumerKonraktowy.setBounds(10, 231, 110, 20);
		EmployessPersonalData.add(lblNumerKonraktowy);
		
		EmployessPersonalDataTextSurname = new JTextField();
		EmployessPersonalDataTextSurname.setColumns(10);
		EmployessPersonalDataTextSurname.setBounds(120, 73, 190, 20);
		EmployessPersonalData.add(EmployessPersonalDataTextSurname);
		
		JLabel lblNumerKonraktowy_1 = new JLabel("Numer konraktowy 2:");
		lblNumerKonraktowy_1.setBounds(10, 262, 110, 20);
		EmployessPersonalData.add(lblNumerKonraktowy_1);
		
		EmployessPersonalDataTextDateOfBirth = new JTextField();
		EmployessPersonalDataTextDateOfBirth.setColumns(10);
		EmployessPersonalDataTextDateOfBirth.setBounds(120, 104, 190, 20);
		EmployessPersonalData.add(EmployessPersonalDataTextDateOfBirth);
		
		EmployessPersonalDataTextAge = new JTextField();
		EmployessPersonalDataTextAge.setColumns(10);
		EmployessPersonalDataTextAge.setBounds(120, 138, 190, 20);
		EmployessPersonalData.add(EmployessPersonalDataTextAge);
		
		JLabel lblNumerPesel = new JLabel("Numer pesel:");
		lblNumerPesel.setBounds(10, 200, 110, 20);
		EmployessPersonalData.add(lblNumerPesel);
		
		JLabel lblNumerDowodul = new JLabel("Numer dowodu:");
		lblNumerDowodul.setBounds(10, 169, 110, 20);
		EmployessPersonalData.add(lblNumerDowodul);
		
		JLabel lblWiek_1 = new JLabel("Wiek:");
		lblWiek_1.setBounds(10, 138, 110, 20);
		EmployessPersonalData.add(lblWiek_1);
		
		JLabel lblMiejscePracy_1 = new JLabel("Miejsce pracy");
		lblMiejscePracy_1.setBounds(333, 200, 110, 20);
		EmployessPersonalData.add(lblMiejscePracy_1);
		
		JLabel lblDrugieImi = new JLabel("Drugie imi\u0119:");
		lblDrugieImi.setBounds(10, 42, 110, 20);
		EmployessPersonalData.add(lblDrugieImi);
		
		EmployessPersonalDataTextPhoneNumberTwo = new JTextField();
		EmployessPersonalDataTextPhoneNumberTwo.setColumns(10);
		EmployessPersonalDataTextPhoneNumberTwo.setBounds(120, 262, 190, 20);
		EmployessPersonalData.add(EmployessPersonalDataTextPhoneNumberTwo);
		
		EmployessPersonalDataTextPhoneNumberOne = new JTextField();
		EmployessPersonalDataTextPhoneNumberOne.setColumns(10);
		EmployessPersonalDataTextPhoneNumberOne.setBounds(120, 231, 190, 20);
		EmployessPersonalData.add(EmployessPersonalDataTextPhoneNumberOne);
		
		EmployessPersonalDataTextPeselNumber = new JTextField();
		EmployessPersonalDataTextPeselNumber.setColumns(10);
		EmployessPersonalDataTextPeselNumber.setBounds(120, 200, 190, 20);
		EmployessPersonalData.add(EmployessPersonalDataTextPeselNumber);
		
		EmployessPersonalDataTextEvidenceNumber = new JTextField();
		EmployessPersonalDataTextEvidenceNumber.setColumns(10);
		EmployessPersonalDataTextEvidenceNumber.setBounds(120, 169, 190, 20);
		EmployessPersonalData.add(EmployessPersonalDataTextEvidenceNumber);
		
		Choice EmployessPersonalDataChoiceWorkplace = new Choice();
		EmployessPersonalDataChoiceWorkplace.setBounds(449, 200, 190, 20);
		EmployessPersonalData.add(EmployessPersonalDataChoiceWorkplace);
		
		JLabel lblDataUrodzenia = new JLabel("Data urodzenia:");
		lblDataUrodzenia.setBounds(10, 104, 110, 20);
		EmployessPersonalData.add(lblDataUrodzenia);
		
		JLabel lblPastwo = new JLabel("Pa\u0144stwo");
		lblPastwo.setBounds(333, 169, 110, 20);
		EmployessPersonalData.add(lblPastwo);
		
		JLabel lblMiasto = new JLabel("Miasto");
		lblMiasto.setBounds(333, 104, 110, 20);
		EmployessPersonalData.add(lblMiasto);
		
		JLabel lblUlica = new JLabel("Ulica");
		lblUlica.setBounds(333, 11, 110, 20);
		EmployessPersonalData.add(lblUlica);
		
		JLabel lblWojewdztwo = new JLabel("Wojew\u00F3dztwo");
		lblWojewdztwo.setBounds(333, 138, 110, 20);
		EmployessPersonalData.add(lblWojewdztwo);
		
		JLabel lblKodPocztowy = new JLabel("Kod pocztowy");
		lblKodPocztowy.setBounds(333, 73, 110, 20);
		EmployessPersonalData.add(lblKodPocztowy);
		
		JLabel lblNumerLokalu = new JLabel("Numer Lokalu");
		lblNumerLokalu.setBounds(333, 42, 110, 20);
		EmployessPersonalData.add(lblNumerLokalu);
		
		JLabel lblAdresMiejscaPracy = new JLabel("Adres miejsca pracy");
		lblAdresMiejscaPracy.setBounds(333, 234, 110, 20);
		EmployessPersonalData.add(lblAdresMiejscaPracy);
		
		EmployessPersonalDataTextCountry = new JTextField();
		EmployessPersonalDataTextCountry.setColumns(10);
		EmployessPersonalDataTextCountry.setBounds(449, 169, 190, 20);
		EmployessPersonalData.add(EmployessPersonalDataTextCountry);
		
		EmployessPersonalDataTextLand = new JTextField();
		EmployessPersonalDataTextLand.setColumns(10);
		EmployessPersonalDataTextLand.setBounds(449, 138, 190, 20);
		EmployessPersonalData.add(EmployessPersonalDataTextLand);
		
		EmployessPersonalDataTextCity = new JTextField();
		EmployessPersonalDataTextCity.setColumns(10);
		EmployessPersonalDataTextCity.setBounds(449, 104, 190, 20);
		EmployessPersonalData.add(EmployessPersonalDataTextCity);
		
		EmployessPersonalDataTextPostalCode = new JTextField();
		EmployessPersonalDataTextPostalCode.setColumns(10);
		EmployessPersonalDataTextPostalCode.setBounds(449, 73, 190, 20);
		EmployessPersonalData.add(EmployessPersonalDataTextPostalCode);
		
		EmployessPersonalDataTextLocalNumber = new JTextField();
		EmployessPersonalDataTextLocalNumber.setColumns(10);
		EmployessPersonalDataTextLocalNumber.setBounds(449, 42, 190, 20);
		EmployessPersonalData.add(EmployessPersonalDataTextLocalNumber);
		
		EmployessPersonalDataTextStreet = new JTextField();
		EmployessPersonalDataTextStreet.setColumns(10);
		EmployessPersonalDataTextStreet.setBounds(449, 11, 190, 20);
		EmployessPersonalData.add(EmployessPersonalDataTextStreet);
		
		EmployessPersonalDataTextWorkplaceAddress = new JTextField();
		EmployessPersonalDataTextWorkplaceAddress.setColumns(10);
		EmployessPersonalDataTextWorkplaceAddress.setBounds(449, 231, 190, 20);
		EmployessPersonalData.add(EmployessPersonalDataTextWorkplaceAddress);
		
		JLabel lblTypUmowyO = new JLabel("Typ umowy o prac\u0119:");
		lblTypUmowyO.setBounds(333, 262, 110, 20);
		EmployessPersonalData.add(lblTypUmowyO);
		
		Choice EmployessPersonalDataChoiceConctractOfEmployment = new Choice();
		EmployessPersonalDataChoiceConctractOfEmployment.setBounds(449, 262, 190, 20);
		EmployessPersonalData.add(EmployessPersonalDataChoiceConctractOfEmployment);
		
		JLabel lblUwagidodatkoweInformacji = new JLabel("Uwagi/dodatkowe informacje:");
		lblUwagidodatkoweInformacji.setBounds(665, 11, 372, 20);
		EmployessPersonalData.add(lblUwagidodatkoweInformacji);
		
		JTextArea EmployessPersonalDataTextAreaExtraInformation = new JTextArea();
		EmployessPersonalDataTextAreaExtraInformation.setBounds(665, 45, 372, 238);
		EmployessPersonalData.add(EmployessPersonalDataTextAreaExtraInformation);
		
		JPanel EmployessCurrentTask = new JPanel();
		EmployessTabbedPanel.addTab("aktualne zadnie", new ImageIcon(MainWindow.class.getResource("/images32x32/zadanie.png")), EmployessCurrentTask, null);
		EmployessCurrentTask.setLayout(null);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(90, 28, 236, 14);
		EmployessCurrentTask.add(progressBar);
		
		JLabel lblPostp = new JLabel("Post\u0119p: ");
		lblPostp.setBounds(10, 28, 46, 14);
		EmployessCurrentTask.add(lblPostp);
		
		JPanel EmployessVehicles = new JPanel();
		EmployessTabbedPanel.addTab("dost\u0119pne pojazdy", new ImageIcon(MainWindow.class.getResource("/images32x32/pojazd.png")), EmployessVehicles, null);
		EmployessVehicles.setLayout(null);
		
		EmployessVehiclesTable = new JTable();
		EmployessVehiclesTable.setBounds(10, 11, 859, 293);
		EmployessVehicles.add(EmployessVehiclesTable);
		
		JButton EmployessVehiclesButtonDetails = new JButton("Szczeg\u00F3\u0142y...");
		EmployessVehiclesButtonDetails.setBounds(870, 11, 167, 23);
		EmployessVehicles.add(EmployessVehiclesButtonDetails);
		
		JPanel EmployessTasksHistory = new JPanel();
		EmployessTabbedPanel.addTab("historia zada\u0144", new ImageIcon(MainWindow.class.getResource("/images32x32/zegarhistoria.png")), EmployessTasksHistory, null);
		EmployessTasksHistory.setLayout(null);
		
		EmployessTasksHistoryTable = new JTable();
		EmployessTasksHistoryTable.setBounds(10, 11, 859, 293);
		EmployessTasksHistory.add(EmployessTasksHistoryTable);
		
		JButton EmployessTasksHistoryButtonDetails = new JButton("Szczeg\u00F3\u0142y...");
		EmployessTasksHistoryButtonDetails.setBounds(870, 11, 167, 23);
		EmployessTasksHistory.add(EmployessTasksHistoryButtonDetails);
		
		JPanel EmployessCalendar = new JPanel();
		EmployessTabbedPanel.addTab("kalendarz pracy", new ImageIcon(MainWindow.class.getResource("/images32x32/kalendarz.png")), EmployessCalendar, null);
		EmployessCalendar.setLayout(null);
		
		EmployessCalendarTable = new JTable();
		EmployessCalendarTable.setBounds(10, 11, 859, 293);
		EmployessCalendar.add(EmployessCalendarTable);
		
		JButton button_14 = new JButton("Szczeg\u00F3\u0142y...");
		button_14.setBounds(870, 11, 167, 23);
		EmployessCalendar.add(button_14);
		
		JButton button_15 = new JButton("Szczeg\u00F3\u0142y...");
		button_15.setBounds(870, 45, 167, 23);
		EmployessCalendar.add(button_15);
		
		JButton button_16 = new JButton("Szczeg\u00F3\u0142y...");
		button_16.setBounds(870, 79, 167, 23);
		EmployessCalendar.add(button_16);
		
		JRadioButton EmployessMainRadioButtonEditMode = new JRadioButton("tryb edycji");
		EmployessMainRadioButtonEditMode.setBounds(347, 38, 200, 23);
		EmployeesPanel.add(EmployessMainRadioButtonEditMode);
		
		JPanel VehiclesPanel = new JPanel();
		TabPanel.addTab("Pojazdy", new ImageIcon(MainWindow.class.getResource("/resources/truck.png")), VehiclesPanel, null);
		VehiclesPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(MainWindow.class.getResource("/resources/grafiki/truckphoto.jpg")));
		lblNewLabel_1.setBounds(10, 24, 230, 230);
		VehiclesPanel.add(lblNewLabel_1);
		
		VehiclesMainTextEnigne = new JTextField();
		VehiclesMainTextEnigne.setColumns(10);
		VehiclesMainTextEnigne.setBounds(348, 153, 200, 20);
		VehiclesPanel.add(VehiclesMainTextEnigne);
		
		VehiclesMainTextModel = new JTextField();
		VehiclesMainTextModel.setColumns(10);
		VehiclesMainTextModel.setBounds(348, 111, 200, 20);
		VehiclesPanel.add(VehiclesMainTextModel);
		
		VehiclesMainTextBrand = new JTextField();
		VehiclesMainTextBrand.setColumns(10);
		VehiclesMainTextBrand.setBounds(348, 69, 200, 20);
		VehiclesPanel.add(VehiclesMainTextBrand);
		
		JLabel lblMarka = new JLabel("Marka:");
		lblMarka.setBounds(248, 69, 90, 20);
		VehiclesPanel.add(lblMarka);
		
		JLabel lblModel = new JLabel("Model:");
		lblModel.setBounds(248, 111, 90, 20);
		VehiclesPanel.add(lblModel);
		
		JLabel lblSilnik = new JLabel("Silnik:");
		lblSilnik.setBounds(248, 153, 90, 20);
		VehiclesPanel.add(lblSilnik);
		
		JLabel lblPojemno = new JLabel("Pojemno\u015B\u0107:");
		lblPojemno.setBounds(248, 190, 90, 20);
		VehiclesPanel.add(lblPojemno);
		
		JLabel lblSpalanie = new JLabel("Spalanie:");
		lblSpalanie.setBounds(578, 153, 102, 20);
		VehiclesPanel.add(lblSpalanie);
		
		JLabel lblPrzebieg = new JLabel("Przebieg:");
		lblPrzebieg.setBounds(578, 111, 102, 20);
		VehiclesPanel.add(lblPrzebieg);
		
		JLabel lblNajbliszyPrzeglad = new JLabel("Najbli\u017Cszy przegl\u0105d:\r\n");
		lblNajbliszyPrzeglad.setBounds(578, 69, 102, 20);
		VehiclesPanel.add(lblNajbliszyPrzeglad);
		
		VehiclesMainTextOverview = new JTextField();
		VehiclesMainTextOverview.setColumns(10);
		VehiclesMainTextOverview.setBounds(679, 69, 200, 20);
		VehiclesPanel.add(VehiclesMainTextOverview);
		
		VehiclesMainTextMileage = new JTextField();
		VehiclesMainTextMileage.setColumns(10);
		VehiclesMainTextMileage.setBounds(679, 111, 200, 20);
		VehiclesPanel.add(VehiclesMainTextMileage);
		
		VehiclesMainTextFuel = new JTextField();
		VehiclesMainTextFuel.setColumns(10);
		VehiclesMainTextFuel.setBounds(679, 153, 200, 20);
		VehiclesPanel.add(VehiclesMainTextFuel);
		
		JButton VehiclesMainButtonAdd = new JButton("dodaj pojazd");
		VehiclesMainButtonAdd.setBounds(889, 110, 171, 23);
		VehiclesPanel.add(VehiclesMainButtonAdd);
		
		JButton VehiclesMainButtonSearch = new JButton("wyszukaj pojazd");
		VehiclesMainButtonSearch.setBounds(889, 68, 171, 23);
		VehiclesPanel.add(VehiclesMainButtonSearch);
		
		JButton VehiclesMainButtonDelete = new JButton("usu\u0144 pojazd");
		VehiclesMainButtonDelete.setBounds(889, 152, 171, 23);
		VehiclesPanel.add(VehiclesMainButtonDelete);
		
		JRadioButton VehiclesMainRadioButtonEdit = new JRadioButton("tryb edycji");
		VehiclesMainRadioButtonEdit.setBounds(348, 24, 200, 23);
		VehiclesPanel.add(VehiclesMainRadioButtonEdit);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBackground(Color.LIGHT_GRAY);
		tabbedPane_1.setBounds(7, 271, 1052, 365);
		VehiclesPanel.add(tabbedPane_1);
		
		JPanel VehiclesInformation = new JPanel();
		tabbedPane_1.addTab("Informacje og\u00F3lne", new ImageIcon(MainWindow.class.getResource("/images32x32/truckicon.png")), VehiclesInformation, null);
		VehiclesInformation.setLayout(null);
		
		Choice VehiclesInformationChoiceDrive = new Choice();
		VehiclesInformationChoiceDrive.setBounds(449, 169, 190, 20);
		VehiclesInformation.add(VehiclesInformationChoiceDrive);
		
		Choice VehiclesInformationChoiceTrailer = new Choice();
		VehiclesInformationChoiceTrailer.setBounds(449, 200, 190, 20);
		VehiclesInformation.add(VehiclesInformationChoiceTrailer);
		
		VehiclesInformationTextTopSpeed = new JTextField();
		VehiclesInformationTextTopSpeed.setColumns(10);
		VehiclesInformationTextTopSpeed.setBounds(449, 138, 190, 20);
		VehiclesInformation.add(VehiclesInformationTextTopSpeed);
		
		JLabel lblNumerNadwozia = new JLabel("Numer nadwozia:");
		lblNumerNadwozia.setBounds(10, 262, 110, 20);
		VehiclesInformation.add(lblNumerNadwozia);
		
		VehiclesInformationTextChassisNumber = new JTextField();
		VehiclesInformationTextChassisNumber.setColumns(10);
		VehiclesInformationTextChassisNumber.setBounds(120, 262, 190, 20);
		VehiclesInformation.add(VehiclesInformationTextChassisNumber);
		
		VehiclesInformationTextSelfMass = new JTextField();
		VehiclesInformationTextSelfMass.setColumns(10);
		VehiclesInformationTextSelfMass.setBounds(120, 231, 190, 20);
		VehiclesInformation.add(VehiclesInformationTextSelfMass);
		
		JLabel lblMasaWasna = new JLabel("Masa w\u0142asna:");
		lblMasaWasna.setBounds(10, 231, 110, 20);
		VehiclesInformation.add(lblMasaWasna);
		
		JLabel lblMaxadowno = new JLabel("Max \u0141adowno\u015B\u0107:");
		lblMaxadowno.setBounds(10, 200, 110, 20);
		VehiclesInformation.add(lblMaxadowno);
		
		VehiclesInformationTextMaxCapacity = new JTextField();
		VehiclesInformationTextMaxCapacity.setColumns(10);
		VehiclesInformationTextMaxCapacity.setBounds(120, 200, 190, 20);
		VehiclesInformation.add(VehiclesInformationTextMaxCapacity);
		
		VehiclesInformationTextRegistrationNumber = new JTextField();
		VehiclesInformationTextRegistrationNumber.setColumns(10);
		VehiclesInformationTextRegistrationNumber.setBounds(120, 169, 190, 20);
		VehiclesInformation.add(VehiclesInformationTextRegistrationNumber);
		
		JLabel lblNumerRejestracji = new JLabel("Numer rejestracji:");
		lblNumerRejestracji.setBounds(10, 169, 110, 20);
		VehiclesInformation.add(lblNumerRejestracji);
		
		JLabel lblPierwszaRejestracja = new JLabel("Pierwsza rejestracja:");
		lblPierwszaRejestracja.setBounds(10, 138, 110, 20);
		VehiclesInformation.add(lblPierwszaRejestracja);
		
		VehiclesInformationTextFirstRegistration = new JTextField();
		VehiclesInformationTextFirstRegistration.setColumns(10);
		VehiclesInformationTextFirstRegistration.setBounds(120, 138, 190, 20);
		VehiclesInformation.add(VehiclesInformationTextFirstRegistration);
		
		VehiclesInformationTextCountry = new JTextField();
		VehiclesInformationTextCountry.setColumns(10);
		VehiclesInformationTextCountry.setBounds(120, 104, 190, 20);
		VehiclesInformation.add(VehiclesInformationTextCountry);
		
		JLabel lblKrajProdukcji = new JLabel("Kraj produkcji:");
		lblKrajProdukcji.setBounds(10, 104, 110, 20);
		VehiclesInformation.add(lblKrajProdukcji);
		
		JLabel lblRokProdukcji = new JLabel("Rok produkcji:");
		lblRokProdukcji.setBounds(10, 73, 90, 20);
		VehiclesInformation.add(lblRokProdukcji);
		
		VehiclesInformationTextYear = new JTextField();
		VehiclesInformationTextYear.setColumns(10);
		VehiclesInformationTextYear.setBounds(120, 73, 190, 20);
		VehiclesInformation.add(VehiclesInformationTextYear);
		
		VehiclesInformationTextModel = new JTextField();
		VehiclesInformationTextModel.setColumns(10);
		VehiclesInformationTextModel.setBounds(120, 42, 190, 20);
		VehiclesInformation.add(VehiclesInformationTextModel);
		
		JLabel lblModel_1 = new JLabel("Model:");
		lblModel_1.setBounds(10, 42, 110, 20);
		VehiclesInformation.add(lblModel_1);
		
		JLabel lblMarka_1 = new JLabel("Marka:");
		lblMarka_1.setBounds(10, 11, 100, 20);
		VehiclesInformation.add(lblMarka_1);
		
		VehiclesInformationTextBrand = new JTextField();
		VehiclesInformationTextBrand.setColumns(10);
		VehiclesInformationTextBrand.setBounds(120, 11, 190, 20);
		VehiclesInformation.add(VehiclesInformationTextBrand);
		
		VehiclesInformationTextEngineNumber = new JTextField();
		VehiclesInformationTextEngineNumber.setColumns(10);
		VehiclesInformationTextEngineNumber.setBounds(449, 11, 190, 20);
		VehiclesInformation.add(VehiclesInformationTextEngineNumber);
		
		VehiclesInformationTextEngineCapacity = new JTextField();
		VehiclesInformationTextEngineCapacity.setColumns(10);
		VehiclesInformationTextEngineCapacity.setBounds(449, 42, 190, 20);
		VehiclesInformation.add(VehiclesInformationTextEngineCapacity);
		
		VehiclesInformationTextOil = new JTextField();
		VehiclesInformationTextOil.setColumns(10);
		VehiclesInformationTextOil.setBounds(449, 73, 190, 20);
		VehiclesInformation.add(VehiclesInformationTextOil);
		
		VehiclesInformationTextMilage = new JTextField();
		VehiclesInformationTextMilage.setColumns(10);
		VehiclesInformationTextMilage.setBounds(449, 104, 190, 20);
		VehiclesInformation.add(VehiclesInformationTextMilage);
		
		JLabel lblRodzajNaczepy = new JLabel("Rodzaj naczepy:");
		lblRodzajNaczepy.setBounds(333, 200, 110, 20);
		VehiclesInformation.add(lblRodzajNaczepy);
		
		JLabel lblTypNaczepy = new JLabel("Rodzaj nap\u0119du:");
		lblTypNaczepy.setBounds(333, 169, 110, 20);
		VehiclesInformation.add(lblTypNaczepy);
		
		JLabel lblMaxPrdkos = new JLabel("Max pr\u0119dkos\u0107:");
		lblMaxPrdkos.setBounds(333, 138, 110, 20);
		VehiclesInformation.add(lblMaxPrdkos);
		
		JLabel lblPrzebieg_1 = new JLabel("Przebieg:");
		lblPrzebieg_1.setBounds(333, 104, 110, 20);
		VehiclesInformation.add(lblPrzebieg_1);
		
		JLabel lblZalecanyOlej = new JLabel("Zalecany olej:");
		lblZalecanyOlej.setBounds(333, 73, 110, 20);
		VehiclesInformation.add(lblZalecanyOlej);
		
		JLabel lblPojemnoSilnika = new JLabel("Pojemno\u015B\u0107 silnika:");
		lblPojemnoSilnika.setBounds(333, 42, 110, 20);
		VehiclesInformation.add(lblPojemnoSilnika);
		
		JLabel lblNumerSilnika = new JLabel("Numer silnika:");
		lblNumerSilnika.setBounds(333, 11, 110, 20);
		VehiclesInformation.add(lblNumerSilnika);
		
		JLabel label_36 = new JLabel("Uwagi/dodatkowe informacje:");
		label_36.setBounds(665, 11, 372, 20);
		VehiclesInformation.add(label_36);
		
		JTextArea VehiclesInformationTextAreaInformation = new JTextArea();
		VehiclesInformationTextAreaInformation.setBounds(665, 45, 372, 238);
		VehiclesInformation.add(VehiclesInformationTextAreaInformation);
		
		JPanel panel_6 = new JPanel();
		tabbedPane_1.addTab("Przegl\u0105dy", new ImageIcon(MainWindow.class.getResource("/images32x32/Mechanikas.png")), panel_6, null);
		panel_6.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 11, 859, 293);
		panel_6.add(table);
		
		JButton button = new JButton("Szczeg\u00F3\u0142y...");
		button.setBounds(870, 11, 167, 23);
		panel_6.add(button);
		
		JPanel panel_7 = new JPanel();
		tabbedPane_1.addTab("Trasy", new ImageIcon(MainWindow.class.getResource("/images32x32/road-map-icon-1.png")), panel_7, null);
		panel_7.setLayout(null);
		
		table_1 = new JTable();
		table_1.setBounds(10, 11, 859, 293);
		panel_7.add(table_1);
		
		JButton button_1 = new JButton("Szczeg\u00F3\u0142y...");
		button_1.setBounds(870, 11, 167, 23);
		panel_7.add(button_1);
		
		VehiclesMainTextCapacity = new JTextField();
		VehiclesMainTextCapacity.setColumns(10);
		VehiclesMainTextCapacity.setBounds(348, 190, 200, 20);
		VehiclesPanel.add(VehiclesMainTextCapacity);
		
		JPanel InstitutionPanel = new JPanel();
		TabPanel.addTab("Plac\u00F3wki", new ImageIcon(MainWindow.class.getResource("/resources/fabryka.png")), InstitutionPanel, null);
		InstitutionPanel.setLayout(null);
		
		JLabel InstytutionMainFactory = new JLabel("");
		InstytutionMainFactory.setIcon(new ImageIcon(MainWindow.class.getResource("/resources/noBuildingPhoto.png")));
		InstytutionMainFactory.setBounds(10, 39, 230, 230);
		InstitutionPanel.add(InstytutionMainFactory);
		
		JLabel lblTyp = new JLabel("Typ:");
		lblTyp.setBounds(248, 205, 90, 20);
		InstitutionPanel.add(lblTyp);
		
		JLabel lblMiesiczneOpaty = new JLabel("Miesi\u0119czne straty:");
		lblMiesiczneOpaty.setBounds(248, 168, 90, 20);
		InstitutionPanel.add(lblMiesiczneOpaty);
		
		JLabel lblRokPowstania = new JLabel("Rok powstania:");
		lblRokPowstania.setBounds(248, 126, 90, 20);
		InstitutionPanel.add(lblRokPowstania);
		
		JLabel lblNazwa = new JLabel("Nazwa:");
		lblNazwa.setBounds(248, 84, 90, 20);
		InstitutionPanel.add(lblNazwa);
		
		InstytutionMainTextName = new JTextField();
		InstytutionMainTextName.setColumns(10);
		InstytutionMainTextName.setBounds(348, 84, 200, 20);
		InstitutionPanel.add(InstytutionMainTextName);
		
		JRadioButton InstytutionMainRadioButtonEdit = new JRadioButton("tryb edycji");
		InstytutionMainRadioButtonEdit.setBounds(348, 39, 200, 23);
		InstitutionPanel.add(InstytutionMainRadioButtonEdit);
		
		InstytutionMainTextYear = new JTextField();
		InstytutionMainTextYear.setColumns(10);
		InstytutionMainTextYear.setBounds(348, 126, 200, 20);
		InstitutionPanel.add(InstytutionMainTextYear);
		
		InstytutionMainTextLoses = new JTextField();
		InstytutionMainTextLoses.setColumns(10);
		InstytutionMainTextLoses.setBounds(348, 168, 200, 20);
		InstitutionPanel.add(InstytutionMainTextLoses);
		
		Choice InstytutionMainChoiceType = new Choice();
		InstytutionMainChoiceType.setBounds(348, 205, 200, 20);
		InstitutionPanel.add(InstytutionMainChoiceType);
		
		JLabel lblMiasto_1 = new JLabel("Miasto:");
		lblMiasto_1.setBounds(578, 168, 102, 20);
		InstitutionPanel.add(lblMiasto_1);
		
		JLabel lblNumerLokalu_1 = new JLabel("Numer lokalu:");
		lblNumerLokalu_1.setBounds(578, 126, 102, 20);
		InstitutionPanel.add(lblNumerLokalu_1);
		
		JLabel lblUlica_1 = new JLabel("Ulica:");
		lblUlica_1.setBounds(578, 84, 102, 20);
		InstitutionPanel.add(lblUlica_1);
		
		InstytutionMainTextStreet = new JTextField();
		InstytutionMainTextStreet.setColumns(10);
		InstytutionMainTextStreet.setBounds(679, 84, 200, 20);
		InstitutionPanel.add(InstytutionMainTextStreet);
		
		InstytutionMainTextBuldingNumber = new JTextField();
		InstytutionMainTextBuldingNumber.setColumns(10);
		InstytutionMainTextBuldingNumber.setBounds(679, 126, 200, 20);
		InstitutionPanel.add(InstytutionMainTextBuldingNumber);
		
		InstytutionMainTextCity = new JTextField();
		InstytutionMainTextCity.setColumns(10);
		InstytutionMainTextCity.setBounds(679, 168, 200, 20);
		InstitutionPanel.add(InstytutionMainTextCity);
		
		JButton InstytutionMainButtonDelete = new JButton("usu\u0144 plac\u00F3wk\u0119");
		InstytutionMainButtonDelete.setBounds(889, 167, 171, 23);
		InstitutionPanel.add(InstytutionMainButtonDelete);
		
		JButton InstytutionMainButtonAdd = new JButton("dodaj plac\u00F3wk\u0119");
		InstytutionMainButtonAdd.setBounds(889, 125, 171, 23);
		InstitutionPanel.add(InstytutionMainButtonAdd);
		
		JButton InstytutionMainButtonSearch = new JButton("wyszukaj plac\u00F3wk\u0119");
		InstytutionMainButtonSearch.setBounds(889, 83, 171, 23);
		InstitutionPanel.add(InstytutionMainButtonSearch);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBackground(Color.LIGHT_GRAY);
		tabbedPane_2.setBounds(10, 280, 1052, 351);
		InstitutionPanel.add(tabbedPane_2);
		
		JPanel panel_8 = new JPanel();
		tabbedPane_2.addTab("Informacje og\u00F3lne", new ImageIcon(MainWindow.class.getResource("/images32x32/grafiki/Skyscraper_Information-512.png")), panel_8, null);
		panel_8.setLayout(null);
		
		InstytutionInformationTextName = new JTextField();
		InstytutionInformationTextName.setColumns(10);
		InstytutionInformationTextName.setBounds(120, 11, 190, 20);
		panel_8.add(InstytutionInformationTextName);
		
		InstytutionInformationYear = new JTextField();
		InstytutionInformationYear.setColumns(10);
		InstytutionInformationYear.setBounds(120, 42, 190, 20);
		panel_8.add(InstytutionInformationYear);
		
		InstytutionInformationTextManager = new JTextField();
		InstytutionInformationTextManager.setColumns(10);
		InstytutionInformationTextManager.setBounds(120, 73, 190, 20);
		panel_8.add(InstytutionInformationTextManager);
		
		InstytutionInformationTextDirector = new JTextField();
		InstytutionInformationTextDirector.setColumns(10);
		InstytutionInformationTextDirector.setBounds(120, 104, 190, 20);
		panel_8.add(InstytutionInformationTextDirector);
		
		InstytutionInformationTextSecrurity = new JTextField();
		InstytutionInformationTextSecrurity.setColumns(10);
		InstytutionInformationTextSecrurity.setBounds(120, 138, 190, 20);
		panel_8.add(InstytutionInformationTextSecrurity);
		
		InstytutionInformationTextLoses = new JTextField();
		InstytutionInformationTextLoses.setColumns(10);
		InstytutionInformationTextLoses.setBounds(120, 169, 190, 20);
		panel_8.add(InstytutionInformationTextLoses);
		
		InstytutionInformationTextEarnings = new JTextField();
		InstytutionInformationTextEarnings.setColumns(10);
		InstytutionInformationTextEarnings.setBounds(120, 200, 190, 20);
		panel_8.add(InstytutionInformationTextEarnings);
		
		InstytutionInformationTextTurnover = new JTextField();
		InstytutionInformationTextTurnover.setColumns(10);
		InstytutionInformationTextTurnover.setBounds(120, 231, 190, 20);
		panel_8.add(InstytutionInformationTextTurnover);
		
		JLabel lblTyp_1 = new JLabel("Typ:");
		lblTyp_1.setBounds(10, 262, 110, 20);
		panel_8.add(lblTyp_1);
		
		JLabel lblMiesiczneObroty = new JLabel("Miesi\u0119czne obroty:");
		lblMiesiczneObroty.setBounds(10, 231, 110, 20);
		panel_8.add(lblMiesiczneObroty);
		
		JLabel lblMiesiczneZarobki = new JLabel("Miesi\u0119czne zarobki:");
		lblMiesiczneZarobki.setBounds(10, 200, 110, 20);
		panel_8.add(lblMiesiczneZarobki);
		
		JLabel lblMiesiczneStraty = new JLabel("Miesi\u0119czne straty:");
		lblMiesiczneStraty.setBounds(10, 169, 110, 20);
		panel_8.add(lblMiesiczneStraty);
		
		JLabel lblFirmaOchroniarska = new JLabel("Firma ochroniarska:");
		lblFirmaOchroniarska.setBounds(10, 138, 110, 20);
		panel_8.add(lblFirmaOchroniarska);
		
		JLabel lblDyrektor = new JLabel("Dyrektor:");
		lblDyrektor.setBounds(10, 104, 110, 20);
		panel_8.add(lblDyrektor);
		
		JLabel lblLiczbaZatrudnionych = new JLabel("Kierownik:");
		lblLiczbaZatrudnionych.setBounds(10, 73, 90, 20);
		panel_8.add(lblLiczbaZatrudnionych);
		
		JLabel lblRokPowstania_1 = new JLabel("Rok powstania:");
		lblRokPowstania_1.setBounds(10, 42, 110, 20);
		panel_8.add(lblRokPowstania_1);
		
		JLabel lblNazwa_1 = new JLabel("Nazwa:");
		lblNazwa_1.setBounds(10, 11, 100, 20);
		panel_8.add(lblNazwa_1);
		
		InstytutionInformationTextStreet = new JTextField();
		InstytutionInformationTextStreet.setColumns(10);
		InstytutionInformationTextStreet.setBounds(449, 11, 190, 20);
		panel_8.add(InstytutionInformationTextStreet);
		
		InstytutionInformationTextBuldingNumber = new JTextField();
		InstytutionInformationTextBuldingNumber.setColumns(10);
		InstytutionInformationTextBuldingNumber.setBounds(449, 42, 190, 20);
		panel_8.add(InstytutionInformationTextBuldingNumber);
		
		InstytutionInformationTextCity = new JTextField();
		InstytutionInformationTextCity.setColumns(10);
		InstytutionInformationTextCity.setBounds(449, 73, 190, 20);
		panel_8.add(InstytutionInformationTextCity);
		
		JLabel lblWojewdztwo_1 = new JLabel("Wojew\u00F3dztwo:");
		lblWojewdztwo_1.setBounds(333, 104, 110, 20);
		panel_8.add(lblWojewdztwo_1);
		
		JLabel lblNumerLokalu_2 = new JLabel("Numer Lokalu:");
		lblNumerLokalu_2.setBounds(333, 42, 110, 20);
		panel_8.add(lblNumerLokalu_2);
		
		JLabel lblUlica_2 = new JLabel("Ulica:");
		lblUlica_2.setBounds(333, 11, 110, 20);
		panel_8.add(lblUlica_2);
		
		JLabel lblKraj_1 = new JLabel("Kraj:");
		lblKraj_1.setBounds(333, 138, 110, 20);
		panel_8.add(lblKraj_1);
		
		JLabel lblKontynent = new JLabel("Miasto:");
		lblKontynent.setBounds(333, 73, 110, 20);
		panel_8.add(lblKontynent);
		
		InstytutionInformationTextLand = new JTextField();
		InstytutionInformationTextLand.setColumns(10);
		InstytutionInformationTextLand.setBounds(449, 104, 190, 20);
		panel_8.add(InstytutionInformationTextLand);
		
		InstytutionInformationTextCountry = new JTextField();
		InstytutionInformationTextCountry.setColumns(10);
		InstytutionInformationTextCountry.setBounds(449, 138, 190, 20);
		panel_8.add(InstytutionInformationTextCountry);
		
		JTextArea InstytutionInformationTextAreaInformation = new JTextArea();
		InstytutionInformationTextAreaInformation.setBounds(665, 45, 372, 238);
		panel_8.add(InstytutionInformationTextAreaInformation);
		
		JLabel label_16 = new JLabel("Uwagi/dodatkowe informacje:");
		label_16.setBounds(665, 11, 372, 20);
		panel_8.add(label_16);
		
		JLabel lblKodPocztowy_1 = new JLabel("Kod pocztowy:");
		lblKodPocztowy_1.setBounds(333, 172, 110, 20);
		panel_8.add(lblKodPocztowy_1);
		
		InstytutionInformationTextPostalCode = new JTextField();
		InstytutionInformationTextPostalCode.setColumns(10);
		InstytutionInformationTextPostalCode.setBounds(449, 169, 190, 20);
		panel_8.add(InstytutionInformationTextPostalCode);
		
		Choice InstytutionInformationChoiceType = new Choice();
		InstytutionInformationChoiceType.setBounds(120, 262, 190, 20);
		panel_8.add(InstytutionInformationChoiceType);
		
		JPanel panel_9 = new JPanel();
		tabbedPane_2.addTab("Wyposa\u017Cenie", new ImageIcon(MainWindow.class.getResource("/images32x32/miot\u0142a.png")), panel_9, null);
		panel_9.setLayout(null);
		
		InstytutionEquipmentTable = new JTable();
		InstytutionEquipmentTable.setBounds(10, 11, 859, 293);
		panel_9.add(InstytutionEquipmentTable);
		
		JButton InstytutionEquipmentButtonAdd = new JButton("Dodaj");
		InstytutionEquipmentButtonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		InstytutionEquipmentButtonAdd.setBounds(870, 11, 167, 23);
		panel_9.add(InstytutionEquipmentButtonAdd);
		
		JButton InstytutionEquipmentButtonEdit = new JButton("Edytuj");
		InstytutionEquipmentButtonEdit.setBounds(870, 45, 167, 23);
		panel_9.add(InstytutionEquipmentButtonEdit);
		
		JButton InstytutionEquipmentButtonDelete = new JButton("Usu\u0144");
		InstytutionEquipmentButtonDelete.setBounds(870, 79, 167, 23);
		panel_9.add(InstytutionEquipmentButtonDelete);
		
		JPanel panel_10 = new JPanel();
		tabbedPane_2.addTab("Pracownicy", new ImageIcon(MainWindow.class.getResource("/images32x32/staff.png")), panel_10, null);
		panel_10.setLayout(null);
		
		InstytutionEmployeesTable = new JTable();
		InstytutionEmployeesTable.setBounds(10, 11, 859, 293);
		panel_10.add(InstytutionEmployeesTable);
		
		JButton InstytutionEmployeesButtonDetails = new JButton("Szczeg\u00F3\u0142y...");
		InstytutionEmployeesButtonDetails.setBounds(870, 11, 167, 23);
		panel_10.add(InstytutionEmployeesButtonDetails);
		
		JButton InstytutionEmployeesButtonAdd = new JButton("Dodaj");
		InstytutionEmployeesButtonAdd.setBounds(870, 45, 167, 23);
		panel_10.add(InstytutionEmployeesButtonAdd);
		
		JButton InstytutionEmployeesButtonEdit = new JButton("Edytuj");
		InstytutionEmployeesButtonEdit.setBounds(870, 79, 167, 23);
		panel_10.add(InstytutionEmployeesButtonEdit);
		
		JButton InstytutionEmployeesButtonDelete = new JButton("Usu\u0144");
		InstytutionEmployeesButtonDelete.setBounds(870, 113, 167, 23);
		panel_10.add(InstytutionEmployeesButtonDelete);
		
		JLabel lblKraj = new JLabel("Kraj:");
		lblKraj.setBounds(578, 205, 102, 20);
		InstitutionPanel.add(lblKraj);
		
		InstytutionMainTextCountry = new JTextField();
		InstytutionMainTextCountry.setColumns(10);
		InstytutionMainTextCountry.setBounds(679, 205, 200, 20);
		InstitutionPanel.add(InstytutionMainTextCountry);
		
		JPanel RoutePanel = new JPanel();
		TabPanel.addTab("Trasy", new ImageIcon(MainWindow.class.getResource("/resources/mapa.png")), RoutePanel, null);
		
		JPanel ContractorsPanel = new JPanel();
		TabPanel.addTab("Kontrahenci", new ImageIcon(MainWindow.class.getResource("/resources/uslugi_pracownicy.png")), ContractorsPanel, null);
		ContractorsPanel.setLayout(null);
		
		JLabel label_18 = new JLabel("Miejsce Pracy:");
		label_18.setBounds(214, 223, 90, 20);
		ContractorsPanel.add(label_18);
		
		JLabel label_19 = new JLabel("Wiek:");
		label_19.setBounds(214, 186, 90, 20);
		ContractorsPanel.add(label_19);
		
		JLabel label_20 = new JLabel("Nazwisko:");
		label_20.setBounds(214, 144, 90, 20);
		ContractorsPanel.add(label_20);
		
		JLabel label_21 = new JLabel("Imi\u0119:");
		label_21.setBounds(214, 102, 90, 20);
		ContractorsPanel.add(label_21);
		
		JRadioButton radioButton_2 = new JRadioButton("tryb edycji");
		radioButton_2.setBounds(314, 57, 200, 23);
		ContractorsPanel.add(radioButton_2);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(314, 102, 200, 20);
		ContractorsPanel.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(314, 144, 200, 20);
		ContractorsPanel.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(314, 186, 200, 20);
		ContractorsPanel.add(textField_39);
		
		Choice choice_5 = new Choice();
		choice_5.setBounds(314, 223, 200, 20);
		ContractorsPanel.add(choice_5);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(645, 223, 200, 20);
		ContractorsPanel.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(645, 186, 200, 20);
		ContractorsPanel.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(645, 144, 200, 20);
		ContractorsPanel.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(645, 102, 200, 20);
		ContractorsPanel.add(textField_43);
		
		JLabel label_22 = new JLabel("Najbli\u017Cszy urlop:\r\n");
		label_22.setBounds(544, 102, 102, 20);
		ContractorsPanel.add(label_22);
		
		JLabel label_23 = new JLabel("ulubiony pojazd:");
		label_23.setBounds(544, 144, 102, 20);
		ContractorsPanel.add(label_23);
		
		JLabel label_24 = new JLabel("costu");
		label_24.setBounds(544, 186, 102, 20);
		ContractorsPanel.add(label_24);
		
		JLabel label_25 = new JLabel("costu");
		label_25.setBounds(544, 223, 102, 20);
		ContractorsPanel.add(label_25);
		
		JButton button_8 = new JButton("usu\u0144 pracownika");
		button_8.setBounds(855, 222, 171, 23);
		ContractorsPanel.add(button_8);
		
		JButton button_9 = new JButton("edytuj\r\n pracownika");
		button_9.setBounds(855, 185, 171, 23);
		ContractorsPanel.add(button_9);
		
		JButton button_10 = new JButton("dodaj pracownika");
		button_10.setBounds(855, 143, 171, 23);
		ContractorsPanel.add(button_10);
		
		JButton button_11 = new JButton("wyszukaj pracownika");
		button_11.setBounds(855, 101, 171, 23);
		ContractorsPanel.add(button_11);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setBackground(Color.LIGHT_GRAY);
		tabbedPane_3.setBounds(10, 313, 1052, 329);
		ContractorsPanel.add(tabbedPane_3);
		
		JPanel panel_11 = new JPanel();
		tabbedPane_3.addTab("Informacje", new ImageIcon(MainWindow.class.getResource("/images32x32/user_info-32.png")), panel_11, null);
		
		JPanel panel_12 = new JPanel();
		tabbedPane_3.addTab("Faktury", new ImageIcon(MainWindow.class.getResource("/images32x32/faktura.png")), panel_12, null);
		
		JPanel SettingsPanel = new JPanel();
		TabPanel.addTab("Ustawienia", new ImageIcon(MainWindow.class.getResource("/resources/ustawienia.png")), SettingsPanel, null);
	}
}
