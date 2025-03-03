//Generics enable you to work with reusable components that work with different types
function identity(arg) {
    return arg;
}
var numberIdentity = identity(42);
var stringIdentity = identity("Hello");
console.log(numberIdentity);
console.log(stringIdentity);
var numberArray = { items: [1, 2, 3, 4] };
var stringArray = { items: ['1', 'a'] };
console.log(numberArray);
console.log(stringArray);
