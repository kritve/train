
with open('newfile.txt', 'w') as file:
    file.write("hello")

class MyContextManager:

    def __enter__(self):
        print("Entering Context")
        return self
    
    def __exit__(self, exc_type, exc_val, exc_tb):
        print("Exiting the context")
        if exc_type:
            print(f'An exception occured {exc_val}')
            return True
        
with MyContextManager() as cm:
    print("inside context")
    
print("outside context")

