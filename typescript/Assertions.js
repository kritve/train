//type assertions allow you to override ts's inferred type
var someValue = "Hello";
var stringLength = someValue.length;
console.log(stringLength);
//difference b/w any and unknown
var anyValue = "hello"; //any disables all type checking, allows assignment to any type
var unknownValue = "hi"; //unknown is type safe counterpoint to any
anyValue = 123; //no error
if (typeof unknownValue === 'string') {
    var str = unknownValue;
    console.log(str);
}
