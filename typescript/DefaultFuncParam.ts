
function greet(name:string, greeting:string = "Hello"): string{
    return `${greeting}, ${name}`
}

console.log(greet("a","Welcome"))
console.log(greet("a"))

//tuple in ts is a special of ts where 
let tuple : [string, number]
tuple = ['abc',30]

console.log(tuple[0])
console.log(tuple[1])

