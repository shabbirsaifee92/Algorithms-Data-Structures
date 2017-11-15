import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

/*
 * Given a square chessboard of N x N size, the position of Knight and position of a target is given. 
 * We need to find out minimum steps a Knight will take to reach the target position.
 * 6
 * 4 5
 * 1 1
 * 
 * O/p: 3
 */
public class KnightProblem {
	
	static class cell{
		int x ,y,dist;
		cell(int x ,int y, int dist){
			this.x=x;
			this.y=y;
			this.dist=dist;
		}
	}
	
	public static void main(String args[]){
		
//		int n = 20;
//		int tx=4;
//		int ty=6;
//		int kx=14;
//		int ky=19;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the chess board");
		int n = sc.nextInt();
		System.out.println("Enter x and y coordinate of the target");
		int tx= sc.nextInt();
		int ty = sc.nextInt();
		System.out.println("Enter the x and t location of the knight");
		int kx = sc.nextInt();
		int ky =sc.nextInt();
		
		int jumps = minJumps(n,tx,ty,kx,ky);
		System.out.println(jumps);
		
	}


	private static int minJumps(int n, int tx, int ty, int kx, int ky) {
		// TODO Auto-generated method stub
		
		Queue<cell> q = new LinkedList<>();
		boolean visited[][] = new boolean[n][n];
		int dx[]={-2,-2,-1,-1,1,1,2,2};
		int dy[]={-1,1,-2,2,-2,2,-1,1};
		q.add(new cell(kx,ky,0));
		
		while(!q.isEmpty()){
			cell c = q.poll();
			visited[c.x][c.y] = true;
			if(c.x==tx & c.y==ty)
				return c.dist;
			for(int i =0;i<8;i++){
				int x = c.x+dx[i];
				int y = c.y+dy[i];
				
				if(x>=0 & x<n && y>=0 &&y<n && !visited[x][y]){
					q.add(new cell(x,y,c.dist+1));
				}
			}
		}
		return 0;
	}


	
}


