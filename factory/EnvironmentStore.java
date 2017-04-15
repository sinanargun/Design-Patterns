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
public class EnvironmentStore
{

    public Environment up(String type)
    {
	Environment env = SimpleEnvironmentFactory.createEnvironment(type);

	System.out.println("\n***********************************************");
	System.out.println(env.getName() + " environment is preparing.....");
	System.out.println("Its IP is '" + env.getIp() + "'");
	System.out.println("Its password is '" + env.getPassword() + "' in order to connect via SSH.");
	System.out.println("***********************************************");

	return env;
    }

}
