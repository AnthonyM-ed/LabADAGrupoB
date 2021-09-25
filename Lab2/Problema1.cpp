#include <iostream>

using namespace std;

int main(){
	int n, k, cont=0;

	cin>>n;
	cin>>k;

	for(int i=0; i<n; i++){
		int num;
		cin>>num;
		cont+=(num%k==0)?1:0;
	}
	cout<<cont;
	return 0;
}