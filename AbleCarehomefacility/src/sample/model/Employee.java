package sample.model;

public class Employee extends Person {

    // prop
    private String userName;
    private String password;

    // Constructor
    public Employee(String name, String userName, String password)
    {
        super(name);
        this.userName=userName;
        this.password=password;

    }

    // Getter
    public String getUserName()
    {
        return userName;
    }
    public String getPassword()
    {
        return password;
    }

    // Setter
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }


}
