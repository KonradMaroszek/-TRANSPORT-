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

import Commons.TabGuardian;
import Commons.UserLogged;
import Database.DatabaseConnection;
import Database.Execute_command;
import Database.FetchQuery;
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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

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
	private Choice EmployessPersonalDataChoiceConctractOfEmployment;
	
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
	
	TabGuardian tabGuardian;
	ArrayList<String> panelsNames;
	JTabbedPane tabPanel;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;

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
		tabGuardian = new TabGuardian();
		panelsNames = new ArrayList<String>();
		tabPanel = new JTabbedPane();
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
		tabPanel = TabPanel;
		TabPanel.setBackground(Color.LIGHT_GRAY);
		frmAplikacjaTransport.getContentPane().add(TabPanel);
		
		JPanel MainMenuPanle = new JPanel();
		
		tabGuardian.addPanelToMap("Menu", MainMenuPanle);
		tabGuardian.addIconToMap("Menu", new ImageIcon(MainWindow.class.getResource("/resources/menu.png")));
		panelsNames.add("Menu");
		
		TabPanel.addTab("Menu g\u0142\u00F3wne", new ImageIcon(MainWindow.class.getResource("/resources/menu.png")), MainMenuPanle, null);
		MainMenuPanle.setLayout(new MigLayout("", "[][grow]", "[][][]"));
		
		JLabel lblLogin = new JLabel("Login");
		MainMenuPanle.add(lblLogin, "cell 0 0,alignx trailing");
		
		textField = new JTextField();
		MainMenuPanle.add(textField, "cell 1 0,growx");
		textField.setColumns(10);
		
		JLabel lblHaso = new JLabel("Has\u0142o");
		MainMenuPanle.add(lblHaso, "cell 0 1,alignx trailing");
		
		passwordField = new JPasswordField();
		MainMenuPanle.add(passwordField, "cell 1 1,growx");
		
		JButton btnNewButton_1 = new JButton("Zaloguj");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TUTAJ SPRAWDZASZ KTO SI� LOGUJE!  
				
				UserLogged.setUserType(UserLogged.UserType.ADMIN); // przypisujesz enuma tutaj
				
				HashMap<String, JPanel> panels = tabGuardian.getPanelMap();
				HashMap<String, ImageIcon> icons = tabGuardian.getIconsMap();
				
				if (UserLogged.getUserType() == UserLogged.UserType.ADMIN){
					panels.remove("Menu");
					icons.remove("Menu");
					
					for ( String name : panels.keySet()){
						tabPanel.addTab(name, icons.get(name), panels.get(name), null);
					}
					
				}else if (UserLogged.getUserType() == UserLogged.UserType.EMPLOYEE){
					panels.remove("Menu");
					icons.remove("Menu");
					
					panels.remove("Kontrahenci");
					icons.remove("Kontrahenci");
					
					for ( String name : panels.keySet()){
						tabPanel.addTab(name, icons.get(name), panels.get(name), null);
					}
					
				}else if (UserLogged.getUserType() == UserLogged.UserType.FORWARDER){
					panels.remove("Menu");
					icons.remove("Menu");
					
					panels.remove("Kontrahenci");
					icons.remove("Kontrahenci");
					
					panels.remove("Pracownicy");
					icons.remove("Pracownicy");
					
					for ( String name : panels.keySet()){
						tabPanel.addTab(name, icons.get(name), panels.get(name), null);
					}
				}
			}
		});
		btnNewButton_1.setHorizontalAlignment(SwingConstants.RIGHT);
		MainMenuPanle.add(btnNewButton_1, "cell 1 2");
		
		JPanel EmployeesPanel = new JPanel();
		tabGuardian.addPanelToMap("Pracownicy", EmployeesPanel);
		tabGuardian.addIconToMap("Pracownicy", new ImageIcon(MainWindow.class.getResource("/resources/pracownicy.png")));
		panelsNames.add("Pracownicy");
		
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
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) 
			{
					Future<ArrayList<Map<String, Object>>> result = get_personal_data();
					
					try {
						Map<String, Object> output = result.get().get(0); // TODO switching output records
						Future<ArrayList<Map<String, Object>>> result2 = get_building_data(output);
						setPersonalDataTextFields(output);
						set_building_adress(result2);
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ExecutionException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					catch (Exception e) {
						// TODO Auto-generated catch block
						brak_wynikow();
					}

			}

			
		});
		JButton btnDodaj = new JButton("dodaj pracownika");
		btnDodaj.setBounds(888, 124, 171, 23);
		btnDodaj.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String imie = EmployessPersonalDataTextName.getText();
				String nazwisko = EmployessPersonalDataTextSurname.getText();
				String drugie_imie = EmployessPersonalDataTextSecondName.getText();
				String data_ur = EmployessPersonalDataTextDateOfBirth.getText();
				String wiek = EmployessPersonalDataTextAge.getText();
				String nr_tel = EmployessPersonalDataTextPhoneNumberOne.getText();
				String pesel = EmployessPersonalDataTextPeselNumber.getText();
				String nr_dowodu = EmployessPersonalDataTextEvidenceNumber.getText();
				String ulica = EmployessPersonalDataTextStreet.getText();
				String nr_lokalu = EmployessPersonalDataTextLocalNumber.getText();
				String kod_pocztowy = EmployessPersonalDataTextPostalCode.getText();
				String miasto = EmployessPersonalDataTextCity.getText();
				String wojewodztwo = EmployessPersonalDataTextLand.getText();
				String kraj = EmployessPersonalDataTextCountry.getText();
				String adres_pracy = EmployessPersonalDataTextWorkplaceAddress.getText();
				String typ_umowy = EmployessPersonalDataChoiceConctractOfEmployment.getSelectedItem().toString();
				String check_existing_cmd = "select * from dane_osobowe join pracownicy " +
						                    "on dane_osobowe.daneid = pracownicy.id_danych_osobowych join adres" +
									   	    " on pracownicy.ID_ADRESU = adres.adresid where " +
						                    "dane_osobowe.imie = '"+imie+"' and dane_osobowe.nazwisko = '"+nazwisko+"' and dane_osobowe.pesel = '"+pesel+"'";
				Future<ArrayList<Map<String, Object>>> result = executeCommandAndWaitForOutput(check_existing_cmd);
				int size = 0;
				try {
					size = result.get().size();
				} catch (InterruptedException e2) {
					// TODO Auto-generated catch block
					size = 0;
				} catch (ExecutionException e2) {
					// TODO Auto-generated catch block
					size = 0;
				}
				if (!(size > 0))
				{
					String adr_id, building_id, car_id, worker_id, data_id;
					adr_id = building_id = car_id = worker_id = data_id = "";
					try {
						adr_id = get_adr_id().get().get(0).get("nextval").toString();
						worker_id = get_worker_id().get().get(0).get("nextval").toString();
						data_id = get_data_id().get().get(0).get("nextval").toString();
						String get_building_cmd ="Select * from budynki join adres on budynki.id_adresu = adres.adresid where ";
						get_building_cmd += "ulica = '"+adres_pracy.split(" ")[0]+"' and nr_lokalu = "+adres_pracy.split(" ")[1];
						Future<ArrayList<Map<String, Object>>> building = executeCommandAndWaitForOutput(get_building_cmd);
						building_id = building.get().get(0).get("budynkiid").toString();
						car_id = "1";
						

						
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						System.out.println("Couldnt add employee");
					} catch (ExecutionException e1) {
						// TODO Auto-generated catch block
						System.out.println("Couldnt add employee");
					}
					String insert_worker_cmd = get_insert_worker_cmd(typ_umowy, adr_id, building_id, car_id, worker_id,
							data_id);
					String insert_adres_cmd = get_insert_adres_cmd(ulica, nr_lokalu, kod_pocztowy, miasto, wojewodztwo,
							kraj, adr_id);
					String insert_data_cmd = get_insert_data_cmd(imie, nazwisko, drugie_imie, data_ur, nr_tel, pesel,
							nr_dowodu, data_id);

					insert_to_db(insert_worker_cmd, insert_adres_cmd, insert_data_cmd);
				}
				else
				{
					System.out.println("User exists.");
				}
				
			}

			
			
		});
		EmployeesPanel.add(btnDodaj);
		
		JButton btnUsu = new JButton("usu\u0144 pracownika");
		btnUsu.setBounds(888, 166, 171, 23);
		btnUsu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String imie = EmployessPersonalDataTextName.getText();
				String nazwisko = EmployessPersonalDataTextSurname.getText();
				String drugie_imie = EmployessPersonalDataTextSecondName.getText();
				String data_ur = EmployessPersonalDataTextDateOfBirth.getText();
				String wiek = EmployessPersonalDataTextAge.getText();
				String nr_tel = EmployessPersonalDataTextPhoneNumberOne.getText();
				String pesel = EmployessPersonalDataTextPeselNumber.getText();
				String nr_dowodu = EmployessPersonalDataTextEvidenceNumber.getText();
				String ulica = EmployessPersonalDataTextStreet.getText();
				String nr_lokalu = EmployessPersonalDataTextLocalNumber.getText();
				String kod_pocztowy = EmployessPersonalDataTextPostalCode.getText();
				String miasto = EmployessPersonalDataTextCity.getText();
				String wojewodztwo = EmployessPersonalDataTextLand.getText();
				String kraj = EmployessPersonalDataTextCountry.getText();
				
				try {
					String check_existing_cmd = "select * from dane_osobowe join pracownicy " +
		                    "on dane_osobowe.daneid = pracownicy.id_danych_osobowych join adres" +
					   	    " on pracownicy.ID_ADRESU = adres.adresid where " +
		                    "dane_osobowe.imie = '"+imie+"' and dane_osobowe.nazwisko = '"+nazwisko+"' and dane_osobowe.pesel = '"+pesel+"'";
					Future<ArrayList<Map<String, Object>>> result = executeCommandAndWaitForOutput(check_existing_cmd);
					String id_adr, id_danych, id_pracownika;
					id_adr = id_danych = id_pracownika = "";
					id_adr = result.get().get(0).get("id_adresu").toString();
					id_danych = result.get().get(0).get("id_danych_osobowych").toString();
					id_pracownika = result.get().get(0).get("pracownicyid").toString();
					String del_adr_cmd = "delete from adres where adresid = "+id_adr;
					String del_dane_cmd = "delete from dane_osobowe where daneid = "+id_danych;
					String del_pracownik_cmd = "delete from pracownicy where pracownicyid = "+id_pracownika;
					insert_to_db(del_pracownik_cmd, del_adr_cmd, del_dane_cmd);
					
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					System.out.println("Blad usuwania usera");
				} catch (ExecutionException e1) {
					// TODO Auto-generated catch block
					System.out.println("Blad usuwania usera");
				}
				
				
			}
			
		});
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
		EmployessPersonalDataChoiceConctractOfEmployment.add("Zlecenie");
		EmployessPersonalDataChoiceConctractOfEmployment.add("O prace");
		EmployessPersonalDataChoiceConctractOfEmployment.select(1);
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
		
		JButton button_4 = new JButton("");
		button_4.setIcon(new ImageIcon(MainWindow.class.getResource("/images32x32/leftarrow32.png")));
		button_4.setBounds(773, 11, 144, 35);
		EmployeesPanel.add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setIcon(new ImageIcon(MainWindow.class.getResource("/images32x32/rightarrow32.png")));
		button_5.setBounds(915, 11, 144, 35);
		EmployeesPanel.add(button_5);
		
		JPanel VehiclesPanel = new JPanel();
		tabGuardian.addPanelToMap("Pojazdy", VehiclesPanel);
		tabGuardian.addIconToMap("Pojazdy", new ImageIcon(MainWindow.class.getResource("/resources/truck.png")));
		panelsNames.add("Pojazdy");
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
		VehiclesMainButtonAdd.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub


				String spalanie = VehiclesMainTextFuel.getText();
				String maks_predkosc = VehiclesInformationTextTopSpeed.getText();
				String masa_wlasna = VehiclesInformationTextSelfMass.getText();
				String nr_podwozia = VehiclesInformationTextChassisNumber.getText();
				String maks_ladownosc = VehiclesInformationTextMaxCapacity.getText();
				String nr_rejestracyjny = VehiclesInformationTextRegistrationNumber.getText();
				String pierwsza_rejestracja = VehiclesInformationTextFirstRegistration.getText();
				String kraj = VehiclesInformationTextCountry.getText();
				String rocznik = VehiclesInformationTextYear.getText();
				String model = VehiclesInformationTextModel.getText();
				String marka = VehiclesInformationTextBrand.getText();
				String nr_silnika = VehiclesInformationTextEngineNumber.getText();
				String pojemnosc_silnika = VehiclesInformationTextEngineCapacity.getText();
				String olej = VehiclesInformationTextOil.getText();
				String przebieg = VehiclesInformationTextMilage.getText();
				String id_budynku = "1";
				String id_nastepnej_naprawy="1";
				String nastepny_przeglad = VehiclesMainTextOverview.getText();
				String rodzaj_naczepy = "Normalna";
				String rodzaj_napedu = "4x4";
				String id_wlasciciela = "1";
				
				
				String check_existing_cmd = "Select * from pojazdy join dowod_rejestracyjny_pojazdu on pojazdy.pojazdyid = dowod_rejestracyjny_pojazdu.id_pojazdu ";
				check_existing_cmd += "join karta_techniczna_pojazdu on pojazdy.pojazdyid = karta_techniczna_pojazdu.id_pojazdu where ";
				check_existing_cmd += "marka = '"+marka+"' and model = '"+model+"' and nr_rejestracyjny='"+nr_rejestracyjny+"'";
				
				Future<ArrayList<Map<String, Object>>> result = executeCommandAndWaitForOutput(check_existing_cmd);
				int size = 0;
				try {
					size = result.get().get(0).size();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					size = 0;
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					size = 0;
				}
				if(!(size > 0))
				{
					String pojazd_id = "";
					try {
						pojazd_id = get_car_id().get().get(0).get("nextval").toString();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (ExecutionException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					String insert_pojazd_cmd = "";
					String insert_karta_cmd = "";
					String insert_dowod_cmd = "";
					insert_pojazd_cmd += "Insert into pojazdy ( id_budynku, nastepny_przeglad, pojazdyid, id_ostatniej_naprawy) ";
					System.out.println(new Date().toString());
					insert_pojazd_cmd += "values ("+id_budynku+", TO_DATE('"+nastepny_przeglad+"', 'yyyy-mm-dd'), "+pojazd_id+", "+id_nastepnej_naprawy+")";
					insert_karta_cmd += "insert into karta_techniczna_pojazdu ";
					insert_karta_cmd += "(id_pojazdu, spalanie, rok_produkcji, max_ladownosc, nr_nadwozia, nr_silnika, pojemnosc_silnika, przebieg_w_km, max_predkosc, kraj_produkcji, pierwsza_rejestracja, masa_wlasna, zalecany_olej, rodzaj_napedu, rodzaj_naczepy, model) ";
					insert_karta_cmd += "values ("+pojazd_id+", "+spalanie+", "+rocznik+", "+maks_ladownosc+", "+nr_podwozia+", "+nr_silnika+", "+pojemnosc_silnika+", "+przebieg+", "+maks_predkosc+", '"+kraj+"', TO_DATE('"+pierwsza_rejestracja+"', 'yyyy-mm-dd'), "+masa_wlasna+", '"+olej+"', '"+rodzaj_napedu+"', '"+rodzaj_naczepy+"', '"+model+"')";
					insert_dowod_cmd += "insert into dowod_rejestracyjny_pojazdu (marka, nr_rejestracyjny, id_wlasciciela, rok_produkcji, id_pojazdu) ";
					insert_dowod_cmd += "values ('"+marka+"', '"+nr_rejestracyjny+"', "+id_wlasciciela+", "+rocznik+", "+pojazd_id+")";
					System.out.println(insert_dowod_cmd);
					System.out.println(insert_karta_cmd);
					insert_to_db(insert_pojazd_cmd, insert_karta_cmd, insert_dowod_cmd);
				}
				else System.out.println("Car already exists.");
				
			}
			
		});
		VehiclesPanel.add(VehiclesMainButtonAdd);
		
		JButton VehiclesMainButtonSearch = new JButton("wyszukaj pojazd");
		VehiclesMainButtonSearch.setBounds(889, 68, 171, 23);
		VehiclesMainButtonSearch.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String silnik = VehiclesMainTextEnigne.getText();
				String model = VehiclesMainTextModel.getText();
				String marka = VehiclesMainTextBrand.getText();
				String przebieg =  VehiclesMainTextMileage.getText();
				String spalanie = VehiclesMainTextFuel.getText();
				String pojemnosc_silnika = VehiclesMainTextCapacity.getText();
				String check_existing_cmd = "Select * from pojazdy join dowod_rejestracyjny_pojazdu on pojazdy.pojazdyid = dowod_rejestracyjny_pojazdu.id_pojazdu ";
				check_existing_cmd += "join karta_techniczna_pojazdu on pojazdy.pojazdyid = karta_techniczna_pojazdu.id_pojazdu where ";
				String search_by = "";
				if(!silnik.equals("")) 	{
					if(!search_by.equals("")) search_by += "and ";
					search_by += "przebieg = "+przebieg+" ";
				}
				if(!model.equals("")) 	{
					if(!search_by.equals("")) search_by += "and ";
					search_by += "model = '"+model+"' ";
				}
				if(!marka.equals("")) 	{
					if(!search_by.equals("")) search_by += "and ";
					search_by += "marka = '"+marka+"' ";
				}
				if(!spalanie.equals("")) 	{
					if(!search_by.equals("")) search_by += "and ";
					search_by += "spalanie = "+spalanie+" ";
				}
				if(!pojemnosc_silnika.equals("")) 	{
					if(!search_by.equals("")) search_by += "and ";
					search_by += "pojemnosc_silnika = "+pojemnosc_silnika+" ";
				}

				check_existing_cmd += search_by;

				Future<ArrayList<Map<String, Object>>> result = executeCommandAndWaitForOutput(check_existing_cmd);
				try {
					Map<String, Object> car = result.get().get(0);
					VehiclesMainTextFuel.setText(car.get("spalanie").toString());
					VehiclesInformationTextTopSpeed.setText(car.get("max_predkosc").toString());
					VehiclesInformationTextSelfMass.setText(car.get("masa_wlasna").toString());
					VehiclesInformationTextChassisNumber.setText(car.get("nr_nadwozia").toString());
					VehiclesInformationTextMaxCapacity.setText(car.get("max_ladownosc").toString());
					VehiclesInformationTextRegistrationNumber.setText(car.get("nr_rejestracyjny").toString());
					VehiclesInformationTextFirstRegistration.setText(car.get("pierwsza_rejestracja").toString().split(" ")[0]);
					VehiclesInformationTextCountry.setText(car.get("kraj_produkcji").toString());
					VehiclesInformationTextYear.setText(car.get("rok_produkcji").toString());
					VehiclesInformationTextModel.setText(car.get("model").toString());
					VehiclesInformationTextBrand.setText(car.get("marka").toString());
					VehiclesInformationTextEngineNumber.setText(car.get("nr_silnika").toString());
					VehiclesInformationTextEngineCapacity.setText(car.get("pojemnosc_silnika").toString());
					VehiclesInformationTextOil.setText(car.get("zalecany_olej").toString());
					VehiclesInformationTextMilage.setText(car.get("przebieg").toString());
					VehiclesMainTextOverview.setText(car.get("nastepny_przeglad").toString().split(" ")[0]);
					
				}  catch (Exception e1) {
					// TODO Auto-generated catch block
					System.out.println("No car found");
				}
			}
			
		});
		VehiclesPanel.add(VehiclesMainButtonSearch);
		
		JButton VehiclesMainButtonDelete = new JButton("usu\u0144 pojazd");
		VehiclesMainButtonDelete.setBounds(889, 152, 171, 23);
		VehiclesMainButtonDelete.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String nr_rejestracyjny = VehiclesInformationTextRegistrationNumber.getText();
				String model = VehiclesInformationTextModel.getText();
				String marka = VehiclesInformationTextBrand.getText();	
				
				String check_existing_cmd = "Select * from pojazdy join dowod_rejestracyjny_pojazdu on pojazdy.pojazdyid = dowod_rejestracyjny_pojazdu.id_pojazdu ";
				check_existing_cmd += "join karta_techniczna_pojazdu on pojazdy.pojazdyid = karta_techniczna_pojazdu.id_pojazdu where ";
				check_existing_cmd += "marka = '"+marka+"' and model = '"+model+"' and nr_rejestracyjny='"+nr_rejestracyjny+"'";

				Future<ArrayList<Map<String, Object>>> result = executeCommandAndWaitForOutput(check_existing_cmd);
				try {
					String id_pojazdu = result.get().get(0).get("pojazdyid").toString();
					String del_car_cmd = "delete from pojazdy where pojazdyid = "+id_pojazdu;
					String del_dowod_cmd = "delete from dowod_rejestracyjny_pojazdu where id_pojazdu = "+id_pojazdu;
					String del_karta_cmd = "delete from karta_techniczna_pojazdu where id_pojazdu = "+id_pojazdu;
					insert_to_db(del_car_cmd, del_dowod_cmd, del_karta_cmd);
				}catch (Exception e1) {
					// TODO Auto-generated catch block
					System.out.println("No such car exists.");
				}
				
			}
			
		});
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
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(MainWindow.class.getResource("/images32x32/leftarrow32.png")));
		btnNewButton_2.setSelectedIcon(new ImageIcon(MainWindow.class.getResource("/images32x32/Mechanikas.png")));
		btnNewButton_2.setBounds(772, 5, 144, 35);
		VehiclesPanel.add(btnNewButton_2);
		
		JButton btnNastpny = new JButton("");
		btnNastpny.setIcon(new ImageIcon(MainWindow.class.getResource("/images32x32/rightarrow32.png")));
		btnNastpny.setBounds(914, 5, 144, 35);
		VehiclesPanel.add(btnNastpny);
		
		JPanel InstitutionPanel = new JPanel();
		tabGuardian.addPanelToMap("Plac\u00F3wki", InstitutionPanel);
		tabGuardian.addIconToMap("Plac\u00F3wki", new ImageIcon(MainWindow.class.getResource("/resources/fabryka.png")));
		panelsNames.add("Plac\u00F3wki");
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
		
		JLabel lblRokPowstania = new JLabel("Data powstania:");
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
		InstytutionMainButtonDelete.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String nazwa = InstytutionInformationTextName.getText();
				String rok_powstania = InstytutionInformationYear.getText();
				String check_existing_cmd = "Select * from budynki join adres on budynki.id_adresu = adres.adresid where nazwa = '"+nazwa+"' and rok_powstania = TO_DATE('"+rok_powstania+"', 'yyyy-mm-dd')";
				Future<ArrayList<Map<String, Object>>> existing = executeCommandAndWaitForOutput(check_existing_cmd);
				
				try {
					String adres_id = existing.get().get(0).get("adresid").toString();
					String building_id = existing.get().get(0).get("budynkiid").toString();
					String del_building_cmd = "delete from budynki where budynkiid ="+building_id;
					String del_adr_cmd = "delete from adres where adresid ="+adres_id;
					insert_to_db(del_building_cmd, del_adr_cmd, "");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Couldnt delete building or adress");
				}
			}
			
		});
		InstitutionPanel.add(InstytutionMainButtonDelete);
		
		JButton InstytutionMainButtonAdd = new JButton("dodaj plac\u00F3wk\u0119");
		InstytutionMainButtonAdd.setBounds(889, 125, 171, 23);
		InstytutionMainButtonAdd.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				String nazwa = InstytutionInformationTextName.getText();
				String rok_powstania = InstytutionInformationYear.getText();
				String manager = InstytutionInformationTextManager.getText();
				String dyrektor = InstytutionInformationTextDirector.getText();
				String ochrona = InstytutionInformationTextSecrurity.getText();
				String straty = InstytutionInformationTextLoses.getText();
				String zarobki = InstytutionInformationTextEarnings.getText();
				String zysk = InstytutionInformationTextTurnover.getText();
				String ulica = InstytutionInformationTextStreet.getText();
				String nr_lokalu = InstytutionInformationTextBuldingNumber.getText();
				String miasto = InstytutionInformationTextCity.getText();
				String wojewodztwo = InstytutionInformationTextLand.getText();
				String kraj = InstytutionInformationTextCountry.getText();
				String kod_pocztowy = InstytutionInformationTextPostalCode.getText();
				String typ = "Placowka";
				try {
					String check_existing_adr_cmd = "Select * from adres where ulica ='"+ulica+"' and nr_lokalu = "+nr_lokalu+" and miasto = '"+miasto+"'";
					String check_existing_building_cmd = "Select * from budynki where nazwa = '"+nazwa+"' and rok_powstania = TO_DATE('"+rok_powstania+"', 'yyyy-mm-dd')";
					Future<ArrayList<Map<String, Object>>> existing_adr = executeCommandAndWaitForOutput(check_existing_adr_cmd);
					Future<ArrayList<Map<String, Object>>> existing_building = executeCommandAndWaitForOutput(check_existing_building_cmd);
					int b_size = 0, a_size = 0;
					try {
						b_size=existing_building.get().size();
						a_size=existing_adr.get().size();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						b_size = a_size = 0;
					}
					if(a_size <= 0 && b_size <= 0)
					{
						String adres_id = get_adr_id().get().get(0).get("nextval").toString();
						String insert_adres_cmd = get_insert_adres_cmd(ulica, nr_lokalu, kod_pocztowy, miasto, wojewodztwo,
								kraj, adres_id);
						String building_id = get_building_id().get().get(0).get("nextval").toString();
						String insert_building_cmd = "insert into budynki (budynkiid, nazwa, typ, id_adresu, rok_powstania, dyrektor, kierownik, FIRMA_OCHRONIARSKA, bilans_miesieczny, miesieczny_obrot) ";
						insert_building_cmd += "values ("+building_id+", '"+nazwa+"', '"+typ+"', "+adres_id+", TO_DATE('"+rok_powstania+"', 'yyyy-mm-dd'), '"+dyrektor+"', '"+manager+"', '"+ochrona+"', "+zysk+", "+zarobki+")";
						System.out.println(insert_building_cmd);
						insert_to_db(insert_adres_cmd, insert_building_cmd, "");
					}
					else System.out.println("Building or address already exists.");
				}catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Couldnt add new building");
				}
				
			}
			
		});
		InstitutionPanel.add(InstytutionMainButtonAdd);
		
		JButton InstytutionMainButtonSearch = new JButton("wyszukaj plac\u00F3wk\u0119");
		InstytutionMainButtonSearch.setBounds(889, 83, 171, 23);
		InstytutionMainButtonSearch.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String nazwa = InstytutionMainTextName.getText();
				String data_powstania = InstytutionMainTextYear.getText();
				String ulica = InstytutionMainTextStreet.getText();
				String nr_lokalu = InstytutionMainTextBuldingNumber.getText();
				String miasto = InstytutionMainTextCity.getText();
				String cmd = "Select * from budynki join adres on budynki.id_adresu = adres.adresid where ";
				String search_by = "";
				if(!nazwa.equals(""))
				{
					if(!search_by.equals("")) search_by += "and ";
					search_by += "nazwa = '"+nazwa+"' ";
				}
				if(!ulica.equals(""))
				{
					if(!search_by.equals("")) search_by += "and ";
					search_by += "ulica = '"+ulica+"' ";
				}
				if(!data_powstania.equals(""))
				{
					if(!search_by.equals("")) search_by += "and ";
					search_by += "rok_powstania = TO_DATE('"+data_powstania+"', 'yyyy-mm-dd') ";
				}
				if(!miasto.equals(""))
				{
					if(!search_by.equals("")) search_by += "and ";
					search_by += "miasto = '"+miasto+"' ";
				}
				if(!nr_lokalu.equals(""))
				{
					if(!search_by.equals("")) search_by += "and ";
					search_by += "nr_lokalu = "+nr_lokalu+" ";
				}
				cmd += search_by;
				System.out.println(cmd);
				Future<ArrayList<Map<String, Object>>> existing_building = executeCommandAndWaitForOutput(cmd);
				try {
					Map<String, Object> building = existing_building.get().get(0);
					InstytutionInformationTextName.setText(building.get("nazwa").toString());
					InstytutionInformationYear.setText(building.get("rok_powstania").toString().split(" ")[0]);
					InstytutionInformationTextManager.setText(building.get("kierownik").toString());
					InstytutionInformationTextDirector.setText(building.get("dyrektor").toString());
					InstytutionInformationTextSecrurity.setText(building.get("firma_ochroniarska").toString());
					
					
					String zarobki = building.get("miesieczny_obrot").toString();
					String zysk = building.get("bilans_miesieczny").toString();
//					int strata =  (Integer.parseInt(zarobki) - Integer.parseInt(zysk));
//					String straty = "" + strata;
					InstytutionInformationTextEarnings.setText(zarobki);
//					InstytutionInformationTextLoses.setText(straty);
					InstytutionInformationTextTurnover.setText(zysk);
					InstytutionInformationTextStreet.setText(building.get("ulica").toString());
					InstytutionInformationTextBuldingNumber.setText(building.get("nr_lokalu").toString());
					InstytutionInformationTextCity.setText(building.get("miasto").toString());
					InstytutionInformationTextLand.setText(building.get("wojewodztwo").toString());
					InstytutionInformationTextCountry.setText(building.get("kraj").toString());
					InstytutionInformationTextPostalCode.setText(building.get("kod_pocztowy").toString());
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("No such building.");
					
				}
			}
			
		});
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
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(MainWindow.class.getResource("/images32x32/leftarrow32.png")));
		button_2.setBounds(773, 6, 144, 35);
		InstitutionPanel.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(MainWindow.class.getResource("/images32x32/rightarrow32.png")));
		button_3.setBounds(915, 6, 144, 35);
		InstitutionPanel.add(button_3);
		
		JPanel RoutePanel = new JPanel();
		tabGuardian.addPanelToMap("Trasy", RoutePanel);
		tabGuardian.addIconToMap("Trasy", new ImageIcon(MainWindow.class.getResource("/resources/mapa.png")));
		panelsNames.add("Trasy");
		TabPanel.addTab("Trasy", new ImageIcon(MainWindow.class.getResource("/resources/mapa.png")), RoutePanel, null);
		RoutePanel.setLayout(null);
		
		JButton btnWyszukajTrase = new JButton("wyszukaj trase");
		btnWyszukajTrase.setBounds(888, 94, 171, 23);
		RoutePanel.add(btnWyszukajTrase);
		
		JButton btnDodajTrase = new JButton("dodaj trase");
		btnDodajTrase.setBounds(888, 131, 171, 23);
		RoutePanel.add(btnDodajTrase);
		
		JButton btnUsuTrase = new JButton("usu\u0144 trase");
		btnUsuTrase.setBounds(888, 165, 171, 23);
		RoutePanel.add(btnUsuTrase);
		
		JRadioButton radioButton = new JRadioButton("tryb edycji");
		radioButton.setBounds(888, 7, 171, 23);
		RoutePanel.add(radioButton);
		
		JLabel lblMiejsceDocelowe = new JLabel("Miejsce docelowe:");
		lblMiejsceDocelowe.setBounds(10, 58, 148, 20);
		RoutePanel.add(lblMiejsceDocelowe);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(610, 94, 190, 20);
		RoutePanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(610, 130, 190, 20);
		RoutePanel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(610, 161, 190, 20);
		RoutePanel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(610, 192, 190, 20);
		RoutePanel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(610, 223, 190, 20);
		RoutePanel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(610, 257, 190, 20);
		RoutePanel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(610, 288, 190, 20);
		RoutePanel.add(textField_7);
		
		JLabel label_1 = new JLabel("Kod pocztowy:");
		label_1.setBounds(494, 291, 110, 20);
		RoutePanel.add(label_1);
		
		JLabel label_2 = new JLabel("Kraj:");
		label_2.setBounds(494, 257, 110, 20);
		RoutePanel.add(label_2);
		
		JLabel label_3 = new JLabel("Wojew\u00F3dztwo:");
		label_3.setBounds(494, 223, 110, 20);
		RoutePanel.add(label_3);
		
		JLabel label_4 = new JLabel("Miasto:");
		label_4.setBounds(494, 192, 110, 20);
		RoutePanel.add(label_4);
		
		JLabel label_5 = new JLabel("Numer Lokalu:");
		label_5.setBounds(494, 161, 110, 20);
		RoutePanel.add(label_5);
		
		JLabel label_6 = new JLabel("Ulica:");
		label_6.setBounds(494, 130, 110, 20);
		RoutePanel.add(label_6);
		
		JLabel label_7 = new JLabel("Nazwa:");
		label_7.setBounds(494, 94, 100, 20);
		RoutePanel.add(label_7);
		
		JLabel label_8 = new JLabel("Nazwa:");
		label_8.setBounds(10, 94, 100, 20);
		RoutePanel.add(label_8);
		
		JLabel label_9 = new JLabel("Kod pocztowy:");
		label_9.setBounds(10, 291, 110, 20);
		RoutePanel.add(label_9);
		
		JLabel label_10 = new JLabel("Kraj:");
		label_10.setBounds(10, 257, 110, 20);
		RoutePanel.add(label_10);
		
		JLabel label_11 = new JLabel("Wojew\u00F3dztwo:");
		label_11.setBounds(10, 223, 110, 20);
		RoutePanel.add(label_11);
		
		JLabel label_12 = new JLabel("Miasto:");
		label_12.setBounds(10, 192, 110, 20);
		RoutePanel.add(label_12);
		
		JLabel label_13 = new JLabel("Numer Lokalu:");
		label_13.setBounds(10, 161, 110, 20);
		RoutePanel.add(label_13);
		
		JLabel label_14 = new JLabel("Ulica:");
		label_14.setBounds(10, 130, 110, 20);
		RoutePanel.add(label_14);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(126, 94, 190, 20);
		RoutePanel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(126, 130, 190, 20);
		RoutePanel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(126, 161, 190, 20);
		RoutePanel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(126, 192, 190, 20);
		RoutePanel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(126, 223, 190, 20);
		RoutePanel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(126, 257, 190, 20);
		RoutePanel.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(126, 288, 190, 20);
		RoutePanel.add(textField_14);
		
		JLabel lblMiejsceRozpoczciaTrasy = new JLabel("Miejsce rozpocz\u0119cia trasy:");
		lblMiejsceRozpoczciaTrasy.setBounds(494, 61, 226, 20);
		RoutePanel.add(lblMiejsceRozpoczciaTrasy);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(126, 576, 190, 20);
		RoutePanel.add(textField_15);
		
		JLabel label_15 = new JLabel("Kod pocztowy:");
		label_15.setBounds(10, 579, 110, 20);
		RoutePanel.add(label_15);
		
		JLabel label_17 = new JLabel("Kraj:");
		label_17.setBounds(10, 545, 110, 20);
		RoutePanel.add(label_17);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(126, 545, 190, 20);
		RoutePanel.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(126, 511, 190, 20);
		RoutePanel.add(textField_17);
		
		JLabel label_26 = new JLabel("Wojew\u00F3dztwo:");
		label_26.setBounds(10, 511, 110, 20);
		RoutePanel.add(label_26);
		
		JLabel label_27 = new JLabel("Miasto:");
		label_27.setBounds(10, 480, 110, 20);
		RoutePanel.add(label_27);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(126, 480, 190, 20);
		RoutePanel.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(126, 449, 190, 20);
		RoutePanel.add(textField_19);
		
		JLabel label_28 = new JLabel("Numer Lokalu:");
		label_28.setBounds(10, 449, 110, 20);
		RoutePanel.add(label_28);
		
		JLabel label_29 = new JLabel("Ulica:");
		label_29.setBounds(10, 418, 110, 20);
		RoutePanel.add(label_29);
		
		JLabel label_30 = new JLabel("Nazwa:");
		label_30.setBounds(10, 382, 100, 20);
		RoutePanel.add(label_30);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(126, 382, 190, 20);
		RoutePanel.add(textField_20);
		
		JLabel lblMiejsceZaadunku = new JLabel("Miejsce za\u0142adunku:");
		lblMiejsceZaadunku.setBounds(10, 349, 148, 20);
		RoutePanel.add(lblMiejsceZaadunku);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(610, 576, 190, 20);
		RoutePanel.add(textField_21);
		
		JLabel label_32 = new JLabel("Kod pocztowy:");
		label_32.setBounds(494, 579, 110, 20);
		RoutePanel.add(label_32);
		
		JLabel label_33 = new JLabel("Kraj:");
		label_33.setBounds(494, 545, 110, 20);
		RoutePanel.add(label_33);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(610, 545, 190, 20);
		RoutePanel.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(610, 511, 190, 20);
		RoutePanel.add(textField_23);
		
		JLabel label_34 = new JLabel("Wojew\u00F3dztwo:");
		label_34.setBounds(494, 511, 110, 20);
		RoutePanel.add(label_34);
		
		JLabel label_35 = new JLabel("Miasto:");
		label_35.setBounds(494, 480, 110, 20);
		RoutePanel.add(label_35);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(610, 480, 190, 20);
		RoutePanel.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(610, 449, 190, 20);
		RoutePanel.add(textField_25);
		
		JLabel label_37 = new JLabel("Numer Lokalu:");
		label_37.setBounds(494, 449, 110, 20);
		RoutePanel.add(label_37);
		
		JLabel label_38 = new JLabel("Ulica:");
		label_38.setBounds(494, 418, 110, 20);
		RoutePanel.add(label_38);
		
		JLabel label_39 = new JLabel("Nazwa:");
		label_39.setBounds(494, 382, 100, 20);
		RoutePanel.add(label_39);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(610, 382, 190, 20);
		RoutePanel.add(textField_26);
		
		JLabel lblMiejsceRozadunku = new JLabel("Miejsce roz\u0142adunku:");
		lblMiejsceRozadunku.setBounds(494, 349, 148, 20);
		RoutePanel.add(lblMiejsceRozadunku);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(126, 418, 190, 20);
		RoutePanel.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(610, 413, 190, 20);
		RoutePanel.add(textField_28);
		
		JButton button_6 = new JButton("");
		button_6.setIcon(new ImageIcon(MainWindow.class.getResource("/images32x32/leftarrow32.png")));
		button_6.setBounds(10, 7, 144, 35);
		RoutePanel.add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.setIcon(new ImageIcon(MainWindow.class.getResource("/images32x32/rightarrow32.png")));
		button_7.setBounds(152, 7, 144, 35);
		RoutePanel.add(button_7);
		
		JPanel ContractorsPanel = new JPanel();
		tabGuardian.addPanelToMap("Kontrahenci", ContractorsPanel);
		tabGuardian.addIconToMap("Kontrahenci", new ImageIcon(MainWindow.class.getResource("/resources/uslugi_pracownicy.png")));
		panelsNames.add("Kontrahenci");
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
		
		JButton button_12 = new JButton("");
		button_12.setIcon(new ImageIcon(MainWindow.class.getResource("/images32x32/leftarrow32.png")));
		button_12.setBounds(740, 11, 144, 35);
		ContractorsPanel.add(button_12);
		
		JButton button_13 = new JButton("");
		button_13.setIcon(new ImageIcon(MainWindow.class.getResource("/images32x32/rightarrow32.png")));
		button_13.setBounds(882, 11, 144, 35);
		ContractorsPanel.add(button_13);
		
		JPanel SettingsPanel = new JPanel();
		tabGuardian.addPanelToMap("Ustawienia", SettingsPanel);
		tabGuardian.addIconToMap("Ustawienia", new ImageIcon(MainWindow.class.getResource("/resources/ustawienia.png")));
		panelsNames.add("Ustawienia");
		TabPanel.addTab("Ustawienia", new ImageIcon(MainWindow.class.getResource("/resources/ustawienia.png")), SettingsPanel, null);	

		HashMap<String, JPanel> panels = tabGuardian.getPanelMap();
		panels.remove("Menu");
		
		for (JPanel panel : panels.values()){
			tabPanel.remove(panel);
		}
		
	}
	
	private void brak_wynikow() {
		// TODO Auto-generated method stub
		System.out.println("brak wynikow");
	}
	private String get_age_from_date(String data_ur) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date convertedCurrentDate = (Date) sdf.parse(data_ur);
		Date now =  new Date();
		long diff = now.getTime() - convertedCurrentDate.getTime();
		long days = TimeUnit.MILLISECONDS.toDays(diff); 
		String wiek = "" + (int) (days / 365);
		return wiek;
	}
	
	private void set_building_adress(Future<ArrayList<Map<String, Object>>> result2)
			throws InterruptedException, ExecutionException {
		Map<String, Object> output2 = result2.get().get(0);
		EmployessPersonalDataTextWorkplaceAddress.setText(output2.get("ulica").toString() + " " +
														  output2.get("nr_lokalu").toString());
	}

	private Future<ArrayList<Map<String, Object>>> get_building_data(Map<String, Object> output) {
		String get_budynek_cmd = "SELECT * from pracownicy join budynki on "+
								 "pracownicy.id_budynku = budynki.budynkiid join" +
								 " adres on budynki.id_adresu = adres.adresid where "+
								 "pracownicy.pracownicyid = " + output.get("pracownicyid");
		Future<ArrayList<Map<String, Object>>> result2 = executeCommandAndWaitForOutput(get_budynek_cmd);
		return result2;
	}

	private Future<ArrayList<Map<String, Object>>> get_personal_data() {
		String sql_condition = getSqlSearchCondition();
		String cmd = "select * from dane_osobowe join pracownicy " +
				     "on dane_osobowe.daneid = pracownicy.id_danych_osobowych join adres" +
				   	 " on pracownicy.ID_ADRESU = adres.adresid where " +
				   	 sql_condition;
		Future<ArrayList<Map<String, Object>>> result = executeCommandAndWaitForOutput(cmd);
		return result;
	}
	private Future<ArrayList<Map<String, Object>>> get_adr_id() {
		String cmd = "select ADRES_ID_SEQ.nextval from dual";
		Future<ArrayList<Map<String, Object>>> result = executeCommandAndWaitForOutput(cmd);
		return result;
	}
	private Future<ArrayList<Map<String, Object>>> get_worker_id() {
		String cmd = "select pracownik_ID_SEQ.nextval from dual";
		Future<ArrayList<Map<String, Object>>> result = executeCommandAndWaitForOutput(cmd);
		return result;
	}
	private Future<ArrayList<Map<String, Object>>> get_data_id() {
		String cmd = "select dane_ID_SEQ.nextval from dual";
		Future<ArrayList<Map<String, Object>>> result = executeCommandAndWaitForOutput(cmd);
		return result;
	}
	private Future<ArrayList<Map<String, Object>>> get_building_id() {
		String cmd = "select budynek_ID_SEQ.nextval from dual";
		Future<ArrayList<Map<String, Object>>> result = executeCommandAndWaitForOutput(cmd);
		return result;
	}
	private Future<ArrayList<Map<String, Object>>> get_car_id() {
		String cmd = "select pojazd_ID_SEQ.nextval from dual";
		Future<ArrayList<Map<String, Object>>> result = executeCommandAndWaitForOutput(cmd);
		return result;
	}
	private Future<ArrayList<Map<String, Object>>> executeCommandAndWaitForOutput(String cmd) {
		try {
			ExecutorService executor = Executors.newFixedThreadPool(2);
			executor.submit(new WaitForOutputAnimation());
			Future<ArrayList<Map<String, Object>>> result = executor.submit(new FetchQuery(cmd));
			while(!result.isDone());
			executor.shutdownNow();
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Wrong sql command");
			return null;
		}
		
	}
	private void insert_to_db(String insert_worker, String insert_adres, String insert_data) {
		try {
			ExecutorService executor = Executors.newFixedThreadPool(4);
			executor.submit(new WaitForOutputAnimation());
			if(!insert_worker.equals("")) executor.submit(new Execute_command(insert_worker));
			if(!insert_adres.equals("")) executor.submit(new Execute_command(insert_adres));
			if(!insert_data.equals("")) executor.submit(new Execute_command(insert_data));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Couldnt add worker, address or data.");
		}
	}
	private String get_insert_data_cmd(String imie, String nazwisko, String drugie_imie, String data_ur,
			String nr_tel, String pesel, String nr_dowodu, String data_id) {
		String insert_data_cmd = "";
		insert_data_cmd += "insert into dane_osobowe (imie ,nazwisko ,nr_tel, nr_dowodu, data_urodzenia ,pesel ,drugie_imie, daneid) ";
		insert_data_cmd += "values ('"+imie+"', '"+nazwisko+"', "+nr_tel+", '"+nr_dowodu+"', TO_DATE('"+data_ur+"', 'yyyy-mm-dd'), '"+pesel+"', '"+drugie_imie+"', "+data_id+")";
		return insert_data_cmd;
	}

	private String get_insert_adres_cmd(String ulica, String nr_lokalu, String kod_pocztowy, String miasto,
			String wojewodztwo, String kraj, String adr_id) {
		String insert_adres_cmd = "";
		insert_adres_cmd += "insert into adres (ulica ,miasto , nr_lokalu, kod_pocztowy, wojewodztwo, kraj, adresid) ";
		insert_adres_cmd += "values ('"+ulica+"', '"+miasto+"', "+nr_lokalu+", '"+kod_pocztowy+"', '"+wojewodztwo+"', '"+kraj+"', "+adr_id+")";
		return insert_adres_cmd;
	}

	private String get_insert_worker_cmd(String typ_umowy, String adr_id, String building_id, String car_id,
			String worker_id, String data_id) {
		String insert_worker_cmd = "";
		insert_worker_cmd += "insert into pracownicy (id_budynku, id_pojazdu, id_adresu, pracownicyid, id_danych_osobowych, typ_umowy_o_prace, stanowisko) ";
		insert_worker_cmd += "values (" + building_id + ", " + car_id + ", " + adr_id + ", " + worker_id + ", " + data_id + ", '" + typ_umowy + "', 'Pracownik')";
		return insert_worker_cmd;
	}
	private String getSqlSearchCondition() {
		String sql_condition = "";
		String age = EmployessMainTextAge.getText();
		String name = EmployessMainTextName.getText();
		String surname = EmployessMainTextSurname.getText();
		String holiday = EmployessMainTextHolidays.getText();
		String number = EmployessMainTextNumber.getText();
		if(! age.equals(""))
		{
			int months = Integer.parseInt(age) * 12;
			sql_condition += " dane_osobowe.data_urodzenia < add_months(SYSDATE, -" + months+
							 ") and dane_osobowe.data_urodzenia > add_months(SYSDATE, -" + (months+12)+")"; 
		}
		if(! name.equals(""))
		{
			if ( ! sql_condition.equals("")) sql_condition += " and";
			sql_condition += " dane_osobowe.imie = '"+name+"'";
		}
		if(! surname.equals("")) 
		{
			if ( ! sql_condition.equals("")) sql_condition += " and";
			sql_condition += " dane_osobowe.nazwisko = '"+surname+"'";
		}
//			if(! holiday.equals(""))
//			{
//				if ( ! sql_condition.equals("")) sql_condition += " and";
//				sql_condition += " urlop = "+holiday;
//			}
		if(! number.equals(""))
		{
			if ( ! sql_condition.equals("")) sql_condition += " and";
			sql_condition += " dane_osobowe.nr_tel = "+number;
		}
		return sql_condition;
	}

	private void setPersonalDataTextFields(Map<String, Object> output) throws ParseException {
		EmployessPersonalDataTextName.setText(output.get("imie").toString());
		EmployessPersonalDataTextSurname.setText(output.get("nazwisko").toString());
		EmployessPersonalDataTextSecondName.setText(output.get("drugie_imie").toString());
		String data_ur = output.get("data_urodzenia").toString().split(" ")[0];
		EmployessPersonalDataTextDateOfBirth.setText(data_ur);

		String wiek = get_age_from_date(data_ur);
		EmployessPersonalDataTextAge.setText(wiek);
		EmployessPersonalDataTextPhoneNumberOne.setText(output.get("nr_tel").toString());
		EmployessPersonalDataTextPeselNumber.setText(output.get("pesel").toString());
		EmployessPersonalDataTextEvidenceNumber.setText(output.get("nr_dowodu").toString());
		EmployessPersonalDataTextStreet.setText(output.get("ulica").toString());
		EmployessPersonalDataTextLocalNumber.setText(output.get("nr_lokalu").toString());
		EmployessPersonalDataTextPostalCode.setText(output.get("kod_pocztowy").toString());
		EmployessPersonalDataTextCity.setText(output.get("miasto").toString());
		EmployessPersonalDataTextLand.setText(output.get("wojewodztwo").toString());
		EmployessPersonalDataTextCountry.setText(output.get("kraj").toString());
		String umowa = output.get("typ_umowy_o_prace").toString();
		System.out.println(umowa);
		if (umowa.equals("Zlecenie")) EmployessPersonalDataChoiceConctractOfEmployment.select(0);
		else EmployessPersonalDataChoiceConctractOfEmployment.select(1);
		
		
	}
}
