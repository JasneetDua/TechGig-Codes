import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ShinchanProblem {

		public static int getMinValue(int[] numbers){
		  int minValue = numbers[0];
		  for(int i=1;i<numbers.length;i++){
		    if(numbers[i] < minValue){
			  minValue = numbers[i];
			}
		  }
		  return minValue;
		}
	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		line = br.readLine();
		String[] str1 = line.trim().split("\\s+");
		
		int n = Integer.parseInt(str1[0]);
		int m = Integer.parseInt(str1[1]);
		
		int a[] = new int[n];
		
		line = br.readLine();		
		String[] str2 = line.trim().split("\\s+");

		if(m!=1)
		{
		
		for (int i = 0; i < n; i++) {
		    a[i] = Integer.parseInt(str2[i]);
		}
		
		Arrays.sort(a);
		
		int res[] = new int[n-m+1];		
		
		for(int i = m-1; i<n ; i++)
		{
			res[i-m+1]=0;
				
			for(int j = i-m+1 ; j < i ; j++)
			{
				res[i-m+1] += a[i]-a[j];
			}
		}
		
		br.close();
		
		
		System.out.println(getMinValue(res));
		
		}
		else 
		{
			System.out.println("0");
		}
	}

}
