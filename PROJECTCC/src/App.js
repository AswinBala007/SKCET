import './App.css';
import {Route,Routes,BrowserRouter} from 'react-router-dom';
import EmpDelete from './components/delete';
import TodoPlanner from './components/get';
import { NavBar } from './components/navbar';
import TodoForm from './components/post';
import TodoItem from './components/update';

function App() {
  return (
    <div className="App">
        <BrowserRouter>
      <Routes>
          <Route path="/" element={<TodoPlanner/>} />
          <Route path="/get" element={<TodoPlanner/>} />
          <Route path="/create" element={<TodoForm />} />
          <Route path="/update" element={<TodoItem />} />
          <Route path="/delete" element={<EmpDelete />} />
      </Routes>
    </BrowserRouter>
    </div>
  );
}

export default App;
 