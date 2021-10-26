import React, { Component } from 'react';

class SearchForm extends Component {
  state = {
    id: ''
  }
  handleChange = (e) => {
    this.setState({
      [e.target.name]: e.target.value
    })
  }
  handleSubmit = (e) => {
    // 전송을 방지
    e.preventDefault();   
    console.log("handleSubmit : "+this.state.id); 
    this.props.changeId(this.state.id); 
    // 상태 초기화
    this.setState({
      id:''
    })
  }
  render() {
    return (
      <form onSubmit={this.handleSubmit}>
          <input type='text' name='id' onChange={this.handleChange}></input>
          <input type="submit" value="search"></input>
        </form>
    );
  }
}

export default SearchForm;