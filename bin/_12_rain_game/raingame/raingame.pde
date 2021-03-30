
int Y = 0;
int score = 0;
int randomNumber;
void setup() {
size(500, 500); 
 randomNumber = (int) random(width);
}


void draw() {
  background(51, 158, 255);
  fill(0, 0, 255);
  stroke(0, 0, 255);
  ellipse(randomNumber, Y, 5, 10);
  Y+=10;
  
  fill(200, 170, 200);
  rect(mouseX, height-60, 50, 60);
    
  if (Y == height-60) {
    checkCatch(randomNumber);
  }
  if(Y == height) {
    Y=0;
    randomNumber = (int) random(width);
  }
    fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
}
void checkCatch(int x){
         if (x > mouseX && x < mouseX+50)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
}
    
