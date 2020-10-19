import React, { Component } from 'react'
import PropTypes from "prop-types";
import { connect } from "react-redux";


class NamePersonTest extends Component {
    constructor(){
        super();

        this.state= {
        username: "",
        password: "",
        firstname: "",
        lastname: "",
        email: "",
        gender: "",
        country: ""
    }; 
    this.onChange = this.onChange.bind(this);
    this.onSubmit = this.onSubmit.bind(this);
    
        }

    onChange(e){
        this.setState({[e.target.name]: e.target.value});
    }
    onSubmit(e){
        e.preventDefault();
        const newPerson = {
            username: this.state.username,
            password: this.state.password,
            firstname: this.state.firstname,
            lastname: this.state.lastname,
            email: this.state.email,
            gender: this.state.gender,
            country: this.state.country,
        
        }

        this.props.createPerson(newPerson);
    }
    render() {
        return (
            <div className="Person">
            <div className="container">
                <div className="row">
                    <div className="col-md-8 m-auto">
                        <h5 className="display-4 text-center">Create / Edit Person form</h5>
                        <hr />
                        <form onSubmit={this.onSubmit}>
                            <div className="form-group">
                                <input type="text" className="form-control form-control-lg " 
                                placeholder="Username" 
                                name="username"
                                value= {this.state.username}
                                onChange = {this.onChange}
                                />
                                <input type="password" className="form-control form-control-lg " 
                                placeholder="Password" 
                                name="password"
                                value= {this.state.password}
                                onChange = {this.onChange}
                                />
                                <input type="text" className="form-control form-control-lg " 
                                placeholder="First Name" 
                                name="firstname"
                                value= {this.state.firstname}
                                onChange = {this.onChange}
                                />
                                <input type="text" className="form-control form-control-lg " 
                                placeholder="Last Name" 
                                name="lastname"
                                value= {this.state.lastname}
                                onChange = {this.onChange}
                                />
                                <input type="email" className="form-control form-control-lg " 
                                placeholder="Email Address" 
                                name="email"
                                value= {this.state.email}
                                onChange = {this.onChange}
                                />
                                <input type="text" className="form-control form-control-lg " 
                                placeholder="Gender" 
                                name="gender"
                                value= {this.state.gender}
                                onChange = {this.onChange}
                                />
                                <input type="text" className="form-control form-control-lg " 
                                placeholder="Country" 
                                name="country"
                                value= {this.state.country}
                                onChange = {this.onChange}
                                />
                                </div>
                            <input type="submit" className="btn btn-primary btn-block mt-4" />
                        </form>
                    </div>
                </div>
            </div>
        </div>
        )
    }
}  
  export default NamePersonTest;


//   <h6>Start Date</h6>
//   <div className="form-group">
//       <input type="date" className="form-control form-control-lg" 
//       name="start_date"
//       value= {this.state.start_date}
//        onChange = {this.onChange}
//        />
//   // </div>
//   // <h6>Estimated End Date</h6>
//   // <div className="form-group">
//   //     <input type="date" className="form-control form-control-lg" 
//   //     name="end_date" 
//   //     value= {this.state.end_date}
//   //     onChange = {this.onChange}
//   //     />
//   // </div>