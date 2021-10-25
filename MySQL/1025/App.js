import React, { Component } from 'react';
import SearchForm from './SearchForm';
class App extends Component {
  state = {
    item:{},
    id:''  
  }

  changeId=(vid)=>{
    console.log("changeId : "+vid);
    this.setState({ 
      id:vid
     });
  }

  componentDidUpdate(prevProps,prevState){
    //id가 변경됐을 때만 수행. 이 코드 없으면 무한루프
    if(prevState.id===this.state.id){
      return;
    }
    fetch("http://pjs.dothome.co.kr/ajaxDB3.php?id="+this.state.id)
        .then(res=>res.json())
        .then(
            (result)=>{
                this.setState({
                    isLoaded: true,
                    item: result
                });
                console.log(result);
            },
            (error)=>{
                this.setState({
                    isLoaded:true,
                    error
                });
            }
        );
  }
  render() {  
    const {item} = this.state;
    return (
      <div>
        <SearchForm changeId={this.changeId}/>        
        <div>
            <h1>{item.id}</h1>
            <h1>{item.name}</h1>
            <h1>{item.address}</h1>
        </div>
      </div>
    );
  }
}

export default App;
