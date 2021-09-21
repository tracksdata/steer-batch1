import React from 'react';

const App = () => {
  let city='';

  function sayName() {
    console.log(">>> say Name called..");
  }

  function display(e) {
    console.log(e.target.value);
   
  }

  function loadCity(e){
    console.log(e.target.value);
    city=e.target.value;
    console.log('city: '+city);
  }

  return (
    <div>
      <div>
        <h1>APP Component</h1>
      </div>
      <hr />

      <h1> City: {city} </h1>


      <hr />
      <select onChange={(e)=>loadCity(e)}>
        <option>Hyderabad</option>
        <option>Pune</option>
        <option>Kolkata</option>
        <option>Bangalore</option>
        <option>Chennai</option>
      </select>

      <br/><br/>

      <input type="text" onChange={(e) => display(e)} /> <br />

      <button onClick={() => sayName()} >Click Here</button>

    </div>

  );
};

export default App;