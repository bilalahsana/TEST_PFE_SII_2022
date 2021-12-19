package sii.maroc;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ticket {
	List<IOrder> orders = new ArrayList();
	
	public Ticket and(String dish) {
		// TODO Auto-generated method stub
		
		String numberOfDish = getContintyOfElement(dish);
		String nameOfDish = getNameOfElement(dish);
		boolean isValidatedDish =true;
		if(nameOfDish == "Tomato Mozzarella Salad") {
			//orders.add( );
		}
		
		return this;
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
