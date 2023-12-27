#include <stdio.h>

const char* digitToLetters[] = {
    "",     // 0
    "",     // 1
    "abc",  // 2
    "def",  // 3
    "ghi",  // 4
    "jkl",  // 5
    "mno",  // 6
    "pqrs", // 7
    "tuv",  // 8
    "wxyz"  // 9
};

void backtrack(char* digits, int index, char* current) {
    int i;
	if (digits[index] == '\0') {
        printf(" %s ", current);
        return;
    }
    int digit = digits[index] - '0';
    const char* letters = digitToLetters[digit];

    for (i = 0; i <  strlen(letters); ++i) {
        current[index] = letters[i];
        current[index + 1] = '\0';

        backtrack(digits, index + 1, current);
    }
}

int main() {
    char digits[10];
    
	printf("\nEnter the Number for Combination : ");
	scanf("%s",digits);

	printf("\nThe Combinations\n\n");
    char current[10];  
    current[0] = '\0';

    backtrack(digits, 0, current);

    return 0;
}

