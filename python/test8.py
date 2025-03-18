class FoodItems:
    all_food_items=[]

    def __init__(self, name, quant):
        self.name=name
        self.quant=quant 
        self.__class__.all_food_items.append(name)

    @classmethod
    def get_all_food_item_names(cls):
        return cls.all_food_items
    
    @staticmethod
    def add(x,y):
        return x+y

a=FoodItems('a',1)
b=FoodItems('b',1)
c=FoodItems('c',1)



print(FoodItems.get_all_food_item_names())

print(FoodItems.add(3,4))
