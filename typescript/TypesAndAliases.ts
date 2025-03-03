//type aliases allow you to create a new name for existing type and combine multiple types

type ID = string | number

function printID(id:ID): void {
    if (typeof id == "string"){
        console.log("string")
    } else {
        console.log("number")
    }
}

printID('abc')
printID(12)
