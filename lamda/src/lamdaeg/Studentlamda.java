package lamdaeg;

import java.util.ArrayList;
import java.util.Collections;

class Student

{
	int stdid;
	String stdname;
	Float stdmark;
	
	public Student(int stdid, String stdname, float stdmark) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.stdmark = stdmark;
	}
}
public class Studentlamda {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(11,"vijay",(float) 55.4));
		al.add(new Student(12,"ajith",(float) 11.3));
		al.add(new Student(13,"surya",(float) 23.6));
		
		System.out.println("sorting mark");
		Collections.sort(al,(a,b)->{
			return a.stdmark.compareTo(b.stdmark);
		});
		
			for (Student s : al)
			{
				System.out.println(s.stdid+" "+s.stdname+" "+s.stdmark+" ");
			}
			
		

	}

}
