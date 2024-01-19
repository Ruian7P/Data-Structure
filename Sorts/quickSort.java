从大往小与前面的元素比较，若比此元素大，比再前一个元素小，则插入此元素前面
average     O(nlog(n))
best case  O(nlog(n))
worst case  O(n^2)

eg.  10 16 4 8 9 12 -2
  r1: 选 pivot 10;
      L 往右走到16>10;
      R 往左走到-2<10;
      16 和 -2 交换；
  r2: L 往右走到12>10;
      R 往左走到9<10;
      R < L;
      9(R) 和 10(pivot) 交换;
      9 -2 4 8 10 12 16
  r3: 10的左右各自quickSort递归


public static void quickSort (int[] arr, int L, int R)
{
  if (L >= R) { return; }
  
  int left = L;
  int right = R;
  while (left < right)
    {
      while (left < right && arr[right] >= arr[L])
        { right --;}
      while (left < right && arr[left] <= arr[L])
        { left ++;}
      if (right = left) {swap(arr[left], arr[L];)
      else (swap(arr[left], arr[right];)
    }
  quickSort (arr, L, left-1);
  quickSort (arr, right+1);
}
  
