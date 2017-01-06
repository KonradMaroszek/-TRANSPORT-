package Commons;

public class UserLogged {
	public enum UserType {ADMIN,FORWARDER,EMPLOYEE};
	
	static private boolean isUserLogged;
	static private UserType userType;
	
	
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
	
}
