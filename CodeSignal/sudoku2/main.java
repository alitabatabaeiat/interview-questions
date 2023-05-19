boolean solution(char[][] grid) {
  Set<Character> validator = new HashSet<>();
  
  // rows
  for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
          char c = grid[i][j];
          if (c != '.') {
              if (validator.contains(c)) {
                  return false;
              }
              validator.add(c);
          }
      }
      validator.clear();
  }
  
  // columns
  for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
          char c = grid[j][i];
          if (c != '.') {
              if (validator.contains(c)) {
                  return false;
              }
              validator.add(c);
          }
      }
      validator.clear();
  }
  
  
  // sub-grids
  for (int m = 0; m < 3; m++) {
      for (int n = 0; n < 3; n++) {
          for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                  char c = grid[m * 3 + i][n * 3 + j];
                  if (c != '.') {
                      if (validator.contains(c)) {
                          return false;
                      }
                      validator.add(c);
                  }
              } 
          }
          validator.clear(); 
      } 
  }
  
  return true;
}
