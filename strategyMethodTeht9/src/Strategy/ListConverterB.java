package Strategy;

import java.util.List;

public class ListConverterB implements ListConverter {
String[] carsTable = new String[10];
String string = "";
 	@Override
	public String listToString(List<String> list) {
		
		for(int i = 0; i < list.size(); i++) {
			carsTable[i] = list.get(i);
			if (i % 2 == 0 && i !=0) {
			string += " /n "+carsTable[i]+" ";	
			}
			else {
				string += carsTable[i]+" ";	
			}
		}
		return string;
	}



}
