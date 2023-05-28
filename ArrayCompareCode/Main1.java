import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main1 {
  public static void main(final String[] args) {
    final char[] array1 = { 'x', 'y', 'z', 'k', 'u' };
    final char[] array2 = { 'a', 'b', 'd', 'c' };
    boolean result = compareArray(array1, array2);
    System.out.println(result);
    result = compareArray1(array1, array2);
    System.out.println(result);
    result = compareArray2(array1, array2);
    System.out.println(result);
  }

  @Override
  public String toString() {
    return "Main []";
  }

  // find whether there are matching element in two arrays. return true or false
  public static boolean compareArray(final char[] array1, final char[] array2) {
    for (final char arr1Char : array1) {
      for (final char arr2Char : array2) {
        if (arr1Char == arr2Char)
          return true;
      }
    }
    return false;
  }

  // Optimised code using for loop with array since Arrays are contiguous memory
  // spaces. Data can be obtained through indexes. The time complexity is O(1), so
  // it is fast.
  static boolean compareArray1(final char[] array1, final char[] array2) {
    for (int idx = 0; idx < array1.length; idx++) {
      for (int indx = 0; indx < array2.length; indx++) {
        if (array1[idx] == array2[indx])
          return true;
      }
    }
    return false;
  }

  // All of the above solutions have time complexity of O(n^2), hence better
  // solution
  static boolean compareArray2(final char[] array1, final char[] array2) {
    List<Character> arrList = new ArrayList<>();
    if (array1.length > array2.length) {
      for (int idx = 0; idx < array2.length; idx++) {
        arrList.add(array2[idx]); // O(n)
      }
      for (int idx = 0; idx < array1.length; idx++) {

        if (arrList.contains(array1[idx]))// O(m)
          return true;
      }
    } else {

      // List<char[]> arrList = Arrays.asList(array1, new char[1]);
      /*
       * //Because char is primitive type, standard Arrays.asList(char[]) won't work.
       * It will produce List<char[]> in place of List<Character> ... so what's left
       * is to iterate over array, and fill new list with the data from that array:
       */

      for (int idx = 0; idx < array1.length; idx++) {
        arrList.add(array1[idx]);
      }
      System.out.println(arrList);
      for (int idx = 0; idx < array2.length; idx++) {
        if (arrList.contains(array2[idx]))
          return true;
      }
    }
    return false;
    // Here this method operates in for loop separately over the given arrays and
    // the O(m+n)~O(n)
    // better time complexity
  }
}
