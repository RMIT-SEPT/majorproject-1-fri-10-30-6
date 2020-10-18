import React from "react";
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
import Navbar from './partials/navbar.js';
import Footer from './partials/footer.js';


export default function App() {
    return (
        <Router>
            <div>
           
                       <Navbar/>
                <Switch>
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

function Home() {
    return <HomeImport />;
}

function Book() {
    return <h2 data-testid="testID2">booking page</h2>;
}



