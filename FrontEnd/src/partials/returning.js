import React from 'react';
import '../App.css';
import 'bootstrap/dist/css/bootstrap.css';
import Col from 'react-bootstrap/Col'
import Row from 'react-bootstrap/Row'
import DropdownButton from 'react-bootstrap/DropdownButton'
import Dropdown from 'react-bootstrap/Dropdown'
import InputGroup from 'react-bootstrap/InputGroup'
import FormControl from 'react-bootstrap/FormControl'
import Button from 'react-bootstrap/Button'
import Form from 'react-bootstrap/Form'

function returning() {
  return (
          <>
              <Form.Row>
                  <div class="form-group col-sm-3">
                      <div class="d-flex flex-column">
                          <Form.Group controlId="formGroupEmail">
                              <Form.Label>Departing From</Form.Label>
                              <Form.Control type="text" placeholder="Departure City" />
                          </Form.Group>
                      </div>
                  </div>
                  <div class="form-group col-sm-3">
                      <div class="d-flex flex-column">
                          <Form.Group controlId="formGroupEmail">
                              <Form.Label>Arriving At</Form.Label>
                              <Form.Control type="text" placeholder="Arrival City" />
                          </Form.Group>
                      </div>
                  </div>
                  <div class="form-group col-sm-3">
                      <div class="d-flex flex-column">
                          <Form.Group>
                              <Form.Label>Departure Date</Form.Label>
                              <Form.Control type="date"/>
                          </Form.Group>
                      </div>
                  </div>
              <div class="form-group col-sm-3">
                  <div class="d-flex flex-column">
                      <Form.Group>
                          <Form.Label>Return Date</Form.Label>
                          <Form.Control type="date"/>
                      </Form.Group>
                  </div>
              </div>

              </Form.Row>
          <Form.Row>
              <h6 class="col-sm-4"> </h6>
              <Button variant="info" size="lg" type="submit" as={Col} sm={4}>Search!</Button>
              <h6 class="col-sm-4"> </h6>
          </Form.Row>
          </>
    
  );
}

export default returning;
