import java.util.Scanner;


public class NewYear {
	
	static int search(int time[], int s, int p, int high)
	{
	    int low = 1;

	    while (low < high)
	    {
	        int mid = (low+high)>>1;
	 
	        int itm = findItems(time, s, mid);
	 
	        if (itm < p){
	            low = mid+1;
	        }
	        else
	        {
	            high = mid;
	        }
	    }
	 
	    return high;
	}

	
	static int findItems(int time[], int s, int temp)
	{
	    int ans = 0;
	    for (int i = 0; i < s; i++)
	    {
	        ans += (temp/time[i]);
	    } 
	    return ans;
	}
	
	static int minTime(int time[], int s, int p)
	{
	    int maxval = 0;
	    
	    for (int i = 0; i < s; i++)
	    {
	        maxval = Math.max(maxval, time[i]);
	    }
	    
	    return search(time, s, p, maxval*p);
	}
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int p = in.nextInt();
		int t[] = new int[s];
		
		for(int i=0;i<s;i++)
		{
			t[i] = in.nextInt();
		}
		

		System.out.println(minTime(t,s,p));
		
	}
}
