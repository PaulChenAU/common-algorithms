package graph.unionfind;

public abstract class UnionFindBase {
    protected int id[];  /* records the parent of node */
    protected int NUM;   /* number of nodes */

    /**
     * returns true if node m and node n are connected
     * @param m
     * @param n
     * @return
     */
    public abstract boolean connected(int m, int n);

    /**
     * union node m and node n together through modify their parents
     * @param m
     * @param n
     */
    public abstract void union(int m, int n);
}
