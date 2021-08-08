package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Javafx_1 extends Application {
	// 1. Javafx 클래스로 부터 상속받기 
		// javafx 구조 
			// 1. Stage : 윈도우 창 [ 여러개의 Scene 포함 ]
			// 2. Scene : 화면 단위 [ 여러개의 레이아웃 포함 ] 
			// 3. Graph : 레이아웃 , 컨트롤
	// 2. javafx 시작 
			// 1. main 스레드에서 launch(args); 호출 
			// 2. start 메소드 오버라이딩[재정의]
	// 3. start 메소드 내에서 구성 
	
	@Override
	public void start(Stage 스테이지) throws Exception {
						// 1. stage 이름 정하기 
		//2. 레이아웃 구성 
		VBox 레이아웃 = new VBox();
		
			// 2-0 레이아웃 설정 
			레이아웃.setAlignment(Pos.CENTER);
		
			// 2-1. 컨트롤 구성 
			Button 버튼 = new Button();
			버튼.setText("종료");
			버튼.setOnAction( a -> Platform.exit() );
							// 람다식[ 익명메소드( 메소드명이 없는 메소드(인수와반환) ]
							// 인수 -> 실행코드
			// 2-1 . 컨트롤 구성 
			Label 레이블 = new Label();
			레이블.setText("안녕하세요 fx 입니다");
			레이블.setFont( new Font(20) );
			
			// 2-2 레이아웃에 컨트롤 넣기 
			레이아웃.getChildren().add(버튼);
			레이아웃.getChildren().add(레이블);
			
		//3. 씬 만들기 => 레이아웃 넣기 
		Scene 씬 = new Scene(레이아웃 , 500 , 500 );
		//4. 스테이지 => 씬 넣기 
		스테이지.setScene(씬);
		//5. 스테이지 열기 
		스테이지.show();
	}
	public static void main(String[] args) {	
		launch(args);
	}
}










