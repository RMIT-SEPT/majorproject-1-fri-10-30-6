import React from 'react';
import '../App.css';
import Navbar from 'react-bootstrap/Navbar'
import Nav from 'react-bootstrap/Nav'
import 'bootstrap/dist/css/bootstrap.css';

function home() {
  return (
      <Navbar collapseOnSelect expand="lg" bg="dark" variant="dark">
          <Navbar.Brand href="/">HomePage</Navbar.Brand>
          <Navbar.Toggle aria-controls="responsive-navbar-nav" />
          <Navbar.Collapse id="responsive-navbar-nav">
        
              <Nav>
                  <Nav.Link href="/page1">Page1</Nav.Link>
                  <Nav.Link href="/chart">Page2</Nav.Link>
              </Nav>
          </Navbar.Collapse>
      </Navbar>
    
  );
}

export default home;
