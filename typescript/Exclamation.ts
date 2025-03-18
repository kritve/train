// ! is a not null operator abd is used to assert that a value is not null or undefined

function processString(text:string | null | undefined){
    const notNullTest : string = text!
    console.log(notNullTest.toUpperCase())
}

processString("hello")
//processString(null) //this will return error

