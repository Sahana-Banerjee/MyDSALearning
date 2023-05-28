// Write a program to reverse a string
//ex Sahana -> anahaS

class Maint2 {
  public static void main(final String[] obj) {
    String intro = "I am Sahana";
    StringBuilder introb = new StringBuilder(intro);
    System.out.println(introb.reverse());
  }
}

//internal working is on arrray of character and hence O(n) time complexity