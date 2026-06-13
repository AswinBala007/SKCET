import React, { useState } from "react";
import axios from "axios";
import Navbar from "./navb";

function TodoForm() {
  const [task_name, setTitle] = useState("");
  const [description, setDescription] = useState("");
  const [deadline, setDeadline] = useState("");

  const handleSubmit = (event) => {
    event.preventDefault();
    const newTodo = {
      task_name: task_name,
      description: description,
      deadline: deadline,
    };
    axios
      .post("http://localhost:8080/post", newTodo)
      .then((response) => {
        console.log(response.data);
      })
    .catch((error) => {
        console.log(error);
      });
  };

  return (
    <div>
    <Navbar/>
    <form onSubmit={handleSubmit}>
      <div>
        <label htmlFor="deadline">Deadline:</label>
        <input
          type="number"
          id="deadline"
          value={deadline}
          onChange={(event) => setDeadline(event.target.value)}
          />
      </div>
      <div>
        <label htmlFor="title">Title:</label>
        <input
          type="text"
          id="title"
          value={task_name}
          onChange={(event) => setTitle(event.target.value)}
          />
      </div>
      <div>
        <label htmlFor="description">Description:</label>
        <textarea
          id="description"
          value={description}
          onChange={(event) => setDescription(event.target.value)}
          />
      </div>
      <button type="submit">Add Todo</button>
    </form>
    </div>
  );
}

export default TodoForm;
