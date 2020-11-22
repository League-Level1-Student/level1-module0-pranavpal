
int Y = 0;
int score = 0;
int randomNumber = (int) random(width);
void setup() {
size(500, 500); 
background(51, 158, 255);

}

void draw() {
  fill(0, 0, 255);
  stroke(0, 0, 255);
  ellipse(randomNumber, Y, 5, 10);
  Y+=1;
  
  fill(200, 170, 200);
  rect(mouseX, mouseY, 50, 60);
    
    fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
}
void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
