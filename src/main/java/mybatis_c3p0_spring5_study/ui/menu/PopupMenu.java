package mybatis_c3p0_spring5_study.ui.menu;

import java.util.List;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

@SuppressWarnings("serial")
public class PopupMenu extends JPopupMenu {
	
	public void setMenu(List<JMenuItem> items) {
		for(JMenuItem item : items) {
			add(item);
		}
	}
	
}
