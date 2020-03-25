int y = 250;
int x = 100;
int y2 = 250;
int x2 = 400;
int speed1 = 1;
int speed2 = -1;
void setup() {
  size(500, 500);
  noFill();
}


void draw() {
  background(#CCCEBB);




  for (int i = 8; i > 0; i-- ) {
    ellipse(x, y, i*20, i*20);
  }
  x+=speed1; 



  for (int i = 8; i > 0; i-- ) {
    ellipse(x2, y, i*20, i*20);
  }
  x2+=speed2;

  if (x >= 500) {
    speed1 = -speed1;
  }
  if (x2 >= 500) {
    speed2 = -speed2;
  }
if (x <= 0) {
    speed1 = -speed1;
  }
  if (x2 <= 0) {
    speed2 = -speed2;
  }
}
