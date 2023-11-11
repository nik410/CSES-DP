
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DP2MinimizingCoins {

	public static void main(String[] args) {
		FastReader sc=new FastReader();
		int n=sc.nextInt();
		int x=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int dp[][]=new int[n][x+1];
	
		
		for(int i=0;i<x+1;i++) {
			if(i%arr[0]==0)dp[0][i]=(i/arr[0]);
			else { dp[0][i]=(int)1e9;}
		}
		
		
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<x+1;j++) {
				int notTaken=dp[i-1][j];
				int taken= (int)1e9;
				if(arr[i]<=j)taken=1+dp[i][j-arr[i]];
				dp[i][j]=Math.min(taken, notTaken);
			}
		}
		
		
		if(dp[n-1][x]==(int)1e9)System.out.println(-1);
		else
			System.out.println(dp[n-1][x]);
		
		
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
