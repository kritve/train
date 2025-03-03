//define
type User = {
    name: string,
    age: number,
    email: string,
}

//Using
const user : User = {
    name: "abc",
    age: 12,
    email: "@"
}

console.log(user)

interface Product {
    id: number,
    name: string,
    price: number,
}

const prod:Product = {
    id:12,
    name:"pqw",
    price:1234
}

console.log(prod);