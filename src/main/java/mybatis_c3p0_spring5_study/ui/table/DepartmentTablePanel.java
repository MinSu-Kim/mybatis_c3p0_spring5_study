package mybatis_c3p0_spring5_study.ui.table;

import javax.inject.Inject;
import javax.swing.SwingConstants;

import mybatis_c3p0_spring5_study.dto.Department;
import mybatis_c3p0_spring5_study.service.DepartmentService;

@SuppressWarnings("serial")
public class DepartmentTablePanel extends AbstractTablePanel<Department> {

	@Inject
	private DepartmentService departmentService;
	
	public void init() {
		setItems(departmentService.listAll());
		loadData();
	} 

	public DepartmentTablePanel() {
		super("부서");
	}

	@Override
	protected void setAlignWith() {
		tableCellAlignment(SwingConstants.CENTER, 0, 1, 2);
        tableSetWidth(100, 200, 100);            		
	}

	@Override
	public void setColumnNames() {
		colNames = new String[] { "부서 코드", "부서 명", "위치"};     		
	}

	@Override
	protected Object[] toArray(Department item) {
		return new Object[] {item.getDeptNo(), item.getDeptName(), item.getFloor()};
	}

	@Override
	public Department getItem() throws Exception {
		int row = getSelectedRowIndex();
		return new Department((int)table.getValueAt(row, 0));
	}

	@Override
	public void updateRow(Department item) {
		departmentService.modifiy(item);
		super.updateRow(item);
	}

	@Override
	public void addRow(Department item) {
		departmentService.register(item);
		super.addRow(item);
	}

	@Override
	public void removeRow() throws Exception {
		departmentService.remove(getItem());
		super.removeRow();
	}

	
}
