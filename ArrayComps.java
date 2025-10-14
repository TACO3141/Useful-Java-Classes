public class ArrayComps
{
  public static reverseString(String[] arr)
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
        highIndex --;
        lowIndex ++;
      }
    }
  }
}
