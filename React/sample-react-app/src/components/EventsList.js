import styles from './EventsList.module.css'

export default function EventsList({events, removeLog }) {
  return (
    <div>
    {
      events?.map( (event, id) => (
        <div className={styles.card} key={event.id}>
          <div>
            <h2>{id} - {event.title}</h2>
            <p>{event.location} - {event.date}</p>
            <button onClick={ () => removeLog(event.id)}>Remove</button>
          </div>
        </div>
        )
      )
    }
    </div>
  )
}