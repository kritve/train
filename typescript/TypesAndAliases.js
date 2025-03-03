//type aliases allow you to create a new name for existing type and combine multiple types
function printID(id) {
    if (typeof id == "string") {
        console.log("string");
    }
    else {
        console.log("number");
    }
}
printID('abc');
printID(12);
