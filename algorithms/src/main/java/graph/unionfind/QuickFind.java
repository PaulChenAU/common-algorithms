package graph.unionfind;

/**
 *   we use id array to record the parent of index
 *   e.g id[4] = 8  parent of node 4 is node 8
 *   if two index has the same value - id[i] = id[j] => i and j are connected
 */
public class QuickFind extends UnionFindBase {

    public QuickFind(int num){
        super(num);
    }

    /**
     * check whether node m and node n are connected
     * time complexity: O(1)
     * for all the nodes: time complexity: O(n)
     * @param m
     * @param n
     * @return
     */
    @Override
    public boolean connected(int m, int n) {
        return (id[m] == id[n]);
    }

    /**
     * set all the nodes which parent is m's parent to n's parent
     * time complexity: O(n)
     * for all the nodes: time complexity: O(n^2)
     * @param m
     * @param n
     */
    @Override
    public void union(int m, int n) {
        for (int i = 0; i < NUM; i++) {
            if(id[i] == id[m]){
                id[i] = id[n];
            }
        }
    }

    /**
     * quick find
     * time complexity: O(1)
     * @param m
     */
    @Override
    public int find(int m) {
        return id[m];
    }

    public static void main(String[] args) {
        QuickFind uf = new QuickFind(10);
        uf.union(0,5);
        uf.union(5,6);
        uf.union(1,2);
        System.out.println("0-5 connected: " + uf.connected(0,5));
        System.out.println("5-6 connected: " + uf.connected(5,6));
        System.out.println("0-6 connected: " + uf.connected(0,6));
        System.out.println("1-2 connected: " + uf.connected(1,2));
        System.out.println("0-1 connected: " + uf.connected(0,1));

        uf.printIdArray();
    }

}
