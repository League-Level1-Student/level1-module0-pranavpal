
 
 void setup() {
   size(500, 500);
   background(0, 0, 0);
 }
 
 void draw() {
 makeMagical();
   int i = 0;
float x = getWormX(i);
float y = getWormY(i);
   for (i = 0; i <= 300; i++) {
    fill(200, 124, 222);
    ellipse(x, y, 100, 100);
   }
 }
 
 float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    } 
