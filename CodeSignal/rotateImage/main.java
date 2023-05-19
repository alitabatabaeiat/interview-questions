int[][] solution(int[][] a) {
  for (int i = 0; i < a.length / 2; i++) {
      for (int j = i; j < a.length - 1 - i; j++) {
          System.out.println(i + " " + j);
          int temp = a[i][j];
          a[i][j] = a[a.length - 1 - j][i];
          a[a.length - 1 - j][i] = a[a.length - 1 - i][a.length - 1 - j];
          a[a.length - 1 - i][a.length - 1 - j] = a[j][a.length - 1 - i];
          a[j][a.length - 1 - i] = temp;
      }
  }
  
  return a;
}
