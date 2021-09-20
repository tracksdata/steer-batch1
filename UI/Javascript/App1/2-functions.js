/*
    1. Named Functions
    2. Anonymous Functions



*/

//1. Named Functions
function f1() {
    console.log('... f1 function');
}


//    2. Anonymous Functions
var sum = function () {
    console.log("... sum function");
}


//f2();
function f2() {
    console.log(">>>>>>> f2");
}

var sayName = function () {
    console.log(">>>>>> sayName function");
}

//sayName();

// function parameters

function display(a, b) {
    console.log(">>>>> display");
    console.log(a, b);
}

//display();
//display(10);
//display(20,30);
//display(1,34,5,5)

// can we overload functions in js? : no

function getFood() { // getFood is context name
    console.log('... No payment, then no Food');
}

function getFood(pay) {
    console.log("... Biryani and snaks");

}

function getFood(pay) {
    
    if (arguments.length === 0) {
        console.log('... No payment, then no Food');
    } else {
        console.log("... Biryani and snaks");

    }

}

getFood();





