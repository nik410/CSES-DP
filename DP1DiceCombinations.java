
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DP1DiceCombinations {

	public static void main(String[] args) {
		FastReader sc=new FastReader();
		int n=sc.nextInt();
		
		long dp[]=new long[n];
		
		for(int i=0;i<6;i++) {
			if(i<n)
			dp[i]=1;
		}
		
		for(int i=1;i<n;i++) {
			for(int j=1;j<=6;j++ ) {
				if(i-j>=0) {
			dp[i]=((dp[i]+dp[i-j])%(long)(1e9+7));
			}
			}
		}
		
		System.out.println(dp[n-1]);
		

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
