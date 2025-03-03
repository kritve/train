let arr = new Array()
let arr2=[]

let fruits = ["a", "b", "c"]

for(let a in fruits){
    console.log(a)
}

for(let a of fruits){
    console.log(a)
}

let arr3 = ['Apple', {name: "ghi"}, true, ()=>(console.log(fruits))]

arr3[3]()

fruits.push("Watermelon")
console.log(fruits)
console.log(fruits.pop())
fruits.unshift("Guava");
console.log(fruits)
console.log(fruits.shift())
console.log(fruits)

let arr4 = fruits
arr4.push("Avocado")
console.log(fruits)

fruits.length=2
console.log(fruits)

let numbers=[2,4,6,8,10]
let odd =3 

numbers.forEach((number)=>{
    if(number==odd){
        numbers.shift();
    }
})

console.log(numbers)

