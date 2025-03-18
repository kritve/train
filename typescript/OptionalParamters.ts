//Using ?

function greet(name:string, greeting?:string): string{
    return `${greeting || 'Hello'}, ${name}`
}

console.log(greet("a","Welcome"))
console.log(greet("a"))