#include <stdio.h>

int main() {
    int n;
    scanf("%d",&n);

    int f[n];

    for (int i = 0; i < n; i++) {
        int from = 0;
        scanf("%d",&from);
        f[from-1] = i+1;
    }

    for (int i = 0; i < n; i++)
        printf("%d ",f[i]);
    
    return 0;
}