// 1. Find a really hard Where’s Waldo puzzle, save it, and drop it onto this sketch.

import ddf.minim.*;
Minim minim = new Minim(this);   
AudioSample doh = minim.loadSample("homer-doh.wav");
AudioSample woohoo = minim.loadSample("homer-woohoo.wav");
void setup() {
  size(1500,1000);
  PImage waldo = loadImage("waldo11.jpg"); // 2. Change this to match your file name.
  waldo.resize(1500,1000);
  //size(waldo.width, waldo.height);
  image(waldo, 0, 0);
}


  // 3. Use this print statement to find out the coordinates of Waldo
  // println("X: " + mouseX + " Y: " + mouseY); 
 

  // 4. If the mouse is on Waldo, print “Waldo found!”
void mouseClicked(){
if( mouseX<=1090 && mouseX>=1105)
if(mouseY<=340 && mouseY>=150){
println("Waldo found!");
playWoohoo();
}
}
  // 5. If Waldo is found, also use the method below to play “Woohoo”

  // 6. If the mouse is pressed and they’re not on Waldo, play “Doh”


void draw() {
   println("X: "+mouseX + " Y: " +mouseY);
}
void playWoohoo() {
  woohoo.stop();
  woohoo.trigger();
}

void playDoh() {
  doh.stop();
  doh.trigger();
}