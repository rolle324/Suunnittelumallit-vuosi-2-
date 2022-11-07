package Builder;

import java.util.ArrayList;

public class HesekerrosBuilder implements IHamburgerBuilder {

	ArrayList<Object> hamburger = new ArrayList<Object>();
	private Hesekerroshamppari kerroshamppari;
	@Override
	public void createNewHamburgerProduct() {
		kerroshamppari = new Hesekerroshamppari();
		
	}

	@Override
	public void buildBuns() {
		kerroshamppari.setBuns(new Buns("Kaura"));
		
	}

	@Override
	public void buildContents() {
		kerroshamppari.setContent(new Content("Nauta 100g","Jäävuorisalaatti","kurkkumajoneesi kastike"));
		
	}

	@Override
	public Object getHamburger() {
		
		hamburger.add(kerroshamppari.getBuns());
		hamburger.add(kerroshamppari.getContent());
		return hamburger;
		
	}

	
}
