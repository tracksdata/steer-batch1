import React from 'react';

const Greet = (props) => {

    console.log("GREET:: " + props.msg);
    function greetBack() {
        console.log("Greet::greetBack");
        props.parentFun(props.msg+" too!");
    }

    return (
        <div>
            <div className="col-8">
                <div className="card">
                    <div className="card-header">Greet Component</div>
                    <div className="card-body">
                        <h3>Hello {props.pname},</h3>
                        <h3>{props.msg}</h3>
                        <hr />
                        <button onClick={() => greetBack()} className="btn btn-primary"> Greet Back</button>
                    </div>
                </div>
            </div>

        </div>
    );
};

export default Greet;