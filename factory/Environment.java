package reference;

/**
 *
 * @author sinan
 */
public abstract class Environment
{

    private String name;
    private String ip;
    private String password;

    public Environment(String name, String ip, String password)
    {
	this.name = name;
	this.ip = ip;
	this.password = password;
    }

    public String getName()
    {
	return this.name;
    }

    public String getIp()
    {
	return this.ip;
    }

    public String getPassword()
    {
	return this.password;
    }
}
