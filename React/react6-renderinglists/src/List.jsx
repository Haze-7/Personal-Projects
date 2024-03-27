
function List() {

    let fruits = ["apple", "orange", "banana", "coconut", "pineapple"];

    fruits.sort();

    let listItems = fruits.map(fruit => <li>{fruit}</li>); // pass in call back, function expression, or arrow function
   
    return (
        <ol>{listItems}</ol>
    );
}

export default List 

//Convert Array of Strings => List Elements & Render
// let fruits = ["apple", "orange", "banana", "coconut", "pineapple"];

// fruits.sort();

// let listItems = fruits.map(fruit => <li>{fruit}</li>); // pass in call back, function expression, or arrow function

// return (
//     <ol>{listItems}</ol>
// );