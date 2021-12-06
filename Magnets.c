#include <stdio.h>

int main() {
    int n;
    scanf("%d",&n);

    // previous val
    int prev;
    scanf("%d",&prev);
    // printf("prev==>%d\n",prev);

    // group counter
    int gct = 1;

    // line iteration
    for (int i = 1; i < n; i++) {
        // current val
        int cur;
        scanf("%d",&cur);

        // printf("prev==>%d\n",prev);
        // printf("cur==>%d\n",cur);

        // increment
        if (prev!=cur)
            gct++;

        prev=cur;
    }

    printf("%d",gct);
    return 0;
}