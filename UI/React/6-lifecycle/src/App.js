import { useMemo, useEffect, useState } from 'react';

const App = () => {

  const [counter, setCounter] = useState(0);

  useEffect(() => {
    console.log(">> APP::componentDidMount");
  }, [])// empty array will make use effect to load only once in the life cycle

  useEffect(() => {
    console.log(">> APP::componentDidUpdate");
  })// invokes every time when render is re constructed view / every state changes
  useMemo(() => {
    console.log(">> APP::constructor");
  }, [])

  useMemo(() => {
    console.log(">> APP::constructor >>> <<<");
  }) ;// every tim before render is re-rendered


  function test() {
    // console.log(">> APP::test");
    setCounter(counter + 1);
  }


  return (
    <div>
      {console.log('>> APP::render')}

      <h1>React Lifcycle hooks</h1> <hr />
      <p>
        <b>Counter: {counter}</b>
      </p>
      <button onClick={() => test()}>Click Here</button>
    </div>
  );
};

export default App;