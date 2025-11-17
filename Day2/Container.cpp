#include<iostream>
#include<utility>
#include<vector>

using namespace std;

void Pairs(){
    pair<int, int> x = {1, 3};

    cout<< x.first << " " << x.second;


    pair<int, int> arr[] = {{1, 2}, {4, 2}};

    cout << endl << arr[1].first;
}

void Vectors(){
    vector<int> v;

    v.push_back(3);
    v.emplace_back(7);
    cout<< v[1]<<endl;

//
    vector<pair<int, int>> vp;

    vp.push_back({1, 2});
    cout << vp[0].first <<endl;

//

    vector<int> vl(5, 7);
    cout << vl.at(4);

    vector<int> vlx(vl); //copy of vl

    
//
}

int main(){
    // Pairs();

    Vectors();

    return 0;
}