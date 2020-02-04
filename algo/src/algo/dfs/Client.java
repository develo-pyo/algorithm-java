package algo.dfs;

public class Client {
   //https://gmlwjd9405.github.io/2018/08/14/algorithm-dfs.html
   public static void main(String[] args) {
      Graph g = new Graph(4);

      g.addEdge(0, 1);
      g.addEdge(0, 2);
      g.addEdge(1, 2);
      g.addEdge(2, 0);
      g.addEdge(2, 3);
         
//                     0  
//                  1      2
//                       3                                     
      
      
      g.DFS(2); /* 주어진 노드를 시작 노드로 DFS 탐색 */
//      g.DFS(); /* 비연결형 그래프의 경우 */
   }

}
