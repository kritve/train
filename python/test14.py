def main():
    try:
        x=5/3
    except ValueError:
        print("ValueError")
    except ZeroDivisionError:
        print("ZeroDivisionError")
    else:
        print(f"No error {x}")

if __name__=="__main__":main()