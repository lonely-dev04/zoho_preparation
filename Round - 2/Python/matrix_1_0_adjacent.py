'''2. Given a Boolean matrix mat[M][N] of size M X N,
modify it such that if a matrix cell mat[i][j] is 1 then make its adjacent cells as 0.
Input:
1 0 1
0 1 0
1 1 1
Output:
0 0 0
0 0 0
1 0 1
Explanation:
For the cell mat[0][0] which is 1, its adjacent cells (mat[0][1] and mat[1][0]) are modified to 0.
For the cell mat[1][1] which is 1, its adjacent cells (mat[0][1], mat[1][0], mat[1][2], and mat[2][1]) are modified to 0.
The modification is not applied to the cell mat[2][2] as it doesn't have all four adjacent cells.'''

m = int(input("M: "))
n = int(input("N: "))

arr = []

# Getting input
for i in range(0, m):
    for j in range(0, n):
        arr[i][j] = int(input())

# Printing the output
for i in range(0, m):
    for j in range(0, n):
        print(arr[i][j])
    print("\n")


 
