public class Unit8_1a
{
  public int [][] modifyRows (int [][] array)
  { 
    for(int r = 0; r < array.length; r+= 2)
    {
      for(int c = 0; c < array[0].length; c++)
      {
        array[r+1][c] = array[r][c];
        }
    }
    return array;
  }
}
 