package Builder;

public class Mckerroshamppari {

	private String buns = "";
	private String content = "";
	
	
	public void setBuns(String buns) {
		this.buns = buns;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	@Override
	public String toString() {
		return buns+" "+content;
		
	}
	
	
	
}
