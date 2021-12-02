package de.johannes_rabauer.optionals;

import java.util.Optional;

public class Burger {
	private final String bunBottom;
	private final String meat     ;
	private       String cheese   ;
	private final String bunTop   ;

	public Burger(
		String bunBottom,
		String meat     ,
		String cheese   ,
		String bunTop   
	)
	{
		this.bunBottom = bunBottom;
		this.meat      = meat     ;
		this.cheese    = cheese   ;
		this.bunTop    = bunTop   ;
	}
	
	public Burger(
		String bunBottom,
		String meat     ,
		String bunTop   
	)
	{
		this.bunBottom = bunBottom;
		this.meat      = meat     ;
		this.bunTop    = bunTop   ;
	}

	public String getBunBottom() {
		return bunBottom;
	}

	public String getMeat() {
		return meat;
	}

	public Optional<String> getCheese() {
		return Optional.ofNullable(cheese);
	}

	public String getBunTop() {
		return bunTop;
	}
}
