export default function Modal(props) {
  return (
    <div className="modal-backdrop">
        <div className="model">
            {props.children}
            <button onClick={props.handleClose}>Close</button>
        </div>
    </div>
  )
}
