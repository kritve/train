let map = new Map();
map.set(1, 'Number')
map.set("2", 'String')
map.set(true, 'Boolean')

console.log(map)
console.log(map.get(1))
console.log(map.get('2'))

console.log(map.size)

let visitorcount = {name:'PQR'}
let visitorcountmap = new Map();
visitorcountmap.set(visitorcount, 123)

console.log(visitorcountmap.get(visitorcount))

let recipeMap = new Map([
    ['cucumber',500],['tomatoes',350]
])


