package OopsPractise;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

        ArrayList<Student> student1=new ArrayList<Student>();
        student1.add(new Student("Sanju",7));
        student1.add(new Student("Navya",6));
        student1.add(new Student("Manu",7));
        student1.add(new Student("Navya",5));
        student1.add(new Student("Priya",8));
        student1.add(new Student("Anitha",4));

        ArrayList<Student> duplicate=new ArrayList<Student>();

        for(int i=0;i<student1.size();i++)
        {
            for(int j=i+1;j<student1.size();j++)
            {
                Student s1=student1.get(i);
                Student s2=student1.get(j);
                if(s1.getId()==s2.getId())
                {

                    duplicate.add(s2);

                }
            }
        }

        System.out.println(duplicate);
    }
}
	

