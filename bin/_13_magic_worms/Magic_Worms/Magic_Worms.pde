int xp = 5;
int yp = 5;

void setup(){
  size(500, 500);
  background(255, 0, 0);

}



void draw(){
  int randomNumber = (int) random(width);
  int arandomNumber = (int) random(height);
  for(int i=0; i<300; i++ ){
  ellipse(xp, yp, 10, 10);
  xp = xp+randomNumber;
  yp = yp+2;
}
  
  
}
