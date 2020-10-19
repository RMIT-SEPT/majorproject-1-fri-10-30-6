import axios from "axios";

export const createPerson = (person) => async dispatch => {
    const res = await axios.post("http://localhost:8080/api/account", person);
    
};