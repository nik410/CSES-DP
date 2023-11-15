
// Online C++ Compiler - Build, Compile and Run your C++ programs online in your favorite browser

#include <iostream>
#include <vector>

using namespace std;

int main() {
    int n, x;
    cin >> n >> x;
    vector<int> arr(n);

    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    vector<vector<int>> dp(n, vector<int>(x + 1, 0));

    for (int i = 0; i < x + 1; i++) {
        if (i % arr[0] == 0) dp[0][i] = 1;
    }

    for (int i = 1; i < n; i++) {
        for (int j = 0; j < x + 1; j++) {
            long long notTaken = dp[i - 1][j];
            long long taken = 0;
            if (arr[i] <= j) taken = dp[i][j - arr[i]];
            dp[i][j] = (taken + notTaken) % static_cast<int>(1e9 + 7);
        }
    }

    cout << dp[n - 1][x] << endl;
    return 0;
}