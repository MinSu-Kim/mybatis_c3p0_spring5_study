package mybatis_c3p0_spring5_study;

import java.sql.SQLException;

import javax.inject.Inject;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mybatis_c3p0_spring5_study.dto.Department;
import mybatis_c3p0_spring5_study.service.DepartmentService;
import mybatis_c3p0_spring5_study.ui.table.AbstractTablePanel;
import mybatis_c3p0_spring5_study.ui.table.DepartmentTablePanel;

@SuppressWarnings("serial")
public class ErpMain extends JFrame {

	private JPanel contentPane;
	
	@Inject
	private DepartmentService departmentService;
	
	public void initComponent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		setContentPane(contentPane);
		
		//빈등록 https://www.ibm.com/developerworks/java/tutorials/j-springswing/j-springswing.html 참조
        AbstractTablePanel<Department> departmentTable = new DepartmentTablePanel();
        try {
			departmentTable.setItems(departmentService.listAll());
		} catch (SQLException e) {
			e.printStackTrace();
		}
        departmentTable.loadData();
        contentPane.add(departmentTable);
        
        setVisible(true);
	}


}
