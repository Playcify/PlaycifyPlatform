import React from 'react';
import { Route, Routes } from 'react-router-dom';
import './App.css';
import Sidebar from './layout/Sidebar';
import Home from './page/Home';

function App() {
  return (
    <>
      <Sidebar />
      <Routes>
        <Route path='/' element={<Home />} />
      </Routes>
    </>
  );
}

export default App;
