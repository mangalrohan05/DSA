#include <iostream>
#include <map>

using namespace std;

int main()
{
    int arr[] = {1, 2, 3, 1, 3, 20, 12};
    map<int, int> mp;

    for (int i = 0; i < sizeof(arr)/sizeof(arr[0]); i++)
    {
        mp[arr[i]]++;
    }

    for(auto it : mp){
        cout<< it.first << ": "<< it.second<< endl;
    }

}