/**
 * Created by v_kal on 08.10.2016.
 */
public class Student extends Entrant {
    private String facultet;

    Student(Student obj){
        super(obj);
    }
    public Student(String name,int age){
        super(name,age);
    }

    public Student(String name,int age, String facultet){
        super(name,age);
        this.facultet=facultet;
    }

    public String getFacultet(){
        return facultet;
    }
    public void setFacultet(String facultet){
        this.facultet=facultet;
    }
}
