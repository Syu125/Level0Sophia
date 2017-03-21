int x = 400;
int y = 600;

void setup() {
  size(800, 800);
}

void draw() {
   background(0, 0, 40);
  y=y-1;
  fill(random(255), 0, 0);
  ellipse(x, y + 130, 90, 90);
  fill(248, 128, 0);
  ellipse(x, y + 115, 70, 70);
  fill(255, 153, 0);
  ellipse(x, y + 95, 35, 35);
  fill(100, 100, 100);
  triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
  fill(255,255,255);
 ellipse(200,100,100,100);
  fill(255,255,255);
  ellipse(700,200,10,10);
   fill(255,255,255);
  ellipse(600,250,10,10);
   fill(255,255,255);
  ellipse(700,350,10,10);
   fill(255,255,255);
  ellipse(500,200,10,10);
   fill(255,255,255);
  ellipse(470,280,10,10);
   fill(255,255,255);
  ellipse(100,200,10,10);
   fill(255,255,255);
  ellipse(250,300,10,10);
  
}