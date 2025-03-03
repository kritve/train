const a = [{x:1},{x:2},{x:3}]
const res = a.reduce((acc,obj)=>{
    return acc+obj.x
}, 0)
console.log(res)

const res2 = a.reduce((acc,{x})=>{
    return acc+x
},0)
console.log(res2)

