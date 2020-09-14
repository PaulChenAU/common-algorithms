package graph.unionfind;

import java.util.Arrays;

public class WeightedQuickUnion extends UnionFindBase{

    /**
     * weighted quick union adds a size array to indicate the
     * number of nodes of root
     * when union two nodes, the node with smaller number will
     * be merged to the bigger one
     */
    private int size[];

    public WeightedQuickUnion(int num){
        super(num);
        this.size = new int[num];
        Arrays.fill(size, 1);
    }

    @Override
    public boolean connected(int m, int n) {
        return (find(m) == find(n));
    }

    @Override
    public void union(int m, int n) {
        int rootm = find(m);
        int rootn = find(n);

        if(rootm == rootn){
            return;
        }

        if(size[rootm] < size[rootn]){
            id[rootm] = rootn;
            size[rootn] += size[rootm];
        } else{
            id[rootn] = rootm;
            size[rootm] += size[rootn];
        }
    }

    @Override
    public int find(int m) {
        while (m != id[m]){
            m = id[m];
        }

        return m;
    }

    public static void main(String[] args) {

        WeightedQuickUnion uf = new WeightedQuickUnion(10);
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
