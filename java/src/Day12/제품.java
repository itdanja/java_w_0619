package Day12;

public class 제품<매개클래스1 , 매개클래스2> {
			// 두개이상의 제네릭 받을수 있다 
	
	private 매개클래스1 kind;
	private 매개클래스2 model;
	
	
	public 매개클래스1 getKind() {
		return kind;
	}
	public void setKind(매개클래스1 kind) {
		this.kind = kind;
	}
	public 매개클래스2 getModel() {
		return model;
	}
	public void setModel(매개클래스2 model) {
		this.model = model;
	}
	
}
