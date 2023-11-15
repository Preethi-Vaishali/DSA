package BFS;

public class Graph_BFS {

	public static void main(String[] args) {
		BFS_Graph g = new BFS_Graph(6);
		g.addEdge(0, 1);
		g.addEdge(0, 3);
		g.addEdge(0, 4);
		g.addEdge(4, 5);
		//initialize a new boolean array to store g.addedge(2,0);
		g.addEdge(3, 5);
		g.addEdge(1, 2);
		g.addEdge(1, 0);
		g.addEdge(2, 1);
		g.addEdge(4, 1);
		g.addEdge(3, 1);
		g.addEdge(5, 4);
		g.addEdge(5, 3);
		System.out.println("Following is Breadth First Traversal: ");
		g.BFS(0);

	}

}
