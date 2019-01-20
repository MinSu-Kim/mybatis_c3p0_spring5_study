package mybatis_c3p0_spring5_study.ui;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ErpMain extends JFrame {
	public ErpMain() {
		System.out.println("ErpMain-construct()");
	}

	public void initComponent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
        setVisible(true);
	}

}
