char solution(String s) {
  Set<Character> nonRep = new LinkedHashSet<>();
  Set<Character> rep = new HashSet<>();
  
  nonRep.add(s.charAt(0));
      
  for (int i = 1; i < s.length(); i++) {
      char c = s.charAt(i);
      if (nonRep.contains(c)) {
          nonRep.remove(c);
          rep.add(c);
      } else if (!rep.contains(c)) {
          nonRep.add(c); 
      }
  }
  
  if (nonRep.isEmpty()) {
      return '_';  
  }
  
  return nonRep.iterator().next();
}
