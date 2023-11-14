
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class DP3CoinCombinations1 {

	public static void main(String[] args) {
		FastReader sc=new FastReader();
		int n=sc.nextInt();
		int x=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		long dp[]= new long[x+1];
		
		for(int i:arr) {
			if(i<=x)
			dp[i]=1;
		}
		
		for(int i=0;i<x+1;i++) {
			for(int j:arr) {
				if(i-j>=0) {
					dp[i]=((dp[i]+dp[i-j])%(long)(1e9+7));
				}
			}
		}
		
		
		System.out.println(dp[x]);

		
		

	}
	

	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } }

}
