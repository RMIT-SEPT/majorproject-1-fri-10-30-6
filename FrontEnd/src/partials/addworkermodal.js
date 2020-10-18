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

        const res = await fetch("/api/employee", {
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
                       
                        company: "",
                        firstname: "",
                        lastname: "",
                        profession: "",
                        specialty: "",
                        username: ""      
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
                <Button size="sm" color="danger" onClick={() => this.setState({ show: true })}>Add New Worker</Button>
         


                <Modal show={this.state.show} onHide={async () => { await this.onclose(); }}>
                        <Modal.Header closeButton>
                            <Modal.Title>Add Worker</Modal.Title>
                        </Modal.Header>
                    <Modal.Body>
                        <form onSubmit={this.submitForm}>
                            <div className="input-group">
                                <label htmlFor="company">Company</label>
                                <input
                                    type="text"
                                    name="company"
                                    id="company"
                                    value={this.state.values.company}
                                    onChange={this.handleInputChange}
                                    title="company"
                                    required
                                />
                            </div>
                            <div className="input-group">
                                <label htmlFor="firstname">Firstname</label>
                                <input
                                    type="firstname"
                                    name="firstname"
                                    id="firstname"
                                    value={this.state.values.firstname}
                                    onChange={this.handleInputChange}
                                    title="firstname"
                                    required
                                />
                            </div>
                            <div className="input-group">
                                <label htmlFor="lastname">Lastname</label>
                                <input
                                    type="text"
                                    name="lastname"
                                    id="lastname"
                                    value={this.state.values.lastname}
                                    onChange={this.handleInputChange}
                                    title="lastname"
                                    required
                                />
                            </div>
                            <div className="input-group">
                                <label htmlFor="profession">Profession</label>
                                <input
                                    type="text"
                                    name="profession"
                                    id="profession"
                                    value={this.state.values.profession}
                                    onChange={this.handleInputChange}
                                    title="profession"
                                    required
                                />
                            </div>
                            <div className="input-group">
                                <label htmlFor="specialty">Specialty</label>
                                <input
                                    type="text"
                                    name="specialty"
                                    id="specialty"
                                    value={this.state.values.specialty}
                                    onChange={this.handleInputChange}
                                    title="specialty"
                                    required
                                />
                            </div>
                            <button type="submit">Add Worker</button>
                        </form>
                        <div className={`message ${this.state.isError && "error"}`}>
                            {this.state.isSubmitting ? "Submitting..." : this.state.message}
                        </div>
                        <h6>Profession must be 'Hotel Agent' , ' Travel Agent' or 'Rental Car Salesman' </h6>
                    </Modal.Body>
                  
                    </Modal>
            </>

        );
    }

}


export default Book;