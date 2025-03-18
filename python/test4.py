from random import sample


def xyz():
    x=sample(3)

def main():
    x1=dict(a=1,b=2,c=3,d=4)
    x=dict(a=1,b=2,c=3)
    displays(x,x1)


def displays(**kargs):
    for x,y in kargs:
        print(y, end=" ")

if __name__ == '__main__' : main()




