public class {
  public static Course lookupCourseByName(Course[] catalog, String courseName){
    for(int i = 0; i < catalog.length; i++){
      if (catalog[i].getName().equalsIgnoreCase(courseName)){
        return catalog[i];
      }
    }
    return null
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
  public static boolean addCourse(
    Course[] catalog,
    Course[] mySchedule,
    int myNumCourses,
    int dept,
    int courseNum)
  {
    int j = 0;
    if (mySchedule.length <= myNumCourses){
      System.out.println(mySchedule.length);
      return false;
    }
    for (int i = 0; i < catalog.length; i++){
    if(catalog[i].getDepartment() == dept && catalog[i].getCourseNumber() == courseNum){
      mySchedule[myNumCourses] = catalog[i];
      j++;
      }
    }
    if( j == 0){
      return false;
    }
    return true;
  }
  public static boolean dropCourse(
    Course[] mySchedule,
    int myNumCourses,
    int dept,
    int courseNum)
  {
    int j = 0;
    for(int i = 0; i < myNumCourses; i++){
    if(mySchedule[i].getDepartment() == dept && mySchedule[i].getCourseNumber() == courseNum){
      if(i < myNumCourses){
        for(j = i; j < myNumCourses; j++){
          mySchedule[i] = mySchedule[i+1];
          i++;
        }
      }
    }
    }
    if (j==0){
    return false;
    }
    return true
  }
  public static int countCredits(Course[] mySchedule, int myNumCourses)
  {
    int credit = 0;
    for(int i = 0; i < myNumCourses; i++){
      credit = credit + mySchedule[i].getCredits();
      
    }
    return credit;
  }

}