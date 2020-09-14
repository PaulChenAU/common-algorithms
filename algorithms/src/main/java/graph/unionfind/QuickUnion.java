package graph.unionfind;

public class QuickUnion extends UnionFindBase{

    public QuickUnion(int num){
        super(num);
    }


    @Override
    public boolean connected(int m, int n) {
        return find(m) == find(n);
    }

    /**
     * union the root of node m and the root of node n together
     * only update one entry
     * time complexity: O(lgn)~O(n)
     * @param m
     * @param n
     */
    @Override
    public void union(int m, int n) {
        int rootm = find(m);
        int rootn = find(n);
        id[rootm] = rootn;
    }

    /**
     * quick union
     * time complexity: O(lgn)~O(n)
     * @param m
     * @return
     */
    @Override
    public int find(int m) {
        while (m != id[m]){
            m = id[m];
        }

        return m;
    }

}
