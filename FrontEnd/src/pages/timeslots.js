import React, { Component } from 'react';
import '../App.css';
import 'bootstrap/dist/css/bootstrap.css';
import Button from 'react-bootstrap/Button';
import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import Addtimeslotmodal from '../partials/addtimeslotmodal.js';


class Timeslots extends Component {

    constructor(props) {
        super(props);
        this.state = {
            timeslotaccount: [] ,
            workaccount: []
        };
    }


    async componentDidMount() {
        const response = await fetch('api/timeslot/all');
        const body = await response.json();
        this.setState({ timeslotaccount: body });

        const workresponse = await fetch('api/employee/all');
        const workbody = await workresponse.json();
        this.setState({ workaccount: workbody });

        
    }




    async remove(id) {
        await fetch(`/api/timeslot/${id}`, {
            method: 'DELETE',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            }
        }).then(() => {
            let updatedGroups = [...this.state.timeslotaccount].filter(i => i.id !== id);
            this.setState({ timeslotaccount: updatedGroups });
        });
    }

   


    render() {
        const { workaccount } = this.state;
        const { timeslotaccount } = this.state;
       
        return (
            <div className="App">
            
                        <Container>
                            <Row>
                                <Col>
                                    <h4>Admin Function Timeslot Listing </h4>
                        </Col>
                   
                        <Col>       <Addtimeslotmodal />
                        </Col>
                        <Col>
                            <Button size="sm" color="danger" onClick={() => this.componentDidMount()}>Refresh</Button>
                            </Col>
                            </Row>
                            <Row xs={2} md={4} lg={6}>
                                <Col>Time</Col>
                                <Col>Day</Col>
                                <Col>Worker ID</Col>
                                <Col>Available</Col>
                            </Row>
                    {timeslotaccount.map(group =>
                                <Row xs={2} md={4} lg={6} key={group.id}>
                                    <Col>{group.startTime}-{group.endTime}</Col>
                                    <Col>{group.mon}</Col>
                                    <Col>{group.workersId}</Col>
                                    <Col>{group.avail}</Col>

                          

                      



                                    <Col> <Button size="sm" color="danger" onClick={() => this.remove(group.id)}>Delete</Button> </Col>
                                </Row>
                    )}

                        </Container>
                       
              

          
                                
            </div>
        );
    }
}



export default Timeslots;