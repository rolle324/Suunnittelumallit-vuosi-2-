package proxy;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		ArrayList<ProxyImage> photoGallery = new ArrayList<>();

		Image image1 = new ProxyImage("HiRes_10MB_Photo1");
		Image image2 = new ProxyImage("HiRes_10MB_Photo2");

		// Lisätään valokuvat proxyinä
		photoGallery.add((ProxyImage) image1);
		photoGallery.add((ProxyImage) image2);

		// Tulostetaan valokuva tiedot (kuvia ei ladata)
		for (ProxyImage photos : photoGallery) {
			System.out.println(photos);

		}

		// Lataa jokaisen kuvan ja tuo jokaisen kuvan tiedot esille
		for (int i = 0; i < photoGallery.size(); i++) {
			photoGallery.get(i).displayImage();
			photoGallery.get(i).showData();

		}

	}

}
