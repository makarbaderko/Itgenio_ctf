import React from "react";
import "./App.css";
import Header from "./components/header/header.component";
import Home_Page from "./pages/home/home.component";
import { BrowserRouter } from "react-router-dom";
function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Header></Header>
        <Home_Page></Home_Page>
      </BrowserRouter>
    </div>
  );
}

export default App;
