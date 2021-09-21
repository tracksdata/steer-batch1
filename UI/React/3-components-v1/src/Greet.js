import React from 'react';

let Greet = () => {
    let display=()=>{
        return(
            <div>
                <h1>Hello from display</h1>
            </div>
        )
    }
    return (
        <div>
            <h1>Greet Component</h1>
            <hr/>
            {display()}
        </div>
    );
};

export default Greet;