
arr = list(map(int, input().split()))
print(arr)

ln = len(arr)

for i in range(0, ln-1):
    max = arr[i+1]
    for j in range(i+1, ln):
        if(arr[j] > max):
            max = arr[j]
    print(max, end=',')

print("-1")
