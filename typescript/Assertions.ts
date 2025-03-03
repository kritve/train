//type assertions allow you to override ts's inferred type

let someValue : any = "Hello"
let stringLength : number = (someValue as string).length


console.log(stringLength)

//difference b/w any and unknown
let anyValue : any = "hello"        //any disables all type checking, allows assignment to any type
let unknownValue : unknown = "hi"   //unknown is type safe counterpoint to any

anyValue =123 //no error
if(typeof unknownValue === 'string'){
    var str : string = unknownValue
    console.log(str)
}



