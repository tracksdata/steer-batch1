import React from 'react';

const Greet = (props) => {

    console.log("GREET:: "+props.msg);
    return (
        <div>
            <div className="col-8">
                <div className="card">
                    <div className="card-header">Greet Component</div>
                    <div className="card-body">
                        <h3>Hello {props.pname},</h3>
                        <h3>{props.msg}</h3>
                    </div>
                </div>
            </div>

        </div>
    );
};

export default Greet;