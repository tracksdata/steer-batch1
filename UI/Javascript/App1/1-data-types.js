
/*

==========================
      Data Types
==========================

  Types
     1. Primitive 
     2. Reference

     1. Primitive 
     -------------
        -> number
        -> string
        -> boolean
        -> undefined

      2. Reference
        -> Object
        -> Arrays
        
*/

//1. Primitive 
// 1. number
//var a=100;
//var b=18.45;
//b=-10;

// 2.string
var s1 = 'Abc';
var trainer = 'Praveen'
var subject = ' Java Script'
var s2 = trainer + subject
var s3 = `Trainer ${trainer} is teaching ${subject}`

// 3 boolean -> true /false
var s4 = false;
s4 = true;
var flag = true;

if (flag) {
    // console.log(">>>> true");
} else {
    // console.log(">>> false");
}

// 4. undefined
//----------------
var s5;

// reference types

//1 Object

var emp = new Object();
emp.id = 10
emp.name = 'Praveen'
emp.salary = 394734

var d1 = {} // Object

// types of Objects
//1 . Object style
var p1 = new Object();
p1.name = 'James';
// 2. literal style / JSON - java Script Object Notation
var p2 = {
    id: 10,
    name: 'Praveen',
    city: 'London'
}

p2.designation = 'Engineer';

// Array of JSON
let persons = [
    { id: 10, name: 'Praveen', age: 87 },
    { id: 11, name: 'Kavya', age: 32 },
    { id: 12, name: 'Ravi', age: 56 },
    { id: 13, name: 'Komal', age: 22 },
    { id: 14, name: 'Keerthi', age: 34 },
]

var nums = new Array();
var nums1 = [];

// JSON Customization
var person = {
    id: 'P001',
    name: 'Praveen',
    hobbies: ['Cricket', 'Chess', 'Football'],
    address: [
        {
            type: 'Temp',
            hno: '10-34/A2',
            steet: 'First Steet',
            city: 'Hyderbad',
            pincode: 349734
        },
        {
            type: 'Permanent',
            hno: '16-A',
            steet: 'Second Steet',
            city: 'Pune',
            pincode: 84386583
        }
    ]

}


// JSON with Function
var emp={
    fun1:function f1() {
     console.log(">>> f1 function of emp");   
    }
}


