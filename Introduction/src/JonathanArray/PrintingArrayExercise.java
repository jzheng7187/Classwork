package JonathanArray;

public class PrintingArrayExercise {

	private static boolean[][] arr2D;
	
	public static void main(String[] args) {
		arr2D = new boolean[5][5];
		print(arr2D);
		buttonclick(3,3);
		print(arr2D);
		buttonclick(3,3);
		print(arr2D);
	}

	private static void switchRow(boolean[] row, int x){
//		for(int i = -1; i < 2; i++){
//			if(x + 1 >= 0 && x + i < row.length){
//				row[x + i] = !row[x+i];
//			}
//		}
		if(x >= 0 && x < row.length){
			for(int i = -1; i < 2; i++){
				if(x + 1 >= 0 && x + i < row.length){
					row[x + i] = !row[x+i];
				}
			}
		}
	}
	
	private static void switchColumn(boolean[][] grid, int r, int c){
		switchIfValid(arr2D, r - 1, c);
		switchIfValid(arr2D, r + 1, c);
	}
	
	public static void switchIfValid(boolean[][] grid, int r, int c){
		if(r >= 0 && r < arr2D.length && c >= 0 && c < grid[r].length){
			grid[r][c] = !grid[r][c];
		}
	}
	
	private static void buttonclick(int r, int c) {
		if(r >= 0 && r < arr2D.length){//not on rubric
			switchRow(arr2D[r], c);
		}
		switchColumn(arr2D, r, c);//one point
		//check if any lights are on
		boolean win = true;
		A: for(int i = 0; i < arr2D.length; i++){
			for(int j = 0; j < arr2D[i].length; j++){
				//1 of two points 
				if(arr2D[i][j]){
//					return;
					win = false;
					break A;
				}
			}
		}
		if(win){
			System.out.println("You have solved the puzzle!");
		}
	}
	
	

	public static void print(boolean[][] grid){
		for(int row = 0; row < grid.length; row++){
			for(int col = 0; col < grid[0].length; col++){
				if(grid[row][col] == true ){
					System.out.print("O");
				}else{
					System.out.print("X");
				}
			}
			System.out.print("\n");
		}
		System.out.println("- - - - - - - - - - ");
	}
	
}
