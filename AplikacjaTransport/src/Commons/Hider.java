package Commons;

import java.util.HashMap;

import javax.swing.JComponent;

public class Hider {

	static HashMap<String,JComponent> hiders = new HashMap<String,JComponent>();
	static HashMap<String,JComponent> restrict = new HashMap<String,JComponent>();
	
	static public void addComponentToHider (String name, JComponent panel){
		hiders.put(name, panel);
	}
	
	static public void addComponentToHiderRestrict (String name, JComponent panel){
		restrict.put(name, panel);
	}
	
	static public void hide(){
		for (JComponent komponent : hiders.values()){
			komponent.setVisible(false);
		}
	}
	
	static public void hideRestrict(){
		for (JComponent komponent : restrict.values()){
			komponent.setVisible(false);
		}
	}
}
