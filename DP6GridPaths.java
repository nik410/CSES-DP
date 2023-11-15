

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DP6GridPaths {

	public static void main(String[] args) {
		FastReader sc=new FastReader();
		int n=sc.nextInt();
		
		char grid[][]=new char[n][n];
		
		for(int i=0;i<n;i++) {
			String s=sc.next();
			grid[i]=s.toCharArray();
		}
		
		int dp[][]=new int[n][n];
		
		 for(int i=0;i<n;i++) {
			if(grid[i][0]=='*') {dp[i][0]=0;
				break;
			}
			else dp[i][0]=1;
	
		}
		 for(int i=0;i<n;i++) {
				if(grid[0][i]=='*') {dp[0][i]=0;
					break;
				}
				else dp[0][i]=1;
		
			}
		
		for(int i=1;i<n;i++) {
			for(int j=1;j<n;j++) {
				if(grid[i][j]=='*')dp[i][j]=0;
				else {
					int right=dp[i][j-1];
					int down=dp[i-1][j];
					
					dp[i][j]=(right+down)%((int)(1e9+7));
				}
			}}
		
		
		System.out.println(dp[n-1][n-1]);
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
