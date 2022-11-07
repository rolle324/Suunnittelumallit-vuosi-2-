package Builder;

public interface IHamburgerBuilder {

	public abstract void createNewHamburgerProduct();
	public abstract void buildBuns();
	public abstract void buildContents();
	
	public abstract Object getHamburger();
	
}
