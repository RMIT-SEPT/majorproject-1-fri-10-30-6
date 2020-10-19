import React, { Component } from 'react';
import '../App.css';
import 'bootstrap/dist/css/bootstrap.css';
import Button from 'react-bootstrap/Button';
import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import Addworkermodal from '../partials/addworkermodal.js';


class Workers extends Component {


    state = {
        account: []
    };


    async componentDidMount() {
        const response = await fetch('api/employee/all');
        const body = await response.json();
        this.setState({ account: body });

    }




    async remove(id) {
        await fetch(`/api/employee/delete/${id}`, {
            method: 'DELETE',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            }
        }).then(() => {
            let updatedGroups = [...this.state.account].filter(i => i.id !== id);
            this.setState({ account: updatedGroups });
        });
    }

   


    render() {
        const { account } = this.state;
        return (
            <div className="App">
             
                        <Container>
                            <Row>
                                <Col>
                                    <h4>Admin Function Employee Listing </h4>
                        </Col>
                   
                        <Col>       <Addworkermodal />
                        </Col>
                        <Col>
                            <Button size="sm" color="danger" onClick={() => this.componentDidMount()}>Refresh</Button>
                            </Col>
                            </Row>
                            <Row xs={2} md={4} lg={6}>
                                <Col>First Name</Col>
                                <Col>Last Name</Col>
                                <Col>Profesion</Col>
                            </Row>
                            {account.map(group =>
                                <Row xs={2} md={4} lg={6} key={group.id}>
                                    <Col> {group.firstname}</Col>
                                    <Col>{group.lastname}</Col>
                                    <Col>{group.profession}</Col>
                                    <Col> <Button size="sm" color="danger" onClick={() => this.remove(group.id)}>Delete</Button> </Col>
                                </Row>
                            )}
                        </Container>
                       
           
                                
            </div>
        );
    }
}



export default Workers;