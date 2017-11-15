/*
 * 
 */
public class NumberOfISlands {

	public static void main(String[] args) {
		
//		int m[][]= {{1, 1, 0, 0, 0},
//					{0, 1, 0, 0, 1},
//					{1, 0, 0, 1, 1},
//					{0, 0, 0, 0, 0},
//					{1, 0, 1, 0, 1}
//               		};
		int m[][] = {{1, 1, 0},
					{0, 0, 1},
					{1, 0, 1}};
		int islands = countIslands(m);
		System.out.println(islands);
		
	}

	private static int countIslands(int[][] m) {
		int r = m.length;
		int c = m[0].length;
		boolean visited[][]= new boolean [r][c];
		int count =0;
		
		for(int i =0;i<r;i++){
			for(int j=0;j<c;j++){				
				if(m[i][j]==1 && !visited[i][j]){
					DFS(m,i,j,visited);
					count++;
				}
			}
		}
		return count;
	}
	

	private static void DFS(int[][] m, int i, int j, boolean[][] visited) {
		// TODO Auto-generated method stub
		int dx[]={-1,-1,-1,0,0,1,1,1};
		int dy[]={-1,0,1,-1,1,-1,0,1};
		visited[i][j]=true;
		for(int k =0;k<8;k++){
			int x = i+dx[k];
			int y = j+dy[k];
			if(x>=0 && x<m.length && y>=0 && y<m[0].length && m[x][y]==1 && !visited[x][y]){
				DFS(m,x,y,visited);
			}
		}
	}

}
