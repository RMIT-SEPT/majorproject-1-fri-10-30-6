import React from 'react';
import '../App.css';
import 'bootstrap/dist/css/bootstrap.css';
import sitelogo from '../images/sitelogo.png';
import Nav from 'react-bootstrap/Nav'
import Col from 'react-bootstrap/Col'
import Row from 'react-bootstrap/Row'
import Container from 'react-bootstrap/Container'


function footer() {
    return (
        <>
            <div className='footerFeature'></div>
     <footer className="footercss">
                <Container>
                    <Row className="justify-content-md-center">
                        <Nav.Link href="/">Home</Nav.Link>
                        <Nav.Link href="/Book">Flight Booking</Nav.Link>
                        <Nav.Link href="/Book">My Account**</Nav.Link>
                        <Nav.Link href="/Book">Destinations**</Nav.Link>
                        <Nav.Link href="/Book">Support**</Nav.Link>
                    </Row>
                    <Row className="justify-content-md-center">
                        <Nav.Link href="/Book">Privacy**</Nav.Link>
                        <Nav.Link href="/Book">Terms of Service**</Nav.Link>
                
                    </Row>
                    </Container>
                <img
                    alt=""
                    src={sitelogo}
                    width="180"
                    height="60"
                        />
                   
  
</footer>
    </>
  );
}

export default footer;
