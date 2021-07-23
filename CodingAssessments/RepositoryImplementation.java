package com.practice.exception;
class InvalidCodeException extends Exception
{
	InvalidCodeException(String message)
	{
		super(message);
	}
}
class Repository{
	static String getCountryName(String countryCode) throws InvalidCodeException {
//70 to 99  -India
//908 = US

//011      -Dial somewhere outside of USA 

// No country with given code found
		int number=Integer.parseInt(countryCode);
		String country="";
		if(number>=70 && number<=99)
		{
			country="India";
		}
		else if(number==908)
		{
			country="US";
		}
		else if(countryCode.equals("011"))
		{
			throw new InvalidCodeException("Dial somewhere outside of USA");
		}
		else
		{
			throw new InvalidCodeException("No country with given code found");
		}
		return country;
 }
	
}
public class RepositoryImplementation {

	public static void main(String[] args) throws InvalidCodeException {
		// TODO Auto-generated method stub
		Repository r=new Repository();
		System.out.println(r.getCountryName("011"));
	}

}
