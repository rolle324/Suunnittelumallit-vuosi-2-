package Strategy;

import java.util.List;

public class ListConverterC implements ListConverter {

	String string = "";
 	@Override
	public String listToString(List<String> list) {
		
		for(int i = 0; i < list.size(); i++) {
			
			if (i % 3 == 0 && i !=0) {
			string += " /n "+list.get(i)+" ";	
			}
			else {
				string += list.get(i)+" ";	
			}
		}
		return string;
	}

}
