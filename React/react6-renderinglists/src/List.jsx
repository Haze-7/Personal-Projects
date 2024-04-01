
function List() {

    let fruits = [{ID: 1, name:"apple", calories: 95}, 
                 {ID: 2, name:"orange", calories: 45}, 
                 {ID: 3, name:"banana", calories:  105}, 
                 {ID: 4, name:"coconut", calories: 159}, 
                 {ID: 5, name:"pineapple", calories: 37}];


     let listItems = fruits.map(fruit => <li key={fruit.ID}> 
                                                      {fruit.name}: &nbsp;
                                                     <b>{fruit.calories}</b></li>); //change all names to that of filter array
    return (
        <ol>{listItems}</ol>
    );
}

export default List 

//Original List of fruits:

// let fruits = [{ID: 1, name:"apple", calories: 95}, 
// {ID: 2, name:"orange", calories: 45}, 
// {ID: 3, name:"banana", calories:  105}, 
// {ID: 4, name:"coconut", calories: 159}, 
// {ID: 5, name:"pineapple", calories: 37}];


//SORTING EXAMPLES / PRACTICE

//Convert Array of Strings => Array of List Elements & Render
// let fruits = ["apple", "orange", "banana", "coconut", "pineapple"];

// fruits.sort();

// let listItems = fruits.map(fruit => <li>{fruit}</li>); // pass in call back, function expression, or arrow function

// return (
//     <ol>{listItems}</ol>
// );

    //sort array / objects by their name property in lexi / alphabetical order
    //fruits.sort((a, b) => a.name.localeCompare(b.name));// write custom sorting function
    //reverse order(swap a and b): 
    //fruits.sort((b, a) => b.name.localeCompare(a.name));
    //sort by calories(): Numeric/ ascending Order
     ////sort by calories(): Numeric /descending Order
    //fruits.sort((a,b) => b.calories- a.calories) // swap a and b

//FILTER EXAMPLES / PRACTICE 

    //filter for calories of each fruit, if less than 100, keep
    //let lowCalFruits = fruits.filter(fruit => fruit.calories < 100); // array of low cal fruits

    // ex: w/ low Cal Fruits filter
    // let listItems = lowCalFruits.map(lowCalFruit => <li key={lowCalFruit.ID}>
    //                                         {lowCalFruit.name}: &nbsp;
    //                                         <b>{lowCalFruit.calories}</b></li>); // pass in call back, function expression, or arrow function
    //Ex for high calorie filter output
    //filter for calories of each fruit, greater than / = 100/
    //let highCalFruits = fruits.filter(fruit=> fruit.calories >= 100); //array of high calorie fruits

    // let listItems = highCalFruits.map(highCalFruit => <li key={highCalFruit.ID}> 
    //                                                {highCalFruit.name}: &nbsp;
    //                                                <b>{highCalFruit.calories}</b></li>); //change all names to that of filter array
