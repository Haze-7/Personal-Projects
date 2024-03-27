import ProfilePic from './assets/profile-pic.jpg'

function Card() {
  return(
    <div className="card">
      <img className ="card-image" src={ProfilePic} alt="Profile Picture"></img>
      <h2 className ="card-title">Hayes Chiasson</h2>
      <p className="card-text">I study Software Engineering at Louisiana State University</p>
    </div>
  );
}

export default Card