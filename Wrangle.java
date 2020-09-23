// --== CS400 File Header Information ==--
// Name: Frank Slavinsky
// Email: fslavinsky@wisc.edu
// Team: BB
// Role: Data Wrangler
// TA: Briana Cochran
// Lecturer: Gary Dahl
// Notes to Grader: N/A
/**
 * This class contains static methods to check and then put/get key-value pairs from the hash table
 * implemented in HashTableMap.java
 * 
 * @author Frank Slavinsky
 *
 */
public class Wrangle {
  private static CourseReading readingToPass; // the object/value added to HashTableMap

  /**
   * @param isbn
   * @return
   */
  public static boolean setISBN(int isbn) {
    Integer ISBN = (Integer) isbn;
    if (!((Object) ISBN instanceof Integer)) // check that key is an instance of Integer
      return false;
    if (String.valueOf(ISBN).length() != 9)
      return false;
    // TODO check if ISBN already exists in the table??
    resetReading();
    readingToPass.setISBN(ISBN);
    return true;
  }

  /**
   * @param title
   * @return
   */
  public static boolean setTitle(String title) {
    if (!(title instanceof String))
      return false;
    readingToPass.setBookTitle(title);
    return true;
  }

  /**
   * @param course
   * @return
   */
  public static boolean setCourse(String course) {
    if (!(course instanceof String))
      return false;
    readingToPass.setCourse(course);
    return true;
  }

  /**
   * @return
   */
  public static CourseReading value() {
    return readingToPass;
  }

  /**
   * @return
   */
  public static Integer key() {
    return readingToPass.getISBN();
  }

  /**
   * This is a private helper method to clear the static field readingToPass so that it is ready for
   * the next CourseReading to be added to the hash table.
   */
  private static void resetReading() {
    readingToPass = new CourseReading();
  }

//   /**
//   * I have included this method if you wish to see the functionality of Wrangle, CourseReading,
//   and
//   * your HashTableMap.
//   */
//   public static void main(String[] args) {
//   HashTableMap<Integer, CourseReading> table = new HashTableMap<Integer, CourseReading>();
//   Wrangle.setISBN(898989899); // in final product, the param would come from user input
//   Wrangle.setTitle("Harry Potter"); // *see above comment*
//   Wrangle.setCourse("English 345"); // *see above comment*
//   table.put(Wrangle.key(), Wrangle.value()); // use staic methods to get the key and value passed
//   Wrangle.setISBN(454545454); // New CourseReading to add
//   Wrangle.setTitle("LOTR");
//   Wrangle.setCourse("English 745");
//   table.put(Wrangle.key(), Wrangle.value());
//   System.out.println(table.get(898989899).getBookTitle()); // should return "Harry Potter"
//   System.out.println(table.get(454545454).getInfo()); // should return "Title: LOTR\nClass:
//   // English 745"
//   }

}
