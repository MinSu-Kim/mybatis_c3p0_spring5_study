package mybatis_c3p0_spring5_study.ui.button;

import java.awt.event.ActionListener;

import mybatis_c3p0_spring5_study.ui.content.AbstractMainPanel;
import mybatis_c3p0_spring5_study.ui.table.AbstractTablePanel;

public abstract class ContentActionListener<T> implements ActionListener {
	protected AbstractMainPanel<T> contentPanel;
	protected AbstractTablePanel<T> tablePanel;
	
	public void setContentPanel(AbstractMainPanel<T> contentPanel) {
		this.contentPanel = contentPanel;
	}

	public void setTablePanel(AbstractTablePanel<T> tablePanel) {
		this.tablePanel = tablePanel;
	}

}
