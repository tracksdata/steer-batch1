import React from 'react';

const Employee = (props) => {

    let { emp } = props;

    return (
        <div className="s1">
            <div className="card">
                <div className="card-header fw-bold">{emp.first_name}</div>
                <div className="card-body">
                    <div className="card-text">
                        <p>ID: {emp.id}</p>
                        <p>Firtst Name: {emp.first_name}</p>
                        <p>Last Name: {emp.last_name}</p>
                        <p>Email: {emp.email}</p>
                        <p>Gender: {emp.gender}</p>
                    </div>
                </div>
            </div>
        </div>


    );
};

export default Employee;