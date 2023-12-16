package basicopp.classobject;

public class animal {

    int legs;
    String name;

    public animal(int legs, String name)
    {
        this.legs=legs;
        this.name=name;
    }

    public void eating(){
        System.out.println(name + " the Animal is eating");
    }
}
