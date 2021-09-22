import { useState,useEffect} from 'react';

const App = () => {

  const [city, setCity] = useState();
  const [counter, setCounter] = useState(0)

  // 3 ways .
  useEffect(()=>{
    console.log(">>>>every statte change <<<<");
  })

  // only one time in life cycle
  useEffect(()=>{
    console.log(">>>>only once ..<<<<");
  },[])

    // only when counter changed
    useEffect(()=>{
      console.log(">>>> counter changed..<<<<");
    },[counter])

        // only when city changed
        useEffect(()=>{
          console.log(">>>> city changed..<<<<");
        },[city])

      // only when city or counter changed
      useEffect(()=>{
        console.log(">>>> city or counter changed..<<<<");
      },[city,counter])

  function sayName() {
    console.log(">>> say Name called..");
  }

  function display(e) {
    console.log(e.target.value);

  }

  function loadCity(e) {
    setCity(e.target.value);
    //setCounter(counter + 1);
  }

  return (
    <div>
      <div>
        <h1>State Demo</h1>
      </div>
      <hr />

      <h2>
        Counter: {counter}
      </h2>
      <button onClick={() => setCounter(counter + 1)}>+</button>
      <br />

      <h1> City: {city} </h1>


      <hr />
      <select onChange={(e) => { loadCity(e) }}>
        <option>Hyderabad</option>
        <option>Pune</option>
        <option>Kolkata</option>
        <option>Bangalore</option>
        <option>Chennai</option>
      </select>

      <br /><br />

      <input type="text" onChange={(e) => display(e)} /> <br />

      <button onClick={() => sayName()} >Click Here</button>

    </div>

  );
};

export default App;


