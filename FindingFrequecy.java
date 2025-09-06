package Arrays;

public class FindingFrequecy {
	public static void main(String args[]) {
		int [] array = {2,6,3,8,2,8,2,3,8,3};
		int [] query = {2,8,5,3};
		
		for(int v :query) {
			 int count = 0;
          for(int q :array) {
        	  if(v == q) {
        		  count = count +1;
        	  }
			}
          System.out.println(count);
		}
		
	}

}
