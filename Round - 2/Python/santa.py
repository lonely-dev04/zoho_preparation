def find_orientation(fname, sname, names):
    fIndex = names.index(fname)
    sIndex = names.index(sname)
    diff = fIndex - sIndex
    ln = len(names) - 1
    if(diff == ln or diff == -1):
        print("Clock-Wise")
        return 1
    if(diff == (0 - ln) or diff == 1):
        print("Anti-ClockWise")
        return 0

# Input Area
# names = ['jack', 'hema', 'sundar', 'vijay', 'sarathi']

names = input('Enter the names by giving space').split()

fName = input("Enter the first name: ")
sName = input("Enter the Second name: ")
gifts = int(input('Enter the number of gifts: '))
orient = find_orientation(fName, sName, names) #orientation

# Reverse the List if orient is 0 (Anti-Clockwise)
if(orient == 0):
    names = names[::-1]

# Frequency map
freq_map = {}
for i in names:
    freq_map[i] = 0

# Loop logic
ind = names.index(fName)
runs = 0
last_guy = ""
while(runs <= gifts):
    ind  %= len(names)
    if(runs == gifts):
        last_guy = names[ind]
        break
    freq_map[names[ind]] += 1
    ind += 1
    runs += 1

# Highest of Recieving
max_num = max(freq_map.values())

for nm, fr in freq_map.items():
    if(fr == max_num):
        print(nm,':',fr)

# The Unlucky Guy
print('The unlucky Guy: ',last_guy)
