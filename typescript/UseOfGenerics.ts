//Generics enable you to work with reusable components that work with different types
function identity<T>(arg:T) : T {
    return arg
}

let numberIdentity = identity<number>(42)
let stringIdentity = identity<string>("Hello")

console.log(numberIdentity)
console.log(stringIdentity)

interface GenericArray<T>{
    items: T[]
}

const numberArray : GenericArray<number> = {items : [1,2,3,4]}
const stringArray : GenericArray<string> = {items : ['1', 'a']}

console.log(numberArray)
console.log(stringArray)
