#include <stdio.h>

int main() {
    int n;
    scanf("%d",&n);

    int total = 0;

    for (int i = 0; i < n; i++) {
        int val = 0;
        scanf("%d",&val);
        total += val;
    }

    printf( (total > 0) ? "HARD" : "EASY" );

    return 0;
}