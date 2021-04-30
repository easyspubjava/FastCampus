package ch04.dfs;

import java.util.Stack;

import ch04.graph.UndirectedGraph;

public class DfsSearch {

	int count;
	boolean[] visited;
	Stack<Integer> stack;
	int[][] matrix;
	
	public DfsSearch(int count){
		this.count = count;
		visited = new boolean[count];
		stack = new Stack<Integer>();
	}
	
	public void bfsTraversal() {
	
		stack.push(0);
		visited[0] = true;
		
		while(stack.size() != 0) {
			int node = stack.pop();
			
			System.out.print(node + "  ");
			
			for(int j = 0; j<count; j++) {
				if(matrix[node][j] != 0 && !visited[j] ) {
					stack.push(j);
					visited[j] = true;
				}
			}
			
		}
	}
	
	public static void main(String[] args) {

		int count = 8;
		UndirectedGraph graph = new UndirectedGraph(count);
		DfsSearch dfsSearch = new DfsSearch(count);
		
		graph.addEdges(0, 1, 1);
		graph.addEdges(0, 2, 1);
		graph.addEdges(1, 3, 1);
		graph.addEdges(1, 4, 1);
		graph.addEdges(2, 5, 1);
		graph.addEdges(2, 6, 1);
		graph.addEdges(4, 5, 1);
		graph.addEdges(3, 7, 1);
		
		dfsSearch.matrix = graph.getMatrix();
		dfsSearch.bfsTraversal();
			
	}
}
