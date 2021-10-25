import React from 'react';

class AjaxTest extends React.Component{
    constructor(props){
        super(props);
        this.state={ // model 역할
            error:null,
            isLoaded:false,
            items:[]
        };
    }
    componentDidUpdate(){
        fetch("http://akakss225.ivyro.net/ajaxDB2.php") // 요청하려는 서버 주소
        .then(res=>res.json()) // json으로 변환한 값을 res에 저장
        .then(
            (result)=>{ 
                this.setState({
                    isLoaded: true,
                    items: result // result는 배열형태이기 때문에 저장 가능 >> json형식.
                });
            },
            (error)=>{
                this.setState({
                    isLoaded:true,
                    error
                });
            }
        );
    }
    render(){
        const { error, isLoaded, items } = this.state;
        if (error) {
        return <div>Error: {error.message}</div>;
        } else if (!isLoaded) {
        return <div>Loading...</div>;
        } else {
            return (
                <ul>
                    {items.map(item => (
                        <li key={item.id}>
                        {item.name} {item.price}
                        </li>
                    ))}
                </ul>
            );
        }
    }
}

export default AjaxTest;