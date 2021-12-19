package sii.maroc;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Resources {
	
	Dictionary listOfResources = new Hashtable();
	
	public Dictionary and(String dish) {
		// TODO Auto-generated method stub
		String numberOfDish = getContintyOfElement(dish);
		String nameOfDish = getNameOfElement(dish);
		listOfResources.put(numberOfDish, nameOfDish);
		return null;
	}
	public static String getContintyOfElement(String element) {
		String quantity = (isStringANumber(element))?"unlimited":element.split(" ")[0];
		return quantity;
	}
	
	public static boolean isStringANumber(String str) {
        String regularExpression = "[-+]?[0-9]*\\.?[0-9]+$";
        Pattern pattern = Pattern.compile(regularExpression);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
                
    }
	
	public static String getNameOfElement(String element) {
		return element.split(" ")[1];
		
	}
	
}
