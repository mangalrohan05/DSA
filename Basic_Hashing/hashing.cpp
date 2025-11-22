#include<iostream>

using namespace std;

int main(){
    int n = 5;

    int arr[n] = {1, 3, 2, 1, 3};
    
    // pre compute using hash:
    int hash[13] = {0};
    for(int i = 0; i<n; i++){
        hash[arr[i]] += 1;
    }

    cout<<hash[1];

    return 0;
}