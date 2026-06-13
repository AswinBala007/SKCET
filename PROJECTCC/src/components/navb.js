import React from 'react';
// import './Navbar.css';
import {Outlet,Link} from "react-router-dom";


function Navbar() {
  return (
    <div>
      <nav>
      <div className="logo">TASKS</div>
      <div className="nav">
        <Link className="p1" to="/get"><li>GET</li></Link>
        <Link className="p1"to="/create"><li>POST</li></Link>
        <Link className="p1" to="/update"><li>PUT</li></Link>
        <Link className="p1" to="/delete"><li>DELETE</li></Link>  
      </div>
      </nav>
<Outlet/>
    </div>
  );
}

export default Navbar;