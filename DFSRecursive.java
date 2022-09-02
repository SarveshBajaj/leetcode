import java.util.*;

public class DFSRecursive{

    void DFSUtil(boolean[] visited, int u, Map<Integer, ArrayList<Integer>> graph){
        visited[u]=true;
        System.out.print(u + " ");
        for(int i : graph.get(u)){
            if(!visited[i])
                DFSUtil(visited, i, graph);
        }
    }

    void DFS(int u, Map<Integer, ArrayList<Integer>> graph){
        // 4 - no. of vertices
        boolean visited[] = new boolean[4];
        DFSUtil(visited, u, graph);
    }
    /**
     * 0 - 1 - 2
     * 1 - 2
     * 2 - 0 - 3
     * 3 - 3
     */
    public static void main(String[] args) {
        CreateGraph createGraph = new CreateGraph();
        ArrayList<ArrayList<Integer>> temp = new ArrayList<>();
        temp.add(new ArrayList<Integer>(Arrays.asList(1,2)));
        temp.add(new ArrayList<Integer>(Arrays.asList(2)));
        temp.add(new ArrayList<Integer>(Arrays.asList(0,3)));
        temp.add(new ArrayList<Integer>(Arrays.asList(3)));
        
        Map<Integer, ArrayList<Integer>> graph = createGraph.createGraph(temp);
        
        DFSRecursive dfsRecursive = new DFSRecursive();
        dfsRecursive.DFS(2, graph);
    }
}