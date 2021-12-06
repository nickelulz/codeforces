#include <stdio.h>

int main() {
    // insert values
    int n, h;
    scanf("%d %d\n",&n,&h);

    // populate array
    int friends[n];
    for (int i = 0; i < n; i++)
        scanf("%d",&friends[i]);

    // calculate total
    int totalWidth = 0;
    for (int i = 0; i < n; i++) {
        totalWidth += (friends[i] > h) ? 2 : 1;
    }
    
    // print
    printf("%d",totalWidth);

    return 0;
}