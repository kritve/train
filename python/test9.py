class Myclass:
    class_v=0

    def __init__(self, instance_v):
        self.instance_v=instance_v

    @staticmethod
    def static_method(x,y):
        return x+y
    
    @classmethod
    def class_method(cls,x):
        cls.class_v+=x
        return cls.class_v
    
result_static=Myclass.static_method(5,3)
print(result_static)



result_class=Myclass.class_method(8)
print(result_class)

instance=Myclass(20)
result_class_instance=instance.class_method(7)
print(result_class_instance)

