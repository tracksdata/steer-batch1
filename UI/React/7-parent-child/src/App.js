import { useState } from 'react';
import 'bootstrap/dist/css/bootstrap.css';
import Greet from './components/Greet';
const App = (props) => {
  let name = 'Praveen';

  const [greetMsg, setGreetMsg] = useState();

  return (
    <div className="container">

      <h1> {props.title}</h1> <hr />

      <div className="col-8">
        <div className="card">
          <div className="card-header">APP Component</div>
          <div className="card-body">

            <div className="card-text">
               Type Greeting: <input onBlur={(e)=>setGreetMsg(e.target.value)}/> <br/>
              <button className="btn btn-primary btn-space" onClick={() => setGreetMsg(greetMsg)}>Greet</button>
        
            </div>

          </div>
        </div>
      </div>

      <br />

      <Greet msg={greetMsg} pname={name} />

    </div>
  );
};

export default App;