/**
 * Created by v_kal on 08.10.2016.
 */
public class Main {
    public static void main(String[] args){
        Entrant e1=new Entrant("Name1",17); e1.setAvrTest(190);
        Entrant e2=new Entrant("Name2",18); e2.setAvrTest(170);
        Entrant e3=new Entrant("Name3",16); e3.setAvrTest(150);
        Entrant[] e=new Entrant[3];
        e[0]=e1; e[1]=e2; e[2]=e3;

        University u=new University(e);
        u.setEntrant(e1,0);
        u.setEntrant(e2,1);
        u.setEntrant(e3,2);

        u.PrintList();
    }
}
