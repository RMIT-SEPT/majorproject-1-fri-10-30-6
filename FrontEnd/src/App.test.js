import React from 'react';
import { render, fireEvent } from '@testing-library/react';
import App from './App';
import { radioValue } from './App';




test('check radio value', () => {
    const value = parseInt(radioValue)
    expect(value).toBe(1);
});

test('Check Booking Link', () => {
    const { getByText } = render(<App />);
    const linkElement = getByText(/Booking a flight/i);
    expect(linkElement).toBeInTheDocument();
}); 

test('Check Booking Link Click', () => {
    const { getByText } = render(<App />);
    const { getByTestId } = render(<App />);
    fireEvent.click(getByText(/Booking a flight/i))
    const linkElement = getByTestId('testID2');
    expect(linkElement).toMatch('Booking Page');
 
}); 

test('Check Home Link', () => {
    const { getByTestId } = render(<App />);
    const linkElement = getByTestId('testID1');
    expect(linkElement).toBeInTheDocument();
}); 

test('Check Home Link Click', () => {
    const { getByTestId } = render(<App />);
    const clickElement = getByTestId('testID1');
    clickElement.simulate("click");
    const linkElement = getByTestId('testID3');
    expect(linkElement).toMatch('Flight Search');

}); 

test('Check Input Displayed Text ', () => {
    const { getByDisplayValue } = render(<App />);
    const linkElement = getByDisplayValue('Leaving From');
    expect(linkElement).toBeInTheDocument();
});  