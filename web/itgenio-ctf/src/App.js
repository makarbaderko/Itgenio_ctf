import React from 'react';
import './App.css';
import Header from './components/header/header.component';
import Home_Page from './pages/home/home.component';
function App() {
  return (
    <div className="App">
      <Header></Header>
      <Home_Page></Home_Page>
    </div>
  );
}

export default App;
