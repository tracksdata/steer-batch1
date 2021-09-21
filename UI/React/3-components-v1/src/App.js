import React, { Component } from 'react';
import Greet from './Greet';

class App extends Component {

  display(){
    return (
      <div>
        <p>Hello message from display function</p>
      </div>
    )
  }

  render() {
    return (
      <div>
        <h1>Class Component Syntax</h1> <hr />
        {this.display()}
        <hr/>
        <Greet/>
      </div>
    );
  }
}

export default App;