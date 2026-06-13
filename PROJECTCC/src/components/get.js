import React, { useState, useEffect } from "react";
import axios from "axios";
import NavBar from "./navbar";
import Navbar from "./navb";
import './get.css';

function TodoPlanner() {
  const [todos, setTodos] = useState([]);

  useEffect(() => {
    axios
      .get("http://localhost:8080/get")
      .then((response) => {
        setTodos(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  }, []);

  return (
    <div>
      <Navbar/>
    <div>
      <h1>Todo Planner</h1>
      <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>title</th>
                        <th>description</th>
                    </tr>
                </thead>
                <tbody>
                    {todos.map(todo => (
                      <tr key={todo.deadline}>
                            <td>{todo.deadline}</td>
                            <td>{todo.task_name}</td>
                            <td>{todo.description}</td>
                        </tr>
                    ))}
                </tbody>
            </table>
    </div>
   </div>
  );
}

export default TodoPlanner;
