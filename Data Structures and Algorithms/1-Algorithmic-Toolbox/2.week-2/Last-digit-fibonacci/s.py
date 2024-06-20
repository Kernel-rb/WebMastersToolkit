n = int(input())

def lastDigitFib(n) -> int  : 
    if n <= 1 :
        return n  
    a = 0 
    b = 1 
    for _ in range(2 , n+1) :
        c = a + b
        a = b 
        b = c
    return c % 10

print(lastDigitFib(n))

