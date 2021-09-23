import { useState } from 'react';
import 'bootstrap/dist/css/bootstrap.css';
import Cart from './components/Cart';
import Products from './components/Products';

const App = () => {
  return (
    <div className="container">

      <h1>e-Shop APP</h1> <hr/>

     <Cart/>



    </div>
  );
};

export default App;