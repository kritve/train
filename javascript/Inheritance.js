class Ellipse{
    constructor(w, h){
        this._w=w;
        this._h=h;
    }
    get area() {return Math.PI*this._w*this._h};
    set w(width) {this._w=width}
    set h(height) {this._h=height}
}

class Circle extends Ellipse{
    constructor(r){
        super(r,r)
    }
    set r(r){super.w=r;super.h=r;}
}

let obj = new Circle(4)
console.log("area= " + obj.area)
obj.r=2
console.log("area= " + obj.area)