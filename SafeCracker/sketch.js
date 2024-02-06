let keys;
let key;
let color;

function setup() {
  createCanvas(500, 500);

  color = color('white');

  keys = [
    'a', 'b', 'c', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
    'n','o','p','q','r','s','t','u','v','w','x','y','z'
  ];

  key = random(keys);
  
  
}

function draw() {
  background(220);

  fill(color);
  square(25, 25, 50);

}

function keyTyped() {
  if (key == a) 
  {
    color = 255;
  }
  else if (key == b)
  {
    color = 255;
  }
}

 class Proximity {



 }

 class Combination {
   //Combinations will have 4 keys w/ 3 chances to pick the first 2 keys, and 3 to pick the last key

   keyTyped() {
    if (key == 'a') {

    }


   }

 }