#include <iostream>
using namespace std;
int main() {
  int a, b, c, d, e, f, g;
  cin>>a;
  b = a * a;
  b++;
  c = 0;
  d = 1;
  g = a;
  for(int i = a; i > 0; i--) {
    f = 2 * c;
    while(f--)
      cout<<"-";
    for(int j = 0; j < i; j++) {
      cout<<d<<"*";
      d++;
    }
    e = b;
    for(int j = 0; j < i; j++) {
      cout<<b;
      b++;
      if(j != i - 1)
        cout<<"*";
    }
    b = e;
    b -= g - 1;
    c++;
    g--;
    cout<<endl;
  }
  return 0;
}