int solution(int[] a) {
    Set<Integer> set = new HashSet<>();
    
    for (int i = 0; i < a.length; i++) {
        if (!set.contains(a[i])) {
            set.add(a[i]);
        } else {
            return a[i];
        }
    }
    
    return -1;
}
