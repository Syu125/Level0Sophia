
 int x=65;
 int y=40;
 int acceleration=10;
void setup(){
  size(150,100);
  PImage catPic = loadImage("unnamed.jpg");
    catPic.resize(150, 100);  // to match your size
background(catPic);
}

void draw(){
  fill(12,247,22);
  ellipse(x,y,10,10);
  ellipse(x+20,y,10,10);
}
void keyPressed(){
  noStroke();
  x++;
  y++;
 if(y==100){
   PImage catPic = loadImage("unnamed.jpg");
    catPic.resize(150, 100);  // to match your size
background(catPic);
x=65;
y=40;
 }
}