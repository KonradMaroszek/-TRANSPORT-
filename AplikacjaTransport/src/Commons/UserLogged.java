package Commons;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UserLogged {
	public enum UserType {ADMIN,FORWARDER,EMPLOYEE};
	
	static private boolean isUserLogged;
	static private UserType userType;
	static private JButton loggedButton;
	static private JPasswordField passField;
	
	public static JPasswordField getPassField() {
		return passField;
	}
	public static void setPassField(JPasswordField passField) {
		UserLogged.passField = passField;
	}
	static private JTextField  loginField;
	public static JLabel getLoginText() {
		return loginText;
	}
	public static void setLoginText(JLabel loginText) {
		UserLogged.loginText = loginText;
	}
	public static JLabel getPassText() {
		return passText;
	}
	public static void setPassText(JLabel passText) {
		UserLogged.passText = passText;
	}
	public static JLabel getInfoText() {
		return infoText;
	}
	public static void setInfoText(JLabel infoText) {
		UserLogged.infoText = infoText;
	}
	public static JLabel getInfo2Text() {
		return info2Text;
	}
	public static void setInfo2Text(JLabel info2Text) {
		UserLogged.info2Text = info2Text;
	}
	static private JLabel loginText;
	static private JLabel passText;
	static private JLabel infoText;
	static private JLabel info2Text;
	
	public static boolean isUserLogged() {
		return isUserLogged;
	}
	public static void setUserLogged(boolean isUserLogged) {
		UserLogged.isUserLogged = isUserLogged;
	}
	public static UserType getUserType() {
		return userType;
	}
	public static void setUserType(UserType userType) {
		UserLogged.userType = userType;
	}
	public static JButton getLoggedButton() {
		return loggedButton;
	}
	public static void setLoggedButton(JButton loggedButton) {
		UserLogged.loggedButton = loggedButton;
	}
	public static JTextField getLoginField() {
		return loginField;
	}
	public static void setLoginField(JTextField loginField) {
		UserLogged.loginField = loginField;
	}
	
	public static void Show()
	{
		info2Text.setVisible(true);
		infoText.setVisible(true);
		passText.setVisible(true);
		loginText.setVisible(true);
		passField.setVisible(true);
		loginField.setVisible(true);
	}
	
	public static void Hide()
	{
		info2Text.setVisible(false);
		infoText.setVisible(false);
		passText.setVisible(false);
		loginText.setVisible(false);
		passField.setVisible(false);
		loginField.setVisible(false);
	}
}
