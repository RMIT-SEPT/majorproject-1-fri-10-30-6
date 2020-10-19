import React, { Component } from 'react';
import {
    BrowserRouter as Router,
    Switch,
    Route,
    Link,
    useRouteMatch,
    useParams
} from "react-router-dom";
import './App.css';
import BookImport from './pages/book.js';
import HomeImport from './pages/home.js';
import ListImport from './pages/list.js';
import WorkersImport from './pages/workers.js';
import ServicesImport from './pages/services.js';
import TimeslotsImport from './pages/timeslots.js';
import Navbar from './partials/navbar.js';
import Footer from './partials/footer.js';




class App extends Component {
    render() {
        return (
            <Router>
                <div>

                    <Navbar />
                    <Switch>
                        <Route path="/Timeslots">
                            <Timeslots />
                        </Route>
                        <Route path="/Services">
                            <Services />
                        </Route>
                        <Route path="/Workers">
                            <Workers />
                        </Route>
                        <Route path="/List">
                            <List />
                        </Route>
                        <Route path="/Book">
                            <Book />
                        </Route>
                        <Route path="/">
                            <Home />
                        </Route>
                    </Switch>
                    <Footer />
                </div>
            </Router>
        );
    }
}
function Home() {
    return <HomeImport />;
}

function Book() {
    return <BookImport/>
}

function List() {
    return <ListImport />
}

function Workers() {
    return <WorkersImport />
}

function Services() {
    return <ServicesImport />
}

function Timeslots() {
    return <TimeslotsImport />
}

export default App;
