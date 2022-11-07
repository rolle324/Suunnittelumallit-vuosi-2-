package Builder;

public class Cook {
	private IHamburgerBuilder hamburgerbuilder;

	public void setHamburgerBuilder(IHamburgerBuilder hb) {
		hamburgerbuilder = hb;
	}
	
	public void constructHamburger() {
		hamburgerbuilder.createNewHamburgerProduct();
		hamburgerbuilder.buildBuns();
		hamburgerbuilder.buildContents();
	}
}
