import React from 'react';
import 'bootstrap/dist/css/bootstrap.css';
import Products from './components/Products';
import Product from './components/Product';
const App = () => {
  return (
    <div className="container">

      <h1>HTTP-Client Demo</h1> <hr />

      <Products />
      <Product/>

    </div>
  );
};

export default App;