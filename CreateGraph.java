import java.util.*;

public class CreateGraph {
    void addNodeToGraph(Map<Integer, ArrayList<Integer>> graph, Collection<Integer> values, int index){
        ArrayList<Integer> adjacencyList = new ArrayList<>();
        adjacencyList.addAll(values);
        graph.put(index, adjacencyList);
    }

    Map<Integer,ArrayList<Integer>> createGraph(ArrayList<ArrayList<Integer>> graphValues){
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();

        for(int i = 0;i<graphValues.size();i++){
            addNodeToGraph(graph, graphValues.get(i), i);
        }

        return graph;
    }
}
