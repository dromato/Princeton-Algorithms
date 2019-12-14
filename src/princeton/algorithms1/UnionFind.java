package princeton.algorithms1;

import lombok.Builder;

@Builder
public class UnionFind {
    private int n;
        public UnionFind(int n) {
            this.n = n;
        }

        public void union(int p, int q) {

        }

        public boolean connected(int p, int q) {
            return false;
        }
}
