def main():
    for i in inc_range(12,350,9):
        print(i, end=' ')
    print()
#generators concept
def inc_range(*args):
    numargs=len(args)
    start=0
    stop=1
    step=1
    if numargs<1:
        raise TypeError(f'Excpected at least 1 argument, got {numargs}')
    elif numargs==1:
        stop=args[0]
    elif numargs==2:
        (start, stop)=args
    elif numargs==3:
        (start, stop, step)=args
    else:
        raise TypeError(f'expected at most 3 arguments got {numargs}')
    
    #generator
    i=start
    while i<stop:
        yield i
        i+=step

    

if __name__ == '__main__' : main()
