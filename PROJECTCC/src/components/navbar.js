import { Link } from "react-router-dom";
export default function NavBar()
{
return(
<div className='navi'>
        <link href="https://fonts.googleapis.com/css2?family=Raleway:wght@400;700;900&display=swap" rel="stylesheet" />
        <header className="box-shadow">
          <div className="section logo">
            <span className="white"></span><span className="green"></span>
          </div>
          <div className="section">
            <ul>
              <li><Link to="/get">GET</Link></li>
              <li><Link to="/post">POST</Link></li>
              <li><Link to="/update">UPDATE</Link></li>
              <li><Link to="/delete">DELETE</Link></li>
            </ul>
          </div>
        </header>
      </div>
);
}