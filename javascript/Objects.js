

let user = new Object();
let user2 = {};

user = {
    name: "abc",
    age: 25
}

console.log(user.name, user.age)

user.isAdmin = true
console.log(user)

user["likes js and ts"] = true;
console.log(user)
delete user.name;

let key = prompt("What is the name of the user","abc")
console.log(key)

let fruit = prompt("Which fruit do you want to buy","apple")
console.log(fruit)

let bag = {
    [fruit + 'Computers']:5
}

console.log(bag.apple)

console.log(bag)

let obj2 = {
    for: 1,
    let: 2,
    return: 3
}

console.log(obj2.for, obj2.let, obj2.return)

let _=1
let $=2
console.log(_ + $)


function makeUser(name, age){
    return {
        name: name,
        age: age
    }
}
let user3 = makeUser("xyz", 26)
console.log(user3)
console.log("age" in user3)
console.log("name" in user3)

for(let key in user3){
    console.log(key)
    console.log(user3[key])
}

let codes = {
    "91": "IN",
    "1":"US"
}
for(let code in codes){
    console.log(code)
}

let a={"4":1};
let b ={"4":1}
console.log(a==b)
console.log(a===b)

let a1=5;
const b1 = "6";
console.log(a1==b1)
console.log(a1===b1)


let user4 = {
    name: "pqr",
    age: 30
}




