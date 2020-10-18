import React, { Component } from 'react';
import '../App.css';
import Navbar from 'react-bootstrap/Navbar'
import Nav from 'react-bootstrap/Nav'
import Modal from 'react-bootstrap/Modal';
import Button from 'react-bootstrap/Button'
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
            show : false
        };
    }

    submitForm = async e => {
        e.preventDefault();
        console.log(this.state);
        this.setState({ isSubmitting: true });

        const res = await fetch("/api/timeslot", {
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
                       
                        avail: "",
                        workersId: "",
                        startTime: "",
                        endTime: "",
                        mon: ""
                         
                    }
                }),
            1600
        );
    };




    handleInputChange = e =>
        this.setState({
            values: { ...this.state.values, [e.target.name]: e.target.value }
        });


    async  onclose() {
        this.setState({ show: false });
   
    }

  
    render() {
        return (
            <>
                <Button size="sm" color="danger" onClick={() => this.setState({ show: true })}>Add New Timeslot</Button>
         


                <Modal show={this.state.show} onHide={async () => { await this.onclose(); }}>
                        <Modal.Header closeButton>
                            <Modal.Title>Add New Timeslot</Modal.Title>
                        </Modal.Header>
                    <Modal.Body>
                        <form onSubmit={this.submitForm}>
                            <div className="input-group">
                                <label htmlFor="avail">Available (y or n)</label>
                                <input
                                    type="text"
                                    name="avail"
                                    id="avail"
                                    value={this.state.values.avail}
                                    onChange={this.handleInputChange}
                                    title="avail"
                                    required
                                />
                            </div>
                            <div className="input-group">
                                <label htmlFor="workersId">Workers Id</label>
                                <input
                                    type="workersId"
                                    name="workersId"
                                    id="workersId"
                                    value={this.state.values.workersId}
                                    onChange={this.handleInputChange}
                                    title="workersId"
                                    required
                                />
                            </div>
                            <div className="input-group">
                                <label htmlFor="startTime">Start Time</label>
                                <input
                                    type="text"
                                    name="startTime"
                                    id="startTime"
                                    value={this.state.values.startTime}
                                    onChange={this.handleInputChange}
                                    title="startTime"
                                    required
                                />
                            </div>
                            <div className="input-group">
                                <label htmlFor="endTime">End Time</label>
                                <input
                                    type="text"
                                    name="endTime"
                                    id="endTime"
                                    value={this.state.values.endTime}
                                    onChange={this.handleInputChange}
                                    title="endTime"
                                    required
                                />
                            </div>
                            <div className="input-group">
                                <label htmlFor="mon">Day</label>
                                <input
                                    type="text"
                                    name="mon"
                                    id="mon"
                                    value={this.state.values.mon}
                                    onChange={this.handleInputChange}
                                    title="mon"
                                    required
                                />
                            </div>
                            <button type="submit">Add Timeslot</button>
                        </form>
                        <div className={`message ${this.state.isError && "error"}`}>
                            {this.state.isSubmitting ? "Submitting..." : this.state.message}
                        </div>
                        
                    </Modal.Body>
                  
                    </Modal>
            </>

        );
    }

}


export default Book;