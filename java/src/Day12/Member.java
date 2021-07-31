package Day12;

public class Member<T> {
	
	private String membername;
	private T[] memberlist;
	
	public Member( String membername) {
		this.membername = membername;
		memberlist = (T[])new Object[10];
	}
	public void add( T t ) {
		for( int i = 0 ; i<memberlist.length ;i++) {
			if( memberlist[i] == null ) {
				memberlist[i] = t;
				break;
			}
		}
	}
	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public T[] getMemberlist() {
		return memberlist;
	}

	public void setMemberlist(T[] memberlist) {
		this.memberlist = memberlist;
	}

}
