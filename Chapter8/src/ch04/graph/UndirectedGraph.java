package ch04.graph;

public class UndirectedGraph{
    private int count;   //노드 수           
    private int[][] vertexMatrix;  // matrix로 그래프 표시
    
    
    public UndirectedGraph(int count){
        this.count = count;
        vertexMatrix = new int[count][count];
    }

    public void addEdges(int from, int to, int weight){
    	vertexMatrix[from][to] = weight;
    	vertexMatrix[to][from] = weight;
    }
    
    public int[][] getMatrix(){
    	return vertexMatrix;
    }
}