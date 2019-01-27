package mybatis_c3p0_spring5_study.ui.content;

import java.awt.GridLayout;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import mybatis_c3p0_spring5_study.dto.Department;
import mybatis_c3p0_spring5_study.dto.Employee;
import mybatis_c3p0_spring5_study.service.EmployeeService;

@SuppressWarnings("serial")
public class EmployeePanel extends JPanel implements AbstractMainPanel<Employee>{

	private JTextField tfNo;
	private JTextField tfName;
	private JComboBox<String> cmbTitle;
	private JTextField tfSalary;
	private JTextField tfManager;
	private JComboBox<Department> cmbDept;
	
	@Inject
	private EmployeeService empService;
	
	public EmployeePanel() {
		initComponents();
	}
	
	public void initComponents() {
		setBorder(new EmptyBorder(10, 10, 10, 10));
		setLayout(new GridLayout(0, 2, 10, 0));
		
		JLabel lblNo = new JLabel("사원번호");
		add(lblNo);
		lblNo.setHorizontalAlignment(SwingConstants.RIGHT);

		tfNo = new JTextField();
		add(tfNo);
		tfNo.setColumns(10);
		tfNo.setText(nextNo());
		tfNo.setEditable(false);
		
		JLabel lblName = new JLabel("사원명");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblName);
		
		tfName = new JTextField();
		tfName.setColumns(10);
		add(tfName);
		
		JLabel lblTitle = new JLabel("직책");
		lblTitle.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblTitle);
		
		cmbTitle = new JComboBox<>();
		add(cmbTitle);
		
		JLabel lblSalary = new JLabel("급여");
		lblSalary.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblSalary);
		
		tfSalary = new JTextField();
		tfSalary.setColumns(10);
		add(tfSalary);
		
		JLabel lblManager = new JLabel("직속상사");
		lblManager.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblManager);
		
		tfManager = new JTextField();
		tfManager.setColumns(10);
		add(tfManager);
		
		JLabel lblDept = new JLabel("부서");
		lblDept.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblDept);
		
		cmbDept = new JComboBox<>();
		add(cmbDept);
	}
	
	public void loadComb() {
		List<Department> list = empService.listAll();
		for(Department dept : list) {
			cmbDept.addItem(dept);
		}
		List<String> titleLists = Arrays.asList("사장","부장","과장", "대리", "사원");
		for (String title:titleLists) {
			cmbTitle.addItem(title);
		}
	}

	@Override
	public void clearObject() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getObject() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String nextNo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSelectedTitle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setObject(Employee item) {
		// TODO Auto-generated method stub
		
	}

}
