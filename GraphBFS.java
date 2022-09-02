import java.util.*;


public class GraphBFS{

    void bfs(Map<Integer, ArrayList<Integer>> graph , int s){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s); // start point
        boolean visited[] = new boolean[4];
        visited[s] = true;
        while(!queue.isEmpty()){
            int front = queue.poll(); // poll returns null pop throws error if no value
            ArrayList<Integer> adjList = graph.get(front);
            for(int value : adjList){
                if(!visited[value]){
                    visited[value] = true;
                    queue.add(value);
                }
            }
            System.out.println(front);
        }
    }
    public static void main(String[] args){
        CreateGraph createGraph = new CreateGraph();
        ArrayList<ArrayList<Integer>> temp = new ArrayList<>();
        temp.add(new ArrayList<Integer>(Arrays.asList(1,2)));
        temp.add(new ArrayList<Integer>(Arrays.asList(2)));
        temp.add(new ArrayList<Integer>(Arrays.asList(0,3)));
        temp.add(new ArrayList<Integer>(Arrays.asList(3)));
        
        Map<Integer, ArrayList<Integer>> graph = createGraph.createGraph(temp);
        GraphBFS graphBFS = new GraphBFS();
        graphBFS.bfs(graph, 2);

    }
}
