import React, { Component } from 'react';

class Search extends Component{
    constructor(props){
        super(props);
        this.state = {
            error : null,
            isLoaded : false,
            item : {},
            id : "",
            view : 'none'
        };
    }

    handleChange = (e) => {
        this.setState({
            id : e.target.value
        });
        console.log(this.state.id);
    }
    handleSubmit = (e) => {
        // submit의 경우 데이터를 바로 넘기려는 경향이 있음.
        // 아래의 메소드를 실행하기 위해 기능을 막아놔야함.
        e.preventDefault();
        // 디버깅
        console.log("handleSubmit")
        if(!this.state.id){
            // 만약 데이터가 변동이 없다면 (데이터를 입력하지 않았다면)
            alert("id를 입력하세요");
            this.setState({
                view : 'none'
            })
            // 종료함.
            return;
        }
        
        // 정상 작동시 실행될 구문

        // 콘솔창에 데이터를 불러올 json 경로를 입력 >> 디버깅용
        console.log("http://pjs.dothome.co.kr/ajaxDB3.php?id="+this.state.id);
        // Ajax를 실행하기 위한 방법중 fetch사용
        fetch("http://pjs.dothome.co.kr/ajaxDB3.php?id="+this.state.id)
        .then(res => res.json()) // 서버에 존재하는 data를 json형식으로 치환
        .then(
            // res.json 형식의 데이터가 result 안에 있음.
            (result) => {
                this.setState({
                    isLoaded : true,
                    // 이경우 통상적으로 item : result.item이라고 써주지만, 여기선 result값 자체가 item과 같기 때문에 생략해준다.
                    item : result,
                    view : 'block'
                });
                console.log(result);
            },
            // 오류시 실행 될 구문
            (error) => {
                this.setState({
                    // 오류가 생기더라도 데이터의 변화가 있기 때문에 loading은 된거라 판단함.
                    isLoaded : true,
                    // 에러 실행
                    error
                });
            }
        ); // 여기가 fetch 종료지점 >> fetch().then().then() >> 이걸 method chain이라고 함
    } // handleSubmit 종료지점
    render(){
        const { item } = this.state;
        const style = {
            width : '300px',
            borderCollapse : 'collapse'
        }
        
        return (
            <div>
                <form onSubmit = {this.handleSubmit}>
                    <input type='text' name='id' onChange={this.handleChange}></input>
                    <input type='submit' value='search'></input>
                </form>
                <div>
                    <table style={style} border='1'>
                        <caption>Person Info.</caption>
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Address</th>
                        </tr>
                        <tr>
                            <td>{item.id}</td>
                            <td>{item.name}</td>
                            <td>{item.address}</td>
                        </tr>
                    </table>
                </div>
            </div>
        )
    }
}

export default Search;