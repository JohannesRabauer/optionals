package de.johannes_rabauer.optionals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BurgerExample 
{
	public static void main()
	{
        Burger cheeseBurger = new Burger("White bread", "Beef"  , "Soft cheese"  ,"White bread");
        Burger hamburger    = new Burger("White bread", "Beef"  ,                 "White bread");
        Burger veggieBurger = new Burger("Wholegrain" , "Veggie", "Swiss cheese" ,"Wholegrain" );
        
        //Create menu of burgers
        List<Burger> burgers = Arrays.asList(cheeseBurger, hamburger, veggieBurger);
        
        //Get all the cheeses used in the burgers
        List<Optional<String>> cheeses = 
        		burgers
	        		.stream()
	        		.map(burger -> burger.getCheese())
	        		.collect(Collectors.toList());
        
        //Get all cheeses without the optionals
        List<String> availableCheeses = 
        		cheeses
        			.stream()
        			.flatMap(Optional::stream)
        			.collect(Collectors.toList());
	}
}
