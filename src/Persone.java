/**
 * Created by v_kal on 08.10.2016.
 */
public abstract class Persone {
    protected String name;
    protected int age;

    Persone(Persone obj){
        name=obj.name;
        age=obj.age;
    }

    public Persone(String name, int age){
        this.name=name;
        this.age=age;
    }
    public abstract String getName();
    public abstract int getAge();
}
