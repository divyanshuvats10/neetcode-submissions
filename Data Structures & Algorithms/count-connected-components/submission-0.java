class Solution {

    public void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int node) {
        visited[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(adj, visited, neighbor);
            }
        }
    }

    public int countComponents(int n, int[][] edges) {


        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            adj.get(u).add(v);
            adj.get(v).add(u); 
        }

    
        boolean[] visited = new boolean[n];
        int components = 0;

        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                components++;
                dfs(adj, visited, i);
            }
        }

        return components;
    }
}
