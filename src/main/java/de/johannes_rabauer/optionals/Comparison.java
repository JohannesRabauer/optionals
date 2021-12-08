package de.johannes_rabauer.optionals;

import java.util.Optional;

public class Comparison 
{
	public static void main()
	{
		Integer           someInput = generateSomeInput();
		//It is unclear if someInput is null or a Integer.
		
		Optional<Integer> otherInput = generateOtherInput();
		//It is unclear if otherInput is empty or not, 
		//BUT this is clearly visible for the developer.
	}

	private static Integer generateSomeInput()
	{
		if(Math.random()<0.5)
			return null;
		return 1;
	}
	
	private static Optional<Integer> generateOtherInput()
	{
		if(Math.random()<0.5)
			return Optional.empty();
		return Optional.of(1);
	}
}
