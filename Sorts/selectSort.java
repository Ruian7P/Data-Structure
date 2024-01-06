存最大或者最小值及其index，再与首个或最后一个交换
第n趟能得到前n个最小或后n个最大
average     O(n^2)
best Case   O(n^2)
Worst Case  O(n^2)

eg.  1 3 -2 4 5
 r1: 存{min=1, index=0} ——> 1比3 不换 ——> 1比-2 存{min=-2, index=2} ——> -2比4 不换 ——> -2比5 不换

public static void selectionSort (int[] a)
{
  for (int i=0 ; i < a.length-1; i++)
    {
      int min = arr[i];
      int minIndex = i;

      for (int j = i+1; j<arr.length; j++)
        {
          if (min >arr[j])
          {
            min = arr[j];
            minIndex = j;
          }

      if (i!= minIndex)                      //swap
      {
        arr[minIndex] = arr[i];
        arr[i] = min;
      }
