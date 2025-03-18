class MyIterator:
    def __init__(self, start,stop):
        self.start=start
        self.stop=stop
        self.current=start


    def __iter__(self):
        return self
    
    def __next__(self):
        if self.current > self.stop:
            raise StopIteration
        else:
            self.current+=1
            return self.current -1
        
for i in MyIterator(1,5):
    print(i)






