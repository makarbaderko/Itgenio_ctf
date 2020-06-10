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
            <Link to="/"><img id="logo"src="logo2.png" alt="Logo"></img></Link>
        </div>
    </Router>
    
);

export default Header;