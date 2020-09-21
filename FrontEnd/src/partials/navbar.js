import React from 'react';
import '../App.css';
import Navbar from 'react-bootstrap/Navbar'
import Nav from 'react-bootstrap/Nav'
import 'bootstrap/dist/css/bootstrap.css';
import Registermodal from './registermodal.js';
import Loginmodal from './loginmodal.js';
import { Container } from 'react-bootstrap';
import sitelogo from '../images/sitelogo.png';

function navbar() {
    return (
        <div>
            <Navbar collapseOnSelect expand="lg" bg="light" variant="light">
                <Container>
                
                    <Navbar.Brand href="/">
                        <img
                            alt=""
                            src={sitelogo}
                            width="160"
                            height="50"
                            className="d-inline-block align-top"
                        />
    </Navbar.Brand>
          
                <Navbar.Toggle aria-controls="responsive-navbar-nav" />
                <Navbar.Collapse id="responsive-navbar-nav">
                    <Nav className="mr-auto">
                        <Nav.Link data-testid="testID1" href="/">Home</Nav.Link>
                        <Nav.Link href="/Book">Booking a flight</Nav.Link>


                    </Nav>


                    <Nav>
                        <Registermodal />
                        <Loginmodal />
                    </Nav>
                    </Navbar.Collapse>
                    </Container>
            </Navbar>
    
        <div className='navFeature'></div>
    </div>
  );
}

export default navbar;
