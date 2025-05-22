
def chk_avail(ascii):
	if(ascii >= 97):
		return ascii - 32
	if(ascii <= 90):
		return ascii + 32
	else:
		return ascii


st = input("Enter a String: ")

ls = []

for i in st:
	ascii = ord(i)

	# basic alpha check
	while(ascii in ls or chk_avail(ascii) in ls):
		if(ascii == 57):
			ascii = 48;
		elif(ascii == 90):
			ascii = 65
		elif(ascii == 122):
			ascii = 97;
		else:
			ascii += 1;

	# appending ascii
	ls.append(ascii)
	print(chr(ascii),end="")
