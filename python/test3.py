sw=input("Enter password")

auth=False
c=0
pw=''

while pw!=sw:
    pw=input("Enter password   ")
    c+=1
    if c>2: break
    if c==1: print(f"hint: {sw}")
else:
    auth=True

print("Authorized" if auth else "Unauthorized")