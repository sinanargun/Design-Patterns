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
public class Reference
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

	EnvironmentStore env = new EnvironmentStore();
	env.up("production");
	env.up("test");
	env.up("development");

    }

}
