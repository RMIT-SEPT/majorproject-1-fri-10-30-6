import React, { Component } from 'react';
import '../App.css';
import Navbar from 'react-bootstrap/Navbar'
import Nav from 'react-bootstrap/Nav'
import Form from 'react-bootstrap/Form'
import Container from 'react-bootstrap/Container'
import Row from 'react-bootstrap/Row'
import Col from 'react-bootstrap/Col'
import 'bootstrap/dist/css/bootstrap.css';



class Book extends Component {

    constructor(props) {
        super(props);
        this.state = {
            values: {
                email: "",
                password: ""
            },
            isSubmitting: false,
            isError: false,
            workaccount: [],
            timeaccount: [],
            value: 'select'
        };
    }

    async componentDidMount() {
        const response = await fetch('api/employee/all');
        const body = await response.json();
        this.setState({ workaccount: body });
        const timeresponse = await fetch('/api/timeslot/all');
        const timebody = await timeresponse.json();
        this.setState({ timeaccount: timebody });

    }

    submitForm = async e => {
        e.preventDefault();
        console.log(this.state);
        this.setState({ isSubmitting: true });

        const res = await fetch("/api/booking", {
            method: "POST",
            body: JSON.stringify(this.state.values),
            headers: {
                "Content-Type": "application/json"
            }
        });
        this.setState({ isSubmitting: false });
        const data = await res.json();
        !data.hasOwnProperty("error")
            ? this.setState({ message: data.success })
            : this.setState({ message: data.error, isError: true });

        setTimeout(
            () =>
                this.setState({
                    isError: false,
                    message: "",
                    values: {
                        date: "",
                        userId: "",
                        workerId: ""
                    }
                }),
            1600
        );
    };

    

   

    handleInputChange = e =>
        this.setState({
            values: { ...this.state.values, [e.target.name]: e.target.value }
        });

 

    render() {
        const { workaccount } = this.state;
        const { timeaccount } = this.state;
        
        return (
            <>
                <div>
                    <h4>Book Your Appointment</h4>
                
                    
                   
                    <form onSubmit={this.submitForm}>
                        <Container>
                            <Row>
                                <Col sm={4}>
                        <div className="input-group">
                       <label htmlFor="userID">User ID</label>
                            <input
                                type="text"
                                 name="userID"
                                 id="userID"
                                value={this.state.values.userID}
                                onChange={this.handleInputChange}
                                title="userID"
                                required
                            />
                                    </div>
                                </Col>
                                <Col sm={3}>
                                    <label htmlFor="email">Worker</label>
                                    <Form.Control as="select" id="inlineFormCustomSelectPref" custom required onChange={this.handleInputChange} value={this.state.values.workerId}>
                            <option value="0">Choose...</option>
                            {workaccount.map(group =>
                               
                               
                               
                                <option title="workerId" name="workerId" id="workerId"
                                    value={group.id}> {group.firstname}  {group.lastname}</option>
                           
                            )}
                         
                          
                                    </Form.Control>

                                </Col>
                                <Col>
                                    <Form.Control as="select" id="inlineFormCustomSelectPref" custom required onChange={this.handleInputChange} value={this.state.values.date}>
                                        <option value="0">Choose...</option>
                                        {timeaccount.map(group =>



                                            <option title="date" name="date" id="date"
                                                value={group.id}> {group.startTime}-{group.endTime}</option>

                                        )}


                                    </Form.Control>
                                    </Col>
                                </Row>
                            <button type="submit">Book Appointment</button>
                            </Container>
                    </form>
                    <div className={`message ${this.state.isError && "error"}`}>
                        {this.state.isSubmitting ? "Submitting..." : this.state.message}
                    </div>
                </div>
            </>

        );
    }
}

export default Book;
