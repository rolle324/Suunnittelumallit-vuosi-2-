package Builder;

public class McKerrosBuilder implements IHamburgerBuilder {

	private Mckerroshamppari kerroshamppari;
	
	@Override
	public void createNewHamburgerProduct() {
		kerroshamppari = new Mckerroshamppari();	
	}

	@Override
	public void buildBuns() {
		kerroshamppari.setBuns("perunasämpylä");
		
	}

	@Override
	public void buildContents() {
		kerroshamppari.setContent("2 kpl Nauta 50g pihvit, Jäävuorisalaatti, kurkkumajoneesi kastike");
		
	}

	@Override
	public Object getHamburger() {
		return kerroshamppari;
	}

}
