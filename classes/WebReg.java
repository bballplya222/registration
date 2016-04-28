package registration.classes;


public class WebReg {
  public static Course lookupCourseByName(Course[] catalog, String courseName){
    for(int i = 0; i < catalog.length; i++){
      if (catalog[i].getName().equalsIgnoreCase(courseName)){
        return catalog[i];
      }
    }
    return null;
  }
  public static Course[] lookupCoursesByDept(Course[] catalog, int dept){
    int count = 0;
    for(int i = 0; i < catalog.length; i++){
      if (catalog[i].getDepartment() == dept){
        count++;
      }
    }
    int j = 0;
    Course[] a = new Course[count];
    for(int i = 0; i < catalog.length; i++){
      if (catalog[i].getDepartment() == dept){
        a[j] = catalog[i];
        j++;
      }
    }
    if(count == 0){
      return null;
    }
    return a;
  }
  public static boolean addCourse(Student s, Course c)
  {
	  //while (s(i)!=null?
	Course [] mySchedule=s.getSchedule();  
	Student [] roster= c.getRoster();
    int j = 0;
    for (int i = 0; i < mySchedule.length; i++){
    if(mySchedule[i]!=null){
      j++;
      }
    }
    if( j == mySchedule.length){
      return false;
    }
    for (int i = 0; i < mySchedule.length; i++){
        if(mySchedule[i]==null){
        	continue; 
        }
        if (mySchedule[i].getPeriod().compareTo(c.getPeriod())==0){
        	return false; 
        }
    }
    j=0;
    for (int i=0; i<roster.length;i++){
    	if (roster[i]!=null){
    		j++;
    	}
    }
    if (j==roster.length){
    	return false;
    }
    int spot= 0;
    for (int i=0; i<roster.length; i++){
    	if (roster [i] == null){
    		spot=i;
    		break;
    	}
    }
    int spot1=0;
    for (int i=0;i<mySchedule.length; i++){
    	if(mySchedule[i]==null){
    		spot1=i;
    		break;
    	}
    }
    mySchedule[spot1]=c;
    roster[spot]=s;
    return true;
  }
  
  public static boolean dropCourse(Student s, Course c)
  {
	  
	 Course [] mySchedule= s.getSchedule();
	 Student roster []=c.getRoster();
    int schedspot = 0;
    boolean not= true;
    
    for(int i1 = 0; i1 < mySchedule.length; i1++){
    	if (mySchedule[i1]==c){
    		not=false;
    		schedspot=i1;
    	}
    }
    if (not==true){
    	return false;
    }
    int rosterspot=0;
    boolean notros=true;
    for(int i1 = 0; i1 < roster.length; i1++){
    	if (roster[i1]==s){
    		not=false;
    		rosterspot=i1;
    	}
    }
    if (notros==true){
    	return false;
    }
    mySchedule[schedspot]=null; 
    roster[rosterspot]=null;// we have removed student and course from respective array
    
    for( int i1=0;i1<mySchedule.length;i1++){
    	if (mySchedule[i1]==null){
    		for(int k=i1+1; k<mySchedule.length; k++){
    			mySchedule[k-1]=mySchedule[k];
    		}
    		mySchedule[mySchedule.length-1]=null;
    		break;
    	}
    	mySchedule[i1]=mySchedule[i1+1];
    }
    for( int i1= 0;i1<roster.length;i1++){
    	if (roster[i1]==null){
    		for(int k=i1+1; k<roster.length; k++){
    			roster[k-1]=roster[k];
    		}
    		roster[roster.length-1]=null;
    		break;
    	}
    	roster[i1]=roster[i1+1];
    }
   
    return true;
  }

 
    
  public static int countCredits(Student s){
    int credit = 0;
    Course [] mySchedule=s.getSchedule();
    for(int i = 0; i < mySchedule.length; i++){
    	if(mySchedule[i]==null){
    		break;
    	}
      credit = credit + mySchedule[i].getCredits();
      
    }
    return credit;
  }

}