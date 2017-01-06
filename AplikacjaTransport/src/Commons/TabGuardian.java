package Commons;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class TabGuardian {	
	
	HashMap<String,JPanel> tabPanels;
	HashMap<String,ImageIcon> icons;

	public TabGuardian(){
		tabPanels = new HashMap<String,JPanel>();
		icons = new HashMap<String,ImageIcon>();
	}
	
	public void addPanelToMap (String name, JPanel panel){
		tabPanels.put(name, panel);
	}
	
	public void addIconToMap (String name, ImageIcon panel){
		icons.put(name, panel);
	}
	
	public HashMap<String,JPanel> getPanelMap(){
		return tabPanels;
	}
	
	public HashMap<String, ImageIcon> getIconsMap() {
		return icons;
	}
	
	public HashMap<String,JPanel> getPanelsByNames (ArrayList<String> panelsNames){
		
		HashMap<String,JPanel> tabPanelsMap  = new HashMap<String,JPanel>();
		
		for (String panelName : panelsNames){
			tabPanelsMap.put(panelName, tabPanels.get(panelName));
		}
		
		return tabPanelsMap;
	}
	
	public HashMap<String,ImageIcon> getIconsByNames (ArrayList<String> iconsNames){
		
		HashMap<String,ImageIcon> tabIconsMap  = new HashMap<String,ImageIcon>();
		
		for (String iconName : iconsNames){
			tabIconsMap.put(iconName, icons.get(iconName));
		}
		
		return tabIconsMap;
	}
}
