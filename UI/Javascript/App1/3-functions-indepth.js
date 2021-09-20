// sub functions / closures

/*
function doTeach(){ // doTeach context
    console.log('... teaching started');

    function doLearn(){ // doLearn context
        console.log('... Learning is started');
    }

    doLearn();
    console.log('... teaching ends');
} // parent function scope

doTeach();
doTeach();
doTeach();

*/

// closures : even when parent scope is ended, child scope sill exsits.
// to implement this, parent function must return child function name.

/*
function doTeach(){ // doTeach context
    console.log('... teaching started');

    function doLearn(){ // doLearn context
        console.log('... Learning is started');
    }

    console.log('... teaching ends');
    return doLearn // type of return type iis function
} // parent function scope

var f1=doTeach(); 
f1();
f1();
f1();
f1();
f1();

*/

// more than one sub / child functtion returning

function validations() {
    console.log('... validation initiated...');

    function validateString() {
        console.log("... validating string type");
    }

    function validateEmail() {
        console.log('... validating email');
    }

    function validateNumber() {
        console.log('... validating number');
    }

    return {
        validateString,
        validateEmail,
        validateNumber
    };

}

var {validateString,validateEmail,validateNumber}=validations();

/*
var validateObj = validations();
validateObj.validateString();
validateObj.validateEmail();
validateObj.validateNumber();

*/

validateEmail();
validateNumber();
validateString();


