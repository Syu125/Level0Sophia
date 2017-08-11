int x1=100;
int x2=400;
int x3=400;

int y1=100;
int y2=400;
int y3=400;

void setup(){
  size(500,500);
}
void draw(){
  background(255,255,255);
    x1=x1+1;
    x2=x2-1;
  noFill();
for(int i=200; i>26; i-=10){
  stroke(x1,x2,x3);
ellipse(x1,250,i,i);
ellipse(x2,250,i,i);
}
if(x1>=400 && x2<=100){
x3=x1;
x1=x2;
x2=x3;
}

    y1=y1+1;
    y2=y2-1;
noFill();
for(int m=200; m>26; m-=10){
  stroke(y1,y2,y3);
ellipse(250,y1,m,m);
ellipse(250,y2,m,m);
}
if(y1>=400 && y2<=100){
y3=y1;
y1=y2;
y2=y3;

}
}