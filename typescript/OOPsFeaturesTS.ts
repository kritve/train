class Animal{
    name: string;

    constructor(name:string){
        this.name=name
    }

    makesound(): void{
        console.log(`${this.name} makes sound`)
    }

}

class Tiger extends Animal {
    constructor(name:string){
        super(name)
    }
    makesound(): void {
        console.log(`${this.name} roars`)
    }

}

const tiger = new Tiger("bud")
tiger.makesound()

const r = new Animal("r")
r.makesound()
console.log(r.name)
