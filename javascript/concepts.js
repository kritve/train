const v=3;

console.log(v);

{
    let msg="Block scoped var 1";
    {
        let msg="Block scoped var 2";
        console.log(msg);
    }
    console.log(msg);
}

function sayHi(){
    var msg = "defined variable";
    console.log(msg);
}

sayHi();

