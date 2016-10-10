/**
 * Created by v_kal on 08.10.2016.
 */
public class Entrant extends Persone {
    private double avrTests;

    Entrant(Entrant obj){
      super(obj);
   }
    public Entrant(String name, int age){
        super(name,age);
    }

    public String getName(){return name;}
    public int getAge(){return age;}

    public double getAvrTest(){
        return avrTests;
    }
    public  void setAvrTest(double avrTest){
        this.avrTests=avrTest;
    }
}
