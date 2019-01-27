package mybatis_c3p0_spring5_study.ui.menu;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import mybatis_c3p0_spring5_study.ui.button.ContentActionListener;

public class UpdateMenuItemActionListener<T> extends ContentActionListener<T> {

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			T item = tablePanel.getItem();
			JOptionPane.showMessageDialog(null, item);
			contentPanel.setObject(item);
		} catch (Exception e1) {
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, e1.getMessage());
		}
	}

}
