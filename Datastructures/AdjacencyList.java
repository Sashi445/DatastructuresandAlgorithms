import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;


class GraphNode{

    int u;
    int v;
    int weight;

    GraphNode(int u, int v, int weight){
        this.u = u;
        this.v = v;
        this.weight = weight;
    }

    public void printGraphNode(){
        System.out.printf("[ %d, %d, %d ]%n", this.u, this.v, this.weight);
    }

}

public class AdjacencyList{

    HashMap<Integer, ArrayList<GraphNode>> graph;

    public AdjacencyList(){
        this.graph = new HashMap<>();
    }

    public void addEdge(int u, int v, int weight){

        if (!this.graph.containsKey(u)) {

            ArrayList<GraphNode> list = new ArrayList<>();
            
            list.add(new GraphNode(u, v, weight));
            
            this.graph.put(u, list);

        }else{
            
            ArrayList<GraphNode> list =  this.graph.get(u);

            list.add(new GraphNode(u, v, weight));

            this.graph.replace(u, list);

        }

    }

    private void dfsHelper(int startNode, HashMap<Integer, Boolean> visited){

        System.out.println(startNode);

        if ( this.graph.get(startNode) == null)
            return;

        ArrayList<GraphNode> neighbors = this.graph.get(startNode);

        visited.put(startNode, true);

        for ( GraphNode neighbor : neighbors  ) {

            if ( visited.get(neighbor.v) == null ) {

                dfsHelper(neighbor.v, visited);

            }

        }

    }

    public void depthFirstSearch(int startNode){
        dfsHelper(startNode, new HashMap<Integer, Boolean>());
    }

    public void breadthFirstDearch(int startNode){

        if (this.graph.get(startNode) == null){
            return;
        }

        HashMap<Integer, Boolean> visited = new HashMap<>();

        LinkedList<Integer> bfsQueue = new LinkedList<>();

        bfsQueue.add(startNode);

        while ( bfsQueue.size() > 0 ) {

            startNode = bfsQueue.peekFirst();

            System.out.println(startNode);

            if ( this.graph.get(startNode) != null && visited.get(startNode) == null){

                for ( GraphNode neighbor : this.graph.get(startNode) ){

                    bfsQueue.add(neighbor.v);

                }

            }

            visited.put(startNode, true);

            bfsQueue.removeFirst();

        }


    }

    public void printGraph(){
    
        for (ArrayList<GraphNode> list : this.graph.values()){
            for (GraphNode node : list){
                node.printGraphNode();
            }
        }
    
    }


    public static void main(String[] args) {
     
        AdjacencyList adjList = new AdjacencyList();

        adjList.addEdge(13, 11, 4);
        adjList.addEdge(11, 13, 1);
        adjList.addEdge(12, 13, 6);
        adjList.addEdge(11, 12, 4);
        adjList.addEdge(13, 12, 1);
        adjList.addEdge(13, 14, 2);

        adjList.printGraph();

        // adjList.depthFirstSearch(14);

        adjList.breadthFirstDearch(11);

    }

}