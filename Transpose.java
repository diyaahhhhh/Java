package javaStubs;

public class Transpose {
    public static void main(String[] args) {
    	int i,j,row=3,col=2;
    	int[][] MATRIX= {
    			{1,2,3},
    			{6,7,8}
    	     };
    	int[][] TRANSPOSE=new int[row][col];
    	for(i=0;i<3;i++) {
    		for(j=0;j<2;j++) {
    			TRANSPOSE[j][i]=MATRIX[i][j];
    		}
    	}
    	System.out.println("Transpose:");
    	for(i=0;i<2;i++) {
    		for(j=0;j<3;j++) {
    		System.out.print(TRANSPOSE[j][i]+"\t");
    		    }
    		System.out.println();
    	}
    }
}
