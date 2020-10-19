import React, { useState } from 'react';
import '../App.css';
import 'bootstrap/dist/css/bootstrap.css';
import Modal from 'react-bootstrap/Modal';
import Button from 'react-bootstrap/Button';
import Rotate from 'react-reveal/Rotate';
import Nav from 'react-bootstrap/Nav'

function loginmodal() {

    const [show, setShow] = useState(false);

    const handleClose = () => setShow(false);
    const handleShow = () => setShow(true);


    return (
		<>    <Nav.Link onClick={handleShow}>Login</Nav.Link>
		
		

			<Modal show={show} onHide={handleClose} size="lg">
				
				<Modal.Body id="bookingLog" class="section">

				
						<div class="container contpad">
						
								<div class="row">
								<div class="booking-form-Log">
									  <div class="imageLog"></div>
									<form>
									
										<div className='modalcloseLog' onClick={handleClose}>
											
                                            </div>
											<div class="form-headerLog">
											<h2>Login Here</h2>
											<h5>Its great to see you back</h5>

											</div>
										
												
													<div class="form-group">
														<span class="form-label">Email</span>
														<input class="form-control" type="email" placeholder="Enter your email"/>
							</div>
														<div class="form-group">
															<span class="form-label">Password</span>
															<input class="form-control" type="tel" placeholder="Password"/>
										</div>
								
															<div class="form-btn">
											<button class="submit-btn">Register</button>
											
										
										</div>
										
						</form>
												
							</div>
						</div>
					</div>
											
		
									


                </Modal.Body>
   
            </Modal>
        </>
	);


	function ModalLog() {
		return <h2>Home</h2>;
	}

	function ModalReg() {
		return <h2>Home</h2>;
	}

}

export default loginmodal;
