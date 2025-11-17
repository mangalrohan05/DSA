#include<iostream>
#include<math.h>
#include<vector>

using namespace std;

void Q1(int n){
    long res = 0;

    while(n!=0){
        res++;
        n/=10;
    }

    cout<<res<<endl;
}

void Q2(int n){
    int rev = 0;


    while(n!=0){
        rev = (rev+ n%10)*10;
        n/=10;
    }

    rev/=10;
    cout<<rev;

}

void Q3(int n){
    int rev = 0, og = n;

    while(og!=0){
        rev = rev*10 + og%10;
        og/=10;
    }

    og/=10;

    if(rev == n) cout<<"ORIG";
    else cout <<"WR";
}

void Q4(int a, int b){

    while (a!=b) {
        if(a>b) a-=b;
        else b-=a;
    }

    cout << a;
}

void Q5(int x){
    int n = x;
    int count = 0;
    int arm = 0;

    while(n!=0){
        count++;
        n/=10;
    }
    
    n = x;

    while(n!=0){
        arm += pow(n%10, count);
        cout<< pow(n%10, count)<< " "<< arm <<endl;
        n/=10;
    }

    cout<<arm<<" "<<count<<" ";
    arm == x ? cout<<"true" : cout<<"false";
}

void Q6(int n){
    vector<int> res;
    for(int i = 1; i <= n/2; i++){
        if(n%i == 0){
            res.push_back(i);
        }
    }

    for(int i = 0; i < res.size(); i++){
        cout<<res.at(i)<<", ";
    }
    cout<<n;

    // cout<<res
}

void Q7(int n){

    for(int i = 2; i <= n/2; i++){
        if(n%i==0){
            cout<<"False";
            return;
        }
    }

    cout<<"true";
}

int main(){
    // int x = 6221;
    // int palin = 123431;
    // int n1 = 4, n2=6;
    // int n = 153;

    // Q1(x);
    // Q2(x);
    // Q3(palin);
    // Q4(n1, n2);
    // Q5(n);
    // Q6(36);
    Q7(15);
}