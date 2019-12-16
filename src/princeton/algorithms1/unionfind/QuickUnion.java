package princeton.algorithms1.unionfind;

public class QuickUnion {
    private int[] id;

    public QuickUnion(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public void union(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);

        id[rootP] = rootQ;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    private int root(int i) {
        while (i != id[i])  {
            i = id[i];
        }

        return i;
    }
}
