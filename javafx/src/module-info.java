module javafx {
	// �� ������Ʈ������ ����� �ܺ� ���̺귯�� ���� 
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	// �� ��Ű�������� ����� �ܺ� ���̺귯�� ���� 
	opens application to javafx.controls , javafx.graphics, javafx.fxml;
	opens Member to javafx.controls , javafx.graphics , javafx.fxml;
}
