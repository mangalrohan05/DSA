#include<iostream>
#include<math.h>

using namespace std;

void R1(int n){
    if(n<=0){
        return;
    }

    cout<<"Hi"<<endl;
    R1(n-1);
}

void R2(int n, string name){
    if(n<=0){
        return;
    }

    cout<<name<<" ";
    R2(n-1, name);
}

void R3(int n){
    if(n<=0) return;

    R3(n-1);
    cout<<n<<", ";
}

void R4(int n){
    if(n<=0) return;

    cout<<n<<", ";
    R4(n-1);
}

void R5M1(int n, int sum=0){
    if(n<0) {cout<<sum; return;}

    R5M1(n-1, sum+n);
}

int R5M2(int n){
    if(n<=0){
        return 0;
    }

    return n + R5M2(n-1);
}

void R6M1(int n, int fact=1){
    if(n<1){
        cout<<fact;
        return;
    }

    R6M1(n-1, fact*n);
}

int R6M2(int n){
    if(n<=0){
        return 1;
    }

    return n * R6M2(n-1);
}

void R7(int arr[],int n, int i = 0){
    if(i==n){
        return;
    }

    R7(arr, n, i+1);
    cout<<arr[i]<<" ";
}

void R8M1(string str, int i=0,string rev=""){
    int len = str.length();
    if(i == len) {
        cout<<endl<<rev<<endl;
        if(rev==str){
            cout<<"TRUE";
            return;
        } else {
            cout<<"FALSE";
            return;
        }
    }
    char curr = str.at(len-i-1);
    cout<<curr<<" ";
    R8M1(str, i+1, rev+curr);
}

void R8M2(string str, int i = 0){

    int len = str.size();
    if(i >= len/2){
        cout<<"True";
        return;
    }

    if(str.at(i) != str[(len-i-1)]){
        cout<<"False";
        return;
    }

    R8M2(str, i+1);

}

void R9(int n, int a = 0, int b = 1){
    if(n<=0) {
        return;
    }

    cout<<a<<" ";
    R9(n-1, b, a+b);
}

int main(){
    // R1(10);
    
    // R2(3, "rohan");
    
    // R3(5);
    
    // R4(5);
    
    // R5M1(5);
    // cout<<endl<<R5M2(6);
    
    // R6M1(5);
    // cout<<R6M2(5);

    // int arr[] = {1, 2, 3, 4, 5};
    // R7(arr, sizeof(arr)/sizeof(arr[0]));

    // R8M1("ABCCBA");   
    // R8M2("ABCCfweBA");

    // R9(10);
}