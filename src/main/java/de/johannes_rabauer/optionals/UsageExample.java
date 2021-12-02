package de.johannes_rabauer.optionals;

import java.util.Optional;

public class UsageExample 
{
	public void main()
	{
		Integer input = getPossibleEmptyInput().orElse(0);
	}
	
    public Optional<Integer> getPossibleEmptyInput()
    {
    	return Optional.ofNullable(someInput());
    }

	private Integer someInput()
	{
		if(Math.random()<0.5)
			return null;
		return 1;
	}
}
