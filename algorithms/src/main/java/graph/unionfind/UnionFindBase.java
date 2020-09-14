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


    public void printIdArray(){
        System.out.println(NUM);
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < NUM-1; i++) {
            sb.append(id[i]);
            sb.append(',');
            sb.append(' ');
        }
        sb.append(id[NUM-1]);
        sb.append(']');
        System.out.println(sb.toString());
    }
}
