import styles from './Button.module.css'
//Inline Styling Example
/* new rules:
    no -: use camelCase
    all values in "" / Strings
    seperate w/ , not ;
let styles = {
    backgroundColor: "hsl(200,200,200 0%)",
    color: "white",
    padding: "10px 20px",
    borderRadius: "5px",
    border: "none",
    cursor: "pointer"
};
*/

function Button() {
 return(
  <button className={styles.button}>Click Me</button>
  //<button  style={styles}>Click Me</Button>
 );

}

export default Button