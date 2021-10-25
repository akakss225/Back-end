import React from 'react';

class AjaxTest extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            error : null,
            isLoaded : false,
            items : []
        };
    }

    componentDidUpdate(){
        fetch("http://akakss225.ivyro.net/ajaxDB2.php")
        .then(res => res.json())
        .then(
            (result) => {
                this.setState({
                    isLoaded : true,
                    items : result
                });
            },
            (error) => {
                this.setState({
                    isLoaded : true,
                    error
                });
            }
        );
    }

    render(){
        const {error, isLoaded, items} = this.state;
        if(error){
            return <div>Error : {error.message}</div>;
        }
        else if(!isLoaded){
            return <div>Loading...</div>;
        }
        else{
            return (
                <ul>
                    {items.map(item => (
                        <li id={item.id}>
                            {item.name} {item.price}
                        </li>
                    ))}
                </ul>
            );
        }
    }
}

export default AjaxTest;