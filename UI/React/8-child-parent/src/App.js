import { useState } from 'react';
import 'bootstrap/dist/css/bootstrap.css';
import Greet from './components/Greet';
const App = (props) => {
  let name = 'Praveen';

  const [greetMsg, setGreetMsg] = useState();
  const [childMsg, setChildMsg] = useState();
  function receiveMessage(childData) {
    console.log(">> APP:: receiveMessage");
    console.log(childData);
    setChildMsg(childData)
  }

  return (
    <div className="container">

      <h1> {props.title}</h1> <hr />

      <div className="col-8">
        <div className="card">
          <div className="card-header">APP Component</div>
          <div className="card-body">
            <div className="card-text">
              <button className="btn btn-primary btn-space" onClick={() => setGreetMsg('Goood Morning')}>Good Morning</button>
              <button className="btn btn-primary btn-space" onClick={() => setGreetMsg('Goood Noon')}>Good Noon</button>
              <button className="btn btn-primary btn-space" onClick={() => setGreetMsg('Goood Evening')}>Good Evening</button>

              <hr />
              <div>
                <p>Child Message: {childMsg}</p>
              </div>
            </div>

          </div>
        </div>
      </div>

      <br />

      <Greet msg={greetMsg} pname={name} parentFun={($event) => receiveMessage($event)} />

    </div>
  );
};

export default App;