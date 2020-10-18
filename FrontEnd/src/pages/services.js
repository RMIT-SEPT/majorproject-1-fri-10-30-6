import React, { Component } from 'react';
import '../App.css';
import 'bootstrap/dist/css/bootstrap.css';
import Button from 'react-bootstrap/Button';
import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';



class Services extends Component {

    constructor(props) {
        super(props);
        this.state = {
            account: [],
            tagentaccount: [],
            ragentaccount: [],
            hagentaccount: []
        };
    }



    async componentDidMount() {
        const response = await fetch('api/employee/all');
        const body = await response.json();
        this.setState({ account: body });

        let tagentbody = [...this.state.account].filter(i => i.profession == "Travel Agent");
        this.setState({ tagentaccount: tagentbody });



        let ragentbody = [...this.state.account].filter(i => i.profession == "Rental Car Salesman");
        this.setState({ ragentaccount: ragentbody });

        let hagentbody = [...this.state.account].filter(i => i.profession == "Hotel Agent");
        this.setState({ hagentaccount: hagentbody });
    }






   


    render() {
        const { tagentaccount } = this.state;
        const { ragentaccount } = this.state;
        const { hagentaccount } = this.state;

        return (
            <div className="App">
             
                        <Container>
                            <Row>
                                <Col>
                                    <h4>Services Listing</h4>
                        </Col>
                   
                        <Col>      
                        </Col>
                        <Col>
                            <Button size="sm" color="danger" onClick={() => this.componentDidMount()}>Refresh</Button>
                            </Col>
                    </Row>
                    <Row>
                        <h5>Plane Booking Service</h5>
                    </Row>
                            <Row xs={2} md={4} lg={6}>
                            <Col><h6>First Name</h6></Col>
                            <Col><h6>Last Name</h6></Col>
                            <Col><h6>Specialty</h6></Col>
                            <Col><h6>Company</h6></Col>
                            </Row>
                    {tagentaccount.map(group =>
                                <Row xs={2} md={4} lg={6} key={group.id}>
                                    <Col> {group.firstname}</Col>
                                    <Col>{group.lastname}</Col>
                                    <Col>{group.specialty}</Col>
                                    <Col>{group.company}</Col>
                                  
                                </Row>
                    )}
                    <Row>
                    <h5>Rental Car Services</h5>
                    </Row>
                <Row xs={2} md={4} lg={6}>
                        <Col><h6>First Name</h6></Col>
                        <Col><h6>Last Name</h6></Col>
                         <Col><h6>Specialty</h6></Col>
                         <Col><h6>Company</h6></Col>
                </Row>
                    {ragentaccount.map(group =>
                        <Row xs={2} md={4} lg={6} key={group.id}>
                            <Col> {group.firstname}</Col>
                            <Col>{group.lastname}</Col>
                            <Col>{group.specialty}</Col>
                            <Col>{group.company}</Col>

                        </Row>
                    )}
                    <Row>
                        <h5>Hotel Agents</h5>
                    </Row>
                    <Row xs={2} md={4} lg={6}>
                        <Col><h6>First Name</h6></Col>
                        <Col><h6>Last Name</h6></Col>
                        <Col><h6>Specialty</h6></Col>
                        <Col><h6>Company</h6></Col>
                    </Row>
                    {hagentaccount.map(group =>
                        <Row xs={2} md={4} lg={6} key={group.id}>
                            <Col> {group.firstname}</Col>
                            <Col>{group.lastname}</Col>
                            <Col>{group.specialty}</Col>
                            <Col>{group.company}</Col>

                        </Row>
                    )}
                        </Container>
                       
           
                                
            </div>
        );
    }
}



export default Services;