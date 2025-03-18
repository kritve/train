def main():
    a={'x':1, 'y':2, 'z':3}
    print(type(a))
    print_dict(a)

    for k in a.keys():
        print(k)

    print(a['x'])
    t=(1,2,3,4)
    for x in t:
        print(x)



def print_dict(o):
    for i in o:
        print(f'{i}:{o[i]}')






if __name__=="__main__":main()
