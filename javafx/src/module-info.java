module javafx {
	// 현 프로젝트내에서 사용할 외부 라이브러리 선언 
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.sql;
	
	// 현 패키지내에서 사용할 외부 라이브러리 연결 
	opens application to javafx.controls , javafx.graphics, javafx.fxml;
	opens Member to javafx.controls , javafx.graphics , javafx.fxml , java.sql;

}
