package mybatis_c3p0_spring5_study.ui.content;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public abstract class AbstractMainPanel<T> extends JPanel {	
	public abstract void clearObject();

	public abstract T getObject() throws Exception;

	public abstract String nextNo();

	public abstract void setSelectedTitle();

	public abstract void setObject(T item);
	
}
