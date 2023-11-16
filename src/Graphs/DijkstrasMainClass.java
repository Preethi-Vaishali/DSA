package Graphs;

public class DijkstrasMainClass {

	public static void main(String[] args) {
		int graph[][]= new int[][] {{0, 1, 1, 2, 0, 0, 0},
									{0, 0, 2, 0, 0, 3, 0},
									{1, 2, 0, 1, 3, 0, 0},
									{2, 0, 1, 0, 2, 0, 1},
									{0, 0, 3, 0, 0, 2, 0},
									{0, 3, 0, 0, 2, 0, 1},
									{0, 2, 0, 1, 0, 1, 0}};
		
	Dijkstras_Algorithm T = new Dijkstras_Algorithm();
	T.dikstra(graph, 0);
									
	}

}
