//Using ?
function greet(name, greeting) {
    return "".concat(greeting || 'Hello', ", ").concat(name);
}
console.log(greet("a", "Welcome"));
console.log(greet("a"));
