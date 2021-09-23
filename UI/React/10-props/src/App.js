import React from 'react';
import 'bootstrap/dist/css/bootstrap.css';
import Employees from './components/Employees';
import EmployeesV1 from './components/EmployeesV1';

const App = () => {

  return (
    <div className="container">

      <h1>APP Component</h1>
      <hr/>

      <EmployeesV1/>
     
      

    </div>
  );
};

export default App;