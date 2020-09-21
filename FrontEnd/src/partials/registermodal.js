import React, { useState } from 'react';
import '../App.css';
import 'bootstrap/dist/css/bootstrap.css';
import Modal from 'react-bootstrap/Modal';
import Button from 'react-bootstrap/Button';
import Rotate from 'react-reveal/Rotate';
import Nav from 'react-bootstrap/Nav'

function registermodal() {

    const [show, setShow] = useState(false);

    const handleClose = () => setShow(false);
    const handleShow = () => setShow(true);


    return (
		<>    <Nav.Link onClick={handleShow}>Sign Up</Nav.Link>
		
		

			<Modal show={show} onHide={handleClose} size="lg">
				
				<Modal.Body id="bookingRegi">
					<div class="container">
						
								<div class="row">
									<div class="booking-form-Regi">
										<div class="imageRegi"></div>
									<form>
									
										<div className='modalcloseRegi' onClick={handleClose}>
											
                                            </div>
											<div class="form-headerRegi">
											<h2>Register Now</h2>
											<h5>You are almost one step closer to your dream holiday</h5>

											</div>
											<div class="row">
												<div class="col-md-6">
													<div class="form-group">
														<span class="form-label">Name</span>
													<input class="form-control" type="text" placeholder="Full Name" required/>
									</div>
													</div>
													<div class="col-md-6">
														<div class="form-group">
															<span class="form-label">Date of Birth</span>
															<input class="form-control" type="date" required/>
									</div>
														</div>
													</div>
												
													<div class="form-group">
														<span class="form-label">Email</span>
														<input class="form-control" type="email" placeholder="Enter your email"/>
							</div>
														<div class="form-group">
															<span class="form-label">Password</span>
															<input class="form-control" type="tel" placeholder="Password"/>
										</div>
										<div class="form-group">
											<span class="form-label">Repeat Password</span>
											<input class="form-control" type="tel" placeholder="Repeat Password" />
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

export default registermodal;
