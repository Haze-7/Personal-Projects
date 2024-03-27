//in order for the component/ function to accept props, it must have a props parameter
//child component
import PropTypes from 'prop-types'

function Student(props) {

    return(
        <div className="student">
            <p>Name: {props.name}</p>
            <p>Age: {props.age }</p>
            <p>Student: {props.isStudent ? "Yes" : "No"}</p>
        </div>

    );
}
//checks for value type and returns error if not right
//won't stop prog from running, but will leave error in console for debugging
Student.propTypes = {
    name: PropTypes.string,
    age: PropTypes.number,
    isStudent: PropTypes.bool // just bool for boolean
};

Student.defaultProps = {
    name: "Guest",
    age: 0,
    isStudent: false
};

export default Student