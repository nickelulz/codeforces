    #include <stdio.h>
     
    int main() {
        int n;
        scanf("%d",&n);
     
        for (int i = 0; i < n; i++) {
            // init word
            char word[100];
            scanf("%s",&word);
            
            // get length of string
            int wordLength = 0;
            while (word[wordLength] != 0) ++wordLength;
     
            // parse and print
            if (wordLength <= 10)
                puts(word);
            else
                printf("%c%d%c\n",word[0],wordLength-2,word[wordLength-1]);
        }
     
        return 0;
    }
