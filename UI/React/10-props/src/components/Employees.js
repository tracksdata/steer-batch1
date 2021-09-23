import React from 'react';
import EMP_DATA from '../EmpData';
import Employee from './Employee';

const Employees = () => {
    let employees = EMP_DATA

    function renderEmployees() {
        return employees.map((emp, idx) => {
            return (
                <div key={idx} className="col-12 col-md-4 col-lg-4 col-xl-4">
                    <Employee emp={emp} />
                </div>
            )
        })
    }

    return (
        <div>
            <div className="row">

                {renderEmployees()}

            </div>

        </div>
    );
};

export default Employees;