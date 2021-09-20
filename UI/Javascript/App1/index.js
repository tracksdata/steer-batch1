
console.log("Hello Praveen");
console.log('Hello James');

function display(){
    var a=100;
    var b=200;
    var c=300;

    console.log("A is "+a+" And B is "+b+" And C is "+c+" and Sum of "+a+" and "+b+" and "+c+" is "+(a+b+c));
    //  $ sign with  back tick operator
    console.log("=====================");
    console.log(`A is ${a} And B is ${b} And C is ${c} and Sum of ${a} and ${b} and ${c} is ${a+b+c}`);
}

function f1(name,designation){
    return (
        `
        <div>
            <div>
              <p>Name: ${name} </p>
            </div>
            <div>
             <p> Designation: ${designation} </p>
            </div>
        </div>
        `
    )
}


 document.getElementById('e1').innerHTML=f1('Praveen','Trainer');
 document.getElementById('e2').innerHTML=f1('James','Developer');


console.log(f1('Praveen','Trainer'));
console.log(f1('James','Develoepr'));


//display();