import React, { useState } from 'react';
import EMP_DATA from '../EmpData';

const EmployeesV1 = () => {
    let employees = EMP_DATA
    function renderEmployees() {
        return employees.map((emp, idx) => {
            return (
                <tr key={idx}>
                    <td>{emp.id}</td>
                    <td>{emp.first_name}</td>
                    <td>{emp.last_name}</td>
                    <td>{emp.email}</td>
                    <td>{emp.gender}</td>
                </tr>
            )
        })
    }
    return (
        <div>
            <table className="table table-striped">
                <thead className="bg-info">
                    <tr>
                        <th>ID</th>
                        <th>Firtst Name</th>
                        <th>Last Name</th>
                        <th>Email</th>
                        <th>Gender</th>
                    </tr>
                </thead>
                <tbody>
                    {renderEmployees()}
                </tbody>
            </table>


        </div>
    );
};

export default EmployeesV1;