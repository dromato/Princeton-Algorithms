package princeton.algorithms1.unionfind;

public class QuickFind {
    private int[] id;

        // O(N)
        public QuickFind(int n) {
            id = new int[n];
            for (int i = 0; i < n; i++) {
                id[i] = i;
            }
        }
        // O(N)
        public void union(int p, int q) {
            int idp = id[p];
            int idq = id[q];
            for (int i = 0; i < id.length; i++) {
                if(id[i] == idp) {
                    id[i] = idq;
                }
            }
        }
        // O(1)
        public boolean connected(int p, int q) {
            return id[p] == id[q];
        }
}
