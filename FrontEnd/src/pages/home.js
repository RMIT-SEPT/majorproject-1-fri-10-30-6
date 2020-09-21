import React, { useState } from 'react';
import '../App.css';
import Col from 'react-bootstrap/Col'
import Row from 'react-bootstrap/Row'
import Container from 'react-bootstrap/Container'
import ToggleButton from 'react-bootstrap/ToggleButton'
import ButtonGroup from 'react-bootstrap/ButtonGroup'
import Oneway from '../partials/oneway.js';
import Returning from '../partials/returning.js';
import Form from 'react-bootstrap/Form'
import 'bootstrap/dist/css/bootstrap.css';


function home() {

    const [radioValue, setRadioValue] = useState('1');


    const radios = [
        { name: 'Oneway', value: '1' },
        { name: 'Returning', value: '2' },
      
    ];

    return (
        <div>
       
            <div className='pagebreak'></div>
            <div className='searchborder'>


                <Form className='searchBox'>
                    <div className='innerBox'>
                        <Container>
                    <Row>
                      
                        <Col sm={8}>
                                <h1 data-testid="testID3">Flight Search</h1>
                        </Col>
                        <Col sm={4}>
                            <ButtonGroup toggle>
                                {radios.map((radio, idx) => (
                                    <ToggleButton
                                        key={idx}
                                        type="radio"
                                        variant="secondary"
                                        name="radio"
                                        value={radio.value}
                                        checked={radioValue === radio.value}
                                        onChange={(e) => setRadioValue(e.currentTarget.value)}
                                    >
                                        {radio.name}
                                    </ToggleButton>
                                ))}
                            </ButtonGroup>
                        </Col>
                       
                    </Row>
                 
                      <Callsearchtype/>
                    </Container>
                   </div>
                </Form>
            </div>
            <div className='recomFlights'>
              
               
                        <h3>Book A Flight</h3>
               
                        <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>
                
                <div className='about-border'>
                </div>
            </div>
           
          
            <div className="container">
                <div className="row">
                   
             
                  
                    <div className="col-md-3 col-sm-6 topmar">
                        <div className="box">
                            <div className="boxtop sydney">

                            </div>
                            <div className="boxbottom">
                                <h4>Sydney,</h4>

                                <h6>Flights From $174</h6>
                            </div>
                        </div>
                    </div>
                    <div className="col-md-3 col-sm-6 topmar">
                        <div className="box">
                            <div className="boxtop hobart">

                            </div>
                            <div className="boxbottom">
                                <h4>Hobart,</h4>

                                <h6>Flights From $93</h6>
                            </div>
                        </div>
                    </div>
                    <div className="col-md-3 col-sm-6 topmar">
                        <div className="box">
                            <div className="boxtop melbourne">

                            </div>
                            <div className="boxbottom">
                                <h4>Melbourne,</h4>

                                <h6>Flights From $143</h6>
                            </div>
                        </div>
                    </div>
                    <div className="col-md-3 col-sm-6 topmar">
                        <div className="box">
                            <div className="boxtop canberra">
                       
                            </div>
                            <div className="boxbottom">
                                <h4>Canberra,</h4>
                    
                                <h6>Flights From $184</h6>
                            </div>
                         </div>
                    </div>


                   
               
                </div>
            </div>
        
            <div className='pagebreaktwo'></div>
            <Container className='faqtext'>
               
                <h2>Frequently Asked Questions</h2>
                <div className='faq-border'></div>
                <h4>Will Covid 19 Affect my Flights?</h4>
                <p>Unfortunately yes, while we are doing our best to improve your travel experience some delay are to be expected.</p>
                <div className='faq-border'></div>
                <h4>Lorem ipsum dolor sit amet,</h4>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt </p>
                <div className='faq-border'></div>
                <h4>Lorem ipsum dolor sit amet,</h4>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt </p>
                <div className='faq-border'></div>
                <h4>Lorem ipsum dolor sit amet,</h4>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt </p>
            <div className='pagebreaktwo'></div>
             </Container>
            </div>
    );

    function Callsearchtype() {
        var parsedInt = parseInt(radioValue)
        switch (parsedInt) {
            case 1:
                return <Oneway />;
                break;
            case 2:
                return <Returning />;
                break;
        
        }
    }
}

export default home;
