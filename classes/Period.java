package registration.classes;
public class Period{
  private int timeSlot;
  private char day;
// need to reevaluate this constructor and how it'll work with the rest of the program? 
  public Period(char day, int timeSlot){
    this.day= day;
    this.timeSlot= timeSlot;
  }
  public char getDay(){
    return day;
  }
  public int getTimeSlot(){
    return timeSlot;
  }
  public String toString(){
    return ""+day+timeSlot; //check this before submitting
  }
  public int compareTo(Period other){
	  String week= "MTWHFS";
	  if (week.indexOf(day)>week.indexOf(other.day)){
		  return 1;
	  }
	  else if (week.indexOf(day)<week.indexOf(other.day)){
		  return -1;
	  }
	  else {
		  if (timeSlot>other.timeSlot){
			  return 1;
		  }
		  else if (timeSlot<other.timeSlot){
		 return -1; }
		  else{
			  return 0;
		  }
		  
	  }
	  
  }
}

