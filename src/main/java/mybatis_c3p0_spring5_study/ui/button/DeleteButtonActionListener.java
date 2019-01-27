package mybatis_c3p0_spring5_study.ui.button;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

public class DeleteButtonActionListener<T> extends ContentActionListener<T> {

	@Override
	public void actionPerformed(ActionEvent e) {
        try {
			tablePanel.removeRow();
		} catch (Exception e1) {
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, e1.getMessage());
		}
	}

}
