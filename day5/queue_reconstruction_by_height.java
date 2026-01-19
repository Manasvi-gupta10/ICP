class Solution {
    public int[][] reconstructQueue(int[][] people) {
         Arrays.sort(people, (a,b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);

        List<int[]> ls = new LinkedList<>();
        for (int[] p: people) ls.add(p[1], p);

        return ls.toArray(new int[people.length][2]);
    }
}