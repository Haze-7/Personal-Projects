import propTypes from 'prop-types'

function UserGreeting(props) {

    let welcomeMessage = <h2 className="welcome-message">
                            Welcome {props.username}
                        </h2>;

    let loginPrompt = <h2 className="login-prompt">
                        Please log in to Continue
                     </h2> ;



//use chenery operator(?)
    return(props.isLoggedIn ? welcomeMessage : loginPrompt);

}

UserGreeting.propTypes = {
    isLoggedIn: propTypes.bool,
    username: propTypes.string,
}

UserGreeting.defaultProps = {
    isLoggedIn: false,
    username: "Guest",
}

export default UserGreeting


//way to check for condition example
// if(props.isLoggedIn) //object/ check if true
// {
//     return <h2>Welcome {props.username}</h2>
// }
// else
// {
//     return <h2>Please log in to continue</h2>
// }
