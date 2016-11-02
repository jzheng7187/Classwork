package caveExplorer;

import java.util.Arrays;

public class TwoDArrayIntro {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(arr));
	
		//rows, columns
		//rows = arr2D.length
		//columns = arr2D[i].length
		String [][] arr2D = new String[4][3];
		//iterate row by row
		for(int row = 0; row < arr2D.length; row++){
			//in each row, go column by column
			for(int col = 0; col < arr2D[row].length; col++){
				arr2D[row][col] = "("+row+ "," + col + ")";
			}
		}
		
		//print each row
		for(String[] row: arr2D){
			System.out.println(Arrays.toString(row));
		}
		
		String [][] pic = new String[10][8];
		for(int row = 0; row < pic.length; row++){
			for(int col = 0; col < pic[row].length; col++){
				pic[row][col] = " ";
			}
		}
		for(int row = 0; row < pic.length; row++){
			for(int col = 0; col < pic[row].length; col++){
				if(Math.random() > .91){
				pic[row][col] = "v";
				}
			}
			
		}
		
		pic[1][2] = "O";
		pic[0][2] = "|";
		pic[2][2] = "|";
		pic[1][1] = "-";
		pic[1][3] = "-";
		pic[0][1] = "\\";
		pic[2][3] = "\\";
		pic[0][3] = "/";
		pic[2][1] = "/";
		
		
		for(int row = 7; row < pic.length; row++){
			for(int col = 0; col < pic[row].length; col++){
				pic[row][col] = "M";
			}
		}	
		
//		for(int row = 0; row < pic.length; row++){
//			for(int col = 0; col < pic[row].length; col++){
//				if(col == 0 && col == pic[row].length-1){
//					pic[row][col] = "|";
//				}
//				if(col == 0 && row == 0){
//					pic[row][col] = "-";
//				}
//				
//			}
//		}
		
		//top row is "_"
		for(int col = 0; col < pic[0].length; col++){
			pic[0][col] = "_";
			pic[pic.length - 1][col] = "_";
		}
		
		//left and right col is "|"
		for(int row = 1; row < pic.length; row++){
			pic[row][0] = "|";
			pic[row][pic[0].length - 1] = "|";
		}
		printPic(pic);
	}
	
	public static void printPic(String[][] pic){
		for(int row = 0; row < pic.length; row++){
			for(int col = 0; col < pic[row].length; col++){
				System.out.print((pic[row][col]));
			}
			System.out.println();
		}
	}

}
