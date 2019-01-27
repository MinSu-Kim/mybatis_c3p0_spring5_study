package mybatis_c3p0_spring5_study.ui.content;

public interface AbstractMainPanel<T> {	
	void clearObject();

	T getObject() throws Exception;

	String nextNo();

	void setSelectedTitle();

	void setObject(T item);
	
}
