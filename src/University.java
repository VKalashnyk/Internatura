import java.io.IOException;

/**
 * Created by v_kal on 08.10.2016.
 */
import java.io.*;
import java.util.Scanner;

public class University {
     Entrant[] entrants;
     Student[] students;

    public University(Entrant[] e){
        entrants=e;
        students=new Student[Amount()];
        TakeIn();
    }
    public void setEntrant(Entrant entrant,int i){
        entrants[i]=entrant;
    }
    private int Amount(){
        int counter=0;
        for(int i=0; i<entrants.length; i++)
            if(entrants[i].getAvrTest()>=160)
                counter++;
        return counter;
    }

    private void TakeIn() {
        String facultet;
        Scanner sc = new Scanner(System.in);
        int j=0;

        for(int i=0; i<entrants.length; i++)
            if(entrants[i].getAvrTest()>160)
            {
                students[j]=new Student(entrants[i].getName(),entrants[i].getAge());
                System.out.print("Введите факультет\t");
                facultet=sc.nextLine();
                students[j].setFacultet(facultet);
                j++;
            }
    }

    public void PrintList(){
        for(int i=0; i<students.length; i++)
            System.out.println(students[i].getName()+"\t"+students[i].getAge()+"\t"+students[i].getFacultet());
    }
}
