package sii.maroc;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Restaurant {
	

	static Dictionary stock = new Hashtable();
	public static Dictionary stockStatus = stock;
	Dictionary orders = new Hashtable();

	public Restaurant(String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub

		setStock(string);
		setStock(string2);
		setStock(string3);
		setStock(string4);
	}
	
	public void  setStock(String string) {
		stock.put(getContintyOfElement(string),getNameOfElement(string));
	}

	public Restaurant(String string, String string2, String string3, String string4, String string5, String string6) {
		// TODO Auto-generated constructor stub
		setStock(string);
		setStock(string2);
		setStock(string3);
		setStock(string4);
		setStock(string5);
		setStock(string6);
	}

	public Ticket order(String string) {
		// TODO Auto-generated method stub
		return new Ticket().and(string);
	}
	
	
	
	public Meal retrieve(Ticket ticket) {
		// TODO Auto-generated method stub
		return null;
	}

	public static String getContintyOfElement(String element) {
		String quantityString = element.split(" ")[0];
		String quantity = (isStringANumber(quantityString))?quantityString:"unlimited";
		return quantity;
	}
	
	public static boolean isStringANumber(String str) {
        String regularExpression = "[-+]?[0-9]*\\.?[0-9]+$";
        Pattern pattern = Pattern.compile(regularExpression);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
                
    }
	
	public static String getNameOfElement(String element) {
		String expectedQuantity = element.split(" ",2)[0];
		String name = element.split(" ",2)[0];
		if(isStringANumber(expectedQuantity)) {
			name = element.split(" ",2)[1];
		}else {
			name = element;
		}
		return name;
		
	}
	
	
	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant("6 balls Mozzarella", "20 tomatoes", "olive oil", "pepper");
		
			System.out.println(getContintyOfElement("olive oil"));
			System.out.println(restaurant.stock);
		
	}
}
