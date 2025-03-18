
from math import pi


def main():
    seq=range(11)
    seq1=[x*2 for x in seq]
    seq2=[x for x in seq if x%3!=0]
    seq3=[(x,x**2) for x in seq]
    seq4=[round(pi,i) for i in seq]

    printl(seq4)
    s={x for x in 'spuerduper' if x not in 'pd'}
    print(s)

def printl(o):
    for x in o:
        print(x)

if __name__=="__main__": main()