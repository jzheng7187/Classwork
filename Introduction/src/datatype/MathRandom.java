package datatype;

import java.util.Random;

public class MathRandom {

	public static void main(String[] args) {
		int[] results = new int[6];
		//same as int[] results = [0,0,0,0,0,0]
		int totalRolls = 10000;
		for(int index = 0; index < totalRolls; index++){
			int roll = rollUnfairDie();
			System.out.println("Roll #"+(index+1)+" Die is "+rollUnfairDie());
			results[roll - 1]++;
		}
		for(int i = 0; i < 6; i++){
			int percentage = (int) (100 * (double)results[i]/totalRolls );
			System.out.println((i + 1) + "was rolled "+ percentage+"%");
		}
	}

//	public static int rollFairDie(){
//		Random gen = new Random();
//		return gen.nextInt(6)+1;
//		double rand = Math.random();
//		//creates random double (0,1)
//		int roll = (int) (6 * rand);
//		//results [0,5] This is what above code does
//		return roll + 1;
//		
//	}

	public static int rollUnfairDie(){
		double rand1 = Math.random();
		double integer = Math.random();
		int counter = (int)(3 * integer);
		int roll = (int) (6 * rand1);
		return (int) (((roll * counter)/1.5) + 1) ;
	}
}
