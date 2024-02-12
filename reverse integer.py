n="-123"
fi=n[0]
if(fi=="-"):
    fi=n[0]
m=int(n[1:])
re=0
print(m)
while(m>0):
    r=m%10
    re=re*10+r
    m=m//10
print(re)
print(fi+str(re))
    
