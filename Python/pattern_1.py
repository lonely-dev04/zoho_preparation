def printPerm(n):
    if(n==1):
        print(n, end="")
        return
    
    rot = 0
    temp = n
    while(True):
        print(n, end="")
        if(n==temp and rot==1):
            break;
        if(n == 1):
            rot = 1
        if(rot):
            n += 1
        else:
            n -= 1



n = int(input("Enter a number: "))
#printPerm(n)

for i in range(1,n+1):
    for j in range(n,0,-1):
        if(i == j):
            printPerm(i)
        else:
            print("",end=" ")
    print("",end="\n")


for i in range(n-1,0,-1):
    for j in range(n,0,-1):
        if(i == j):
            printPerm(i)
        else:
            print("",end=" ")
    print("",end="\n")


