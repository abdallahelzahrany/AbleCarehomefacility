package sample.model;

public class Person {

    // prop
    private String name;
    private  int id;

    // Constructor
    public Person(String name)
    {
        this.name=name;
    }

    // Getter
    public String getName()
    {
        return name;
    }
    public int getID()
    {
        return id;
    }

    // Setter
    public void setName(String name)
    {
        this.name = name;
    }
    public void setID(int id)
    {
        this.id=id;
    }

}