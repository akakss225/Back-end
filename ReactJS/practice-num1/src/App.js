import './App.css';
import React, { Component } from 'react';
import Search from './Search';

class App extends Component {
    state = {
      search : ''
  }

  handleChange = (e) => {
      this.setState({
          [e.target.search] : e.target.value
      })
  }

  render() {
      
      return (
        <Search />
      );
  }
}

export default App;
