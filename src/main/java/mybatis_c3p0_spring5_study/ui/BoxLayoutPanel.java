package mybatis_c3p0_spring5_study.ui;

import java.util.Iterator;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BoxLayoutPanel extends JPanel {
	private List<JComponent> panelComponents;
	private int axis;

	public void setAxis(int axis) {
		this.axis = axis;
	}

	public void setPanelComponents(List<JComponent> panelComponents) {
		this.panelComponents = panelComponents;
	}

	public void initComponent() {
		setLayout(new BoxLayout(this, axis));

		for (Iterator<JComponent> iter = panelComponents.iterator(); iter.hasNext();) {
			JComponent component = (JComponent) iter.next();
			add(component);
		}
	}
}
