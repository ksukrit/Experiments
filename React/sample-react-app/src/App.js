import logo from './logo.svg';
import './App.css';
import {useState} from 'react';
import Title from './components/Title';
import Modal from './components/Modal';

function App() {
  const [showModal, setShowModal] = useState(true)
  const [showEvents, setShowEvents] = useState(true)
  const [events, setEvents] = useState([
    {title: "mario birthday bash",id:1},
    {title: "bowser's live stream",id:2},
    {title: "race on moo moo farm",id:3}
  ]) 

  console.log(showModal)

  const changeName = () => {
    console.log(document.getElementById("data").value)
    setEvents([...events,{title:document.getElementById("data").value,id:events.length + 1}]);
  }

  const removeLog = (id) => {
    setEvents((prevEvents) => {
      return prevEvents.filter((e) => {
        return e.id !== id;
      })
    })
    console.log('Removing ' + id);
  }

  const handleClose = () => {
    setShowModal(false)
  }


  return (
    <div className="App">
      {/* <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React and Firebase
        </a>
      </header> */}
      <Title title="Tasks to do" subtitle="Pending tasks" />
      {showEvents && (<div>
        <button onClick={ () => {setShowEvents(false)}}>Hide events</button>
      </div>)}
      {!showEvents && (<div>
        <button onClick={ () => {setShowEvents(true)}}>Show events</button>
      </div>)}
      <div>
        <input id="data" />
        <button onClick={changeName}>Add item</button>
      </div>

      {showEvents && events?.map( (event) => (
          <div key={event.id}>
            <div>
              <h2>{event.title}</h2>
              <button onClick={ () => removeLog(event.id)}>Remove</button>
            </div>
          </div>
          )
        )
      }
    {showModal && <Modal handleClose={handleClose}>
        <h2>10% OFF Coupon code</h2>
        <p> Use the code 10OFF at checkout</p>
    </Modal>} 
    </div>
    
  );
}

export default App;
