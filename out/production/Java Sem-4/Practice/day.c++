#include<iostream>
using namespace std;

int findMonth(int m){
    m=m-2;
    if(m==1)return 11;
    else if(m==2) return 12;
    else return m;
}

int findDay(int day,int month,int year){
    int m=findMonth(month);
    int D=year%100;
    int C=year/100;
    if(m==11  || m==12){
        D=D-1;
    }
    return day + ((13*m-1)/5) + D + (D/4) + (C/4) - (2*C);
}

int main(){
    int f=findDay(1,1,1802);
    int i=0;
    if(f<0){
        f=-f;
        while(f%7!=0){
            i++;
            f=f+i;
        }
        cout<<"Day is "<<i;
    }else{
        f=f%7;
        cout<<"Day is "<<f;
    }
}