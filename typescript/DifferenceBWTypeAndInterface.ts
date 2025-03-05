//Difference bw Interface and Type in TS
interface Person{
    name: string
    age: string
}

type PersonType = {
    name: string
    age: number
}

//using type for union
type StringOrNumber = string | number
//using type for intersection
type Name = {name:string}
type Age = {age:number}
type PersonIntersection = Name & Age
