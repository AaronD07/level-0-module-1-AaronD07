import ddf.minim.*;     
Minim minim;   
AudioPlayer sound;  
void setup () {
  minim = new Minim(this);     
sound = minim.loadFile("shiny-objects.wav");      
 size(800, 800);
fill(#ADAA8D);
ellipse(400, 400, 500, 500);
fill(#FF2903);
ellipse(400, 400, 450, 450);
fill(#F4F568);
ellipse(400, 400, 400, 400);
}
void draw () {
PImage pepperoni = loadImage("pizza.jpg");
image(pepperoni, 250, 275);
pepperoni.resize(50, 50);
 if(mousePressed) {  
image(pepperoni, mouseX, mouseY);
sound.play();
sound.rewind();
   
 }
  
  
}