import './NewEventForm.css'
import {useState} from 'react';


export default function NewEventForm({events, setEvents,showModal}) {

  const handleChange = (e) => {
    // console.log(e.target.value);
    setTitle(e.target.value);
  }

  const resetForm = () => {
    setTitle('')
    setDate('')
    setLocation('manchester')
  }

  const handleSubmit = (e) => {
    e.preventDefault();

    const event = {
      title : title,
      date : date,
      location: location,
      id: Math.floor(Math.random() * 1000)
    }
    setEvents([...events, event])
    resetForm()
    showModal(false)
  }

  const [title,setTitle] = useState('')
  const [date, setDate] = useState('')
  const [location,setLocation] = useState('manchester')

  return (
    <form className="new-event-form" onSubmit={handleSubmit}>
        <label>
            <span>Event Title:</span>
            <input type="text" onChange={handleChange} value={title} />
        </label>
        <label>
            <span>Event Date:</span>
            <input type="date" onChange={(e) => {setDate(e.target.value)}} value={date}/>
        </label>
        <label>
            <span>Event Location:</span>
            <select 
                onChange={(e) => {
                  setLocation(e.target.value)
                }}>
                  <option value="manchester">Manchester</option>
                  <option value="london">London</option>
                  <option value="cardiff">Cardiff</option>
            </select>
        </label>
        <button>Submit</button>
    </form>
  )
}
