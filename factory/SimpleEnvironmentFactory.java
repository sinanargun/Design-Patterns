/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

/**
 *
 * @author sinan
 */
public class SimpleEnvironmentFactory
{

    public static Environment createEnvironment(String type)
    {
	Environment env = null;

	switch (type)
	{
	    case "production":
		env = new Production();
		break;
	    case "test":
		env = new Test();
		break;
	    case "development":
		env = new Development();
		break;
	    default:
		env = new Development();
		break;
	}

	return env;
    }
}
