package javaStubs;

public class TwoDArray {
   public static void main(String[] args) {
	int i,j;
      int[][] ARR= {
    		  {10,20,30},
    		  {1,2,3,4}
    		  };
    for(i=0;i<ARR.length;i++) {
    	for(j=0;j<ARR[i].length;j++) {
    		System.out.print(ARR[i][j]+"\t");
    	}
    	System.out.print("\n");
    }
}
}

