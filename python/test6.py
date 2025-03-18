
def f4(f):
    def f5():
        print("Before f")
        f()
        print("After f")
    return f5

@f4
def f3():
    print('f3')


f3()







