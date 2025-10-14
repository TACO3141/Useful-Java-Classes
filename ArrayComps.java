public class ArrayComps
{
  public static String[] reverseStringArray(String[] arr)
  {
    if (arr.length <= 0)
    {
      throw new ArrayIndexOutOfBoundsException("Array has no elements.");
    }
    else if (arr.length == 1)
    {
      return arr;
    }
    else
    {
      int highIndex = arr.length - 1;
      int lowIndex = 0;
      String temporary = "";
      while (lowIndex < highIndex)
      {
        temporary = arr[highIndex];
        arr[highIndex] = arr[lowIndex];
        arr[lowIndex] = temporary;
        highIndex --;
        lowIndex ++;
      }
      return arr;
    }
  }

  public static int[] reverseIntArray(int[] arr)
  {
    if (arr.length <= 0)
    {
      throw new ArrayIndexOutOfBoundsException("Array has no elements.");
    }
    else if (arr.length == 1)
    {
      return arr;
    }
    else
    {
      int highIndex = arr.length - 1;
      int lowIndex = 0;
      String temporary = "";
      while (lowIndex < highIndex)
      {
        temporary = arr[highIndex];
        arr[highIndex] = arr[lowIndex];
        arr[lowIndex] = temporary;
        highIndex --;
        lowIndex ++;
      }
      return arr;
    }
  }

  public static double[] reverseDoubleArray(double[] arr)
  {
    if (arr.length <= 0)
    {
      throw new ArrayIndexOutOfBoundsException("Array has no elements.");
    }
    else if (arr.length == 1)
    {
      return arr;
    }
    else
    {
      int highIndex = arr.length - 1;
      int lowIndex = 0;
      String temporary = "";
      while (lowIndex < highIndex)
      {
        temporary = arr[highIndex];
        arr[highIndex] = arr[lowIndex];
        arr[lowIndex] = temporary;
        highIndex --;
        lowIndex ++;
      }
      return arr;
    }
  }

  public static char[] reverseCharArray(char[] arr)
  {
    if (arr.length <= 0)
    {
      throw new ArrayIndexOutOfBoundsException("Array has no elements.");
    }
    else if (arr.length == 1)
    {
      return arr;
    }
    else
    {
      int highIndex = arr.length - 1;
      int lowIndex = 0;
      String temporary = "";
      while (lowIndex < highIndex)
      {
        temporary = arr[highIndex];
        arr[highIndex] = arr[lowIndex];
        arr[lowIndex] = temporary;
        highIndex --;
        lowIndex ++;
      }
      return arr;
    }
  }

  public static boolean[] reverseBooleanArray(boolean[] arr)
  {
    if (arr.length <= 0)
    {
      throw new ArrayIndexOutOfBoundsException("Array has no elements.");
    }
    else if (arr.length == 1)
    {
      return arr;
    }
    else
    {
      int highIndex = arr.length - 1;
      int lowIndex = 0;
      String temporary = "";
      while (lowIndex < highIndex)
      {
        temporary = arr[highIndex];
        arr[highIndex] = arr[lowIndex];
        arr[lowIndex] = temporary;
        highIndex --;
        lowIndex ++;
      }
      return arr;
    }
  }
}
