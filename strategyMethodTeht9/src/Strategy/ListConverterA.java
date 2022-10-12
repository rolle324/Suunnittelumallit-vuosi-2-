package Strategy;

import java.util.Iterator;
import java.util.List;

public class ListConverterA implements ListConverter {
String string = "";
	@Override
	public String listToString(List<String> list) {
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
		 string += it.next() + " /n ";
		}
		return string;
	}


}
