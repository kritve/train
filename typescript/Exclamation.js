// ! is a not null operator abd is used to assert that a value is not or undefined
function processString(text) {
    var notNullTest = text;
    console.log(notNullTest.toUpperCase());
}
processString("hello");
//processString(null) //this will return error
