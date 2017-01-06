package Commons;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JPanel;

public class TabGuardian {	
	
	HashMap<String,JPanel> tabPanels;
	
	public TabGuardian(){
		tabPanels = new HashMap<String,JPanel>();
	}
	
	public void addPanelToMap (String name, JPanel panel){
		tabPanels.put(name, panel);
	}
	
	public HashMap<String,JPanel> getPanelMap(){
		return tabPanels;
	}
	
	public HashMap<String,JPanel> getPanelsByNames (ArrayList<String> panelsNames){
		
		HashMap<String,JPanel> tabPanelsMap  = new HashMap<String,JPanel>();
		
		for (String panelName : panelsNames){
			tabPanelsMap.put(panelName, tabPanels.get(panelName));
		}
		
		return tabPanelsMap;
	}
}
