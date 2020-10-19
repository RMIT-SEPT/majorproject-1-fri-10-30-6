import React, { Component } from 'react';
import '../App.css';
import 'bootstrap/dist/css/bootstrap.css';


class List extends Component {


 


    state = {
        account: []
    };


    async componentDidMount() {
        const response = await fetch('api/account/all');
        const body = await response.json();
        this.setState({ account: body });
    }


    render() {
        const { account } = this.state;
        return (
            <div className="App">
                <header className="App-header">
                   
                    <div className="App-intro">
                        <h3>Display /all account data from database </h3>
                        {account.map(group =>
                            <div key={group.id}>
                                {group.firstname}
                                {group.email}
                            </div>

                        )}
                     
                    </div>
                </header>
            </div>
        );
    }
}

export default List;