import { useState } from 'react';
import 'bootstrap/dist/css/bootstrap.css'
import Buttongen from './components/Buttongen';
const App = () => {

  let nums = [5, -5, 10, -10, 15, -15, 20, -20];

  const [totalCount, setTotalCount] = useState(0);

  function calculateTotalCount(btnHitLable) {
    setTotalCount(btnHitLable + totalCount);
  }


  function generateButtons() {

    return nums.map((num, idx) => {
      return (
        <Buttongen key={idx} btnLabel={num} parentF1={($event) => calculateTotalCount($event)} />
      )
    })

  }

  return (
    <div className="container">

      <div className="alert alert-info text-center">
        <h1>Counter APP</h1>
      </div>

      <hr />

      <div className="row">
        <div className="col-12 col-md-6">
          <div className="card">
            <div className="card-header">Counter App</div>
            <div className="card-body">

              {generateButtons()}

            </div>
            <div className="card-footer">
              <span className="text-center"><h3>Total Count: {totalCount} </h3></span>
            </div>
          </div>
        </div>
      </div>

    </div>
  );
};

export default App;