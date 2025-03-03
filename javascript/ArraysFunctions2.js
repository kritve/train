const arr = [1,2,4]

console.log(arr.includes(3))

const product = [
    {profuctId: 12, name: "m", price: 100, sku: '12'},
    {profuctId: 13, name: "q", price: 10, sku: '123'},
    {profuctId: 14, name: "r", price: 110, sku: '124'},
    {profuctId: 15, name: "s", price: 101, sku: '125'},
]

const filteredProduct = product.filter((item) => {
    return item.price > 100
})

console.log("FIlter ", filteredProduct)


const filteredProduct2 = product.map((item) => {
    return item.name
})

console.log("FIlter 2 ", filteredProduct2)

const filteredProduct3 = product.find((item) => {
    return item.price === 10
})

console.log("FIlter 3", filteredProduct3)

const totalCartValue = product.reduce((t, item) => {
    return t + item.price
},0)

console.log(totalCartValue)


