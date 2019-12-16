package princeton.algorithms1.unionfind;

public class WeightedQuickUnion {
    private int[] id;
    private int[] size;

    public WeightedQuickUnion(int n) {
        id = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
            size[i] = 1;
        }
    }

    public void union(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);

        if(rootP == rootQ) return;

        if(size[rootP] < size[rootQ]) {
            id[rootP] = rootQ;
            size[rootQ] += size[rootP];
        } else {
            id[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    private int root(int i) {
        while (i != id[i])  {
            id[i] = id[id[i]];
            i = id[i];
        }

        return i;
    }
}
