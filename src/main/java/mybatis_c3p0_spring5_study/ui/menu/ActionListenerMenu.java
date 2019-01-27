package mybatis_c3p0_spring5_study.ui.menu;

import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class ActionListenerMenu extends JMenuItem {
	private ActionListener actionListener;
	 
    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }
 
    public void init() {
        this.addActionListener(actionListener);
    }
}
