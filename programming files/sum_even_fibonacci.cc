#include <iostream>

int main()
{
    //set a and b to the first 2 numbers of the Fibonacci sequence, 0 and 1
    int a = 0, b = 1;
    int sum_even = 0;
    while (b < 4000000) {
        //if b is even, add it to the total sum of all the even numbers
        if (b % 2 == 0) {
            sum_even += b;
        }
        //Continue to executue the Fibonacci sequence
        int temp = b;
        b = a + b;
        a = temp;
    }
    std::cout << sum_even << std::endl;

    return 0;
}

// answer should be 4613732
