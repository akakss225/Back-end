import React, { Component } from 'react';

class Search extends Component {
    state = {
        search : ''
    }

    handleChange = (e) => {
        this.setState({
            search : e.target.value
        })
    }

    searchData = () => {
        const { search } = this.state;
        console.log(search);
    }

    render() {
        const style = {
            border : "3px solid green",
            padding : "15px",
            margin : "15px",
            height : "60px"
        }
        const inStyle = {
            width : "90%",
            height : "50px",
            marginRight : "20px",
            fontSize : "42px"
        }
        const { search } = this.state
        return (
            <div style={style}>
                <form>
                    <input style = {inStyle}
                    placeholder='검색어를 입력하세요' 
                    onChange={this.handleChange}
                    value = {search}
                    />
                    <button onClick={this.searchData}>search</button>
                </form>
            </div>
        );
    }
}

export default Search;