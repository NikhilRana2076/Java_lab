package basicopp.classobject;

public class dog extends animal{
    
    public dog(int legs, String name){
        super(legs, name);
    }

    public void eating(){
        System.out.println(super.name+ " is eating dog food");
    }

    public void eating(String dogfood)
    {
        System.out.println(super.name + " is eating " + dogfood);
    }
}
