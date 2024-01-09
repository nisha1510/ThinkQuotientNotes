package assignmentConstructor;
//11). Create Academy class with appropriate attributes (instance variable) and create getter & setter 
public class Q11Academy {
	
	private String memberName;
	private long mobNo;
	
	public Q11Academy() {
		
	}

	public Q11Academy(String memberName, long mobNo) {
		super();
		this.memberName = memberName;
		this.mobNo = mobNo;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	
	public String toString() {
		return "Q11Academy [memberName=" + memberName + ", mobNo=" + mobNo + "]";
	}

	public static void main(String[] args) {
		Q11Academy a1 = new Q11Academy();
		a1.setMemberName("Nisha");
		a1.setMobNo(2345667);
		System.out.println(a1);
	}
}
