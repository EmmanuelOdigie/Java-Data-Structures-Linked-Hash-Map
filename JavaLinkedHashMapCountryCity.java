package JavaLinkedHashMap; //project made in eclipse
import java.util.LinkedHashMap; // imported the linkedHashMap

public class JavaLinkedHashMapCountryCity {// created public class 'JavaLinkedHashMapCountryCity'

	public static void main(String[] args) {// reads,run & executes code
		
	// created an object of the imported LinkedHashMap class called 'listOfCountriesCities'
	// the imported class takes two String values - set up as LinkedHashMap<String,String>
	// LinkedHHashMap is based on insertion, it goes by the way of your order set in the code
		LinkedHashMap<String,String> listOfCountriesCities = new LinkedHashMap<String,String>();
		
	// object calls onto the'.put' function to put the information into the object
		listOfCountriesCities.put("Ireland", "Dublin");
		listOfCountriesCities.put("Italy", "Milan");
		listOfCountriesCities.put("Spain", "Madrid");
		listOfCountriesCities.put("Isle of Man", "Douglas");
		listOfCountriesCities.put("Ireland", "Dublin"); // duplicate won't be added on
		listOfCountriesCities.put("France", "Paris");
		listOfCountriesCities.put("Netherlands", "Amsterdam");
	
	// Display Text
		System.out.println("List of countries and cities using TreeMap organisation based on insertion:");
		
	// for loop made, with String CountryCity variable created, that takes in values from
	// the object after it as called onto the 'keySet()' function
	// the 'keySet()' function puts values into keys, the countries are the first key, cities are 
	// the second.
	//it display the value by getting information by 'countryCity' and the cities will show
	// by object calling onto the '.get(countryCity)' to display the cities
		for(String countryCity : listOfCountriesCities.keySet()) {
			System.out.println("Country: " + countryCity + " " + " " + "City: " + listOfCountriesCities.get(countryCity));
			
		}

	}

}

// Result:
//List of countries and cities using TreeMap organisation based on insertion:
//Country: Ireland  City: Dublin
//Country: Italy  City: Milan
//Country: Spain  City: Madrid
//Country: Isle of Man  City: Douglas
//Country: France  City: Paris
//Country: Netherlands  City: Amsterdam
