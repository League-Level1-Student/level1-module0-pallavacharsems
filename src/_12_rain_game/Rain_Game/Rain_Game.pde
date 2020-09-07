int yp = 15;
int xp = 350;
int score = 0;


void setup() {
  size(700,700);
}

void draw(){
int randomNumber = (int) random(width);
  background(255, 0, 0);
  fill(#0006FF);
stroke(#FF00FB);
ellipse(xp, yp, 10, 15);
   yp = yp+9;
if (yp  >= 700) {
 checkCatch(xp);
  yp = 15;
xp = randomNumber;
}
fill(#FFF300);
rect(mouseX, 650, 50, 50);
 fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
}
void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--; 
     
}
