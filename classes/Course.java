
public class Course {

	private int department;
	private int courseNum;
	private String name;
	private char day;
	private int timeSlot; // this should be pulled from period object i think 
	private int credits;
	private Student roster[] = new Student [20];
	private Period p;

	public Course(int department, int courseNum, String name, char day, int timeSlot, int credits) {
    this.department = department;
    this.courseNum = courseNum;
    this.name = name;
    this.day = day;
    this.timeSlot = timeSlot;
    this.credits = credits;
  }

  public int getDepartment() {
   return department;
  }

  public int getCourseNumber() {
    return courseNum;
  }

  public String getName() {
    return name;
  }

  public Period getPeriod() {
    return p; //this is supposed to return the period
  }

  public int getCredits() {
    return credits;
  }

  public Student[] getRoster(){
    return roster;
  }
  public String toString(){
	  return department+":"+courseNum+" ["+name+"]"+p+" credits:"+credits;
  }
  public boolean equals(Course other){
	  if (courseNum==other.courseNum && department==other.department){
		  return true;
	  }else{ 
		  return false;
	  }
  }

}