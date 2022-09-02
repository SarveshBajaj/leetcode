import java.util.*;

public class GraphShortestPath {

    public int valueOFShortestPath(Map<Integer, ArrayList<Integer>> graph, int source, int dest){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        boolean visited[] = new boolean[(graph.size())];
        visited[source] = true;
        int pathValue[] = new int[(graph.size())];
        // for (int i = 0; i < pathValue.length; i++) {
        //     pathValue[i] = Integer.MAX_VALUE;
        // }
        pathValue[source] = 0;
        while(!queue.isEmpty()){
            int currentNode = queue.poll();
            for(int node : graph.get(currentNode)){
                if(!visited[node]){
                    visited[node] = true;
                    // pathValue[node] = java.lang.Math.min(pathValue[node],
                    pathValue[node] = pathValue[currentNode]+1;

                    queue.add(node);
                }
            }
        }
        return pathValue[dest];
    }
    public static void main(String[] args){
        CreateGraph createGraph = new CreateGraph();
        ArrayList<ArrayList<Integer>> temp = new ArrayList<>();
        temp.add(new ArrayList<Integer>(Arrays.asList(1,2)));
        temp.add(new ArrayList<Integer>(Arrays.asList(0,3,4)));
        temp.add(new ArrayList<Integer>(Arrays.asList(0,4)));
        temp.add(new ArrayList<Integer>(Arrays.asList(1,4,5)));
        temp.add(new ArrayList<Integer>(Arrays.asList(1,2,3,5)));
        temp.add(new ArrayList<Integer>(Arrays.asList(3,4)));
        Map<Integer, ArrayList<Integer>> graph = createGraph.createGraph(temp);
        GraphShortestPath graphShortestPath = new GraphShortestPath();
        System.out.println(graphShortestPath.valueOFShortestPath(graph, 0, 5));

    }

}
