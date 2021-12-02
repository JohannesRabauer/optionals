package de.johannes_rabauer.optionals;

import java.util.Optional;

public class OverloadExample 
{
    
    public static void doSomething(Optional<Boolean> myBool)
    {
    	System.out.println("Do something boolean");
    }
    
    public static void doSomething(Optional<Integer> myInt)
    {
    	System.out.println("Do something integer");
    }
}
