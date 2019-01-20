package mybatis_c3p0_spring5_study.ui.button;

import java.awt.event.ActionListener;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class ActionListenerButton extends JButton {
	private ActionListener actionListener;
	 
    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }
 
    public void init() {
        this.addActionListener(actionListener);
    }
}
