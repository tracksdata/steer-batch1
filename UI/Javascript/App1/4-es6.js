/*
    ES6 Features
    ===================

    Default Parameters in ES6
    Template Literals in ES6
    Multi-line Strings in ES6
    Destructuring Assignment in ES6
    Spread Operator
    Enhanced Object Literals in ES6
    Arrow Functions in ES6
    Promises in ES6
    Block-Scoped Constructs Let and Const
    Classes in ES6
    Modules in ES6
    enhanced looping statements
        - forEach
        - filter
        - map
        - reducer
*/

//1.Default Parameters in ES6

function test(a = 10, b = 20) {
    console.log(a + " and " + b);
}

//test(100,200);

/*

// issues with var keyword
// 1 multiple declarations allowed for the same variable
var a=10;
var a=20;
var a=30
// 2 . no blocked scope
var x=10;

if(x===10){
    var x=20;
    console.log(x);
}

console.log(x);

// solutions for var issues is 'let' keyword
let i=10;
//let i=20;

console.log("=======================");

let k=10;
if(k===10){
    let k=20;
    console.log(k);
}

console.log(k);

*/

// Destructuring Assignment in ES6

let nums = [87, 43, 65, 32, 84, 12, 21]
//let a=nums[0];
//let b=nums[1];
let [a, b, c, d, e] = nums;

let data = [{ id: 10 }, { id: 20 }, { id: 300 }];
let [o1, o2, o3] = data;

let emp = { id: 10, name: 'Praveen', salary: 384378 }
let { id, name, salary } = emp;

// spread operator
let n1 = [10, 20, 30];
let n2 = [100, ...n1, 200];


let btn = document.getElementById('b1');
let textData = document.getElementById('t1');
let personData=document.getElementById('personData');

//let persons = [];

btn.addEventListener('click', function () {
   // persons.push(textData.value);
   // console.log(persons.length);
    let liElement;
    //persons.forEach(person => {
        liElement=document.createElement('li')
        var data= document.createTextNode(textData.value);
        liElement.appendChild(data);
        personData.appendChild(liElement);
        //document.getElementById('personData').innerHTML = `<li${person}</li>`
   // })
})


// es 6 functions

function f1(){ // es5
   // ...
}

let f2=()=>{
    console.log('.. f2');
}

let f3=(a,b)=>{
    console.log(a+" and "+b);
}

let sum=(a,b)=>a+b;


let display=()=>{
    console.log('1..');
    console.log('2..');
}

let names=()=>{
    return{
        n1:"Praveen",n2:"James",n3:"Kavya"
    }
}







