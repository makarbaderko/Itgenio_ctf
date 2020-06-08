import React from 'react';
import './header.styles.css'
import {
    BrowserRouter as Router,
    Switch,
    Route,
    Link
  } from "react-router-dom";  
const Header = () => (
    <Router>
        <div className="Header">
            <Link to="/"><img id="logo"src="https://static.tildacdn.com/tild3062-3136-4266-b732-336262616631/logo2.png" alt="Logo"></img></Link>
        </div>
    </Router>
    
);

export default Header;