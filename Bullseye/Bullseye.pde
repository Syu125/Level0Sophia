void setup(){
  size(500,500);
}
void draw(){
  for(int i=500;i>10;i-=59){
    if(i%2==0){
    fill(0,255,232);
    }
    else{
    fill(0,172,255);
    }
    ellipse(250,250,i,i);
  }
}