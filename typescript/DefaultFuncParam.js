function greet(name, greeting) {
    if (greeting === void 0) { greeting = "Hello"; }
    return "".concat(greeting, ", ").concat(name);
}
console.log(greet("a", "Welcome"));
console.log(greet("a"));
//tuple in ts is a special of ts where 
var tuple;
tuple = ['abc', 30];
console.log(tuple[0]);
console.log(tuple[1]);
