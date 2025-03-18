var x = a=> a+1

console.log(x(3))

function x1(a){
    return a+1
}

console.log(x1(4))

var x2 = function(a){
    return a+1
}

console.log(x2(5))

//[1,2,3].forEach(a => console.log(a +"-"+a*a))
//

console.log([11,12,22,1,6].sort((a,b)=>a-b))

var x2 = (a=2,b=3) => a*b; //default parameter
console.log(x2(6))

var x3 = function(a,b, ...args){// Spread operatoer or rest function parameter
    console.log(a+" "+b+" "+args.length)    
}
x3(2,3,4,5,"34",3)

var name = "abc"
var msg = `hello ${name}`
console.log(msg)

class Circle{
    constructor(r){
        this.r=r
    }
    computeArea(){return Math.PI*this.r*this.r}
    get Area(){return Math.PI*this.r*this.r}
}

var obj=new Circle(4)
console.log(obj.computeArea())
console.log(obj.Area)
