import time

def elapsed_time(f):
    def wrapper():
        t1=time.time()
        f()
        t2=time.time()
        print(f"Elapsed time {t2-t1}")
    return wrapper

@elapsed_time
def big_sum

