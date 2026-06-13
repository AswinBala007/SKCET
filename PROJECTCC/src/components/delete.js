import React, { useState } from 'react';
import axios from 'axios';
import NavBar from './navbar';
import Navbar from './navb';
// import './EmpDelete.css';

const EmpDelete = () => {
  const [deadline, setDeadline] = useState('');
   

  const handleDelete = () => {
    axios.delete(`http://localhost:8080/delete?deadline=${deadline}`)
      .then(response => {
        alert('Task deleted successfully!');
        setDeadline('');
         
      })
      .catch(error => {
        alert('Failed to delete');
        console.error(error);
      });
  };

  return (
    <div>
      <Navbar/>
    <div>
      <h1>Delete</h1>
      <form>
        <div>
          <label htmlFor="id">ID:</label>
          <input
            type="number"
            id="id"
            value={deadline}
            onChange={event => setDeadline(event.target.value)}
            />
        </div>
         
        <button type="button" onClick={handleDelete}>Delete</button>
      </form>
    </div>
            </div>
  );
};

export default EmpDelete;