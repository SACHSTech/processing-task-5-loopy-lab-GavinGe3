import processing.core.PApplet;

/*
* Description: A program that draws patterns of squares in 8 different sections
* Author: G. Ge
*/
public class Sketch extends PApplet {
	
	
  
  public void settings() {
    size(1200, 600);
  }

  public void setup() {
    background(45, 150, 207);
  }

  public void draw() {

    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();
  }
  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    // Draw 30 by 30 squares
    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 3 + intRow * 300 / 30;  
        intY = 300 + 3 + intColumn * 300 / 30; 
        
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */

  public void draw_section2(){
    int intX = 0;
    int intY = 0;

    // Draw alternating black and white columns of squares
    for(int intColumn = 0; intColumn < 30; intColumn++) {
      for(int intRow = 0; intRow < 30; intRow++) {
        intX = 300 + 3 + intRow * 300 / 30;  
        intY = 300 + 3 + intColumn * 300 / 30;
        
        // if even column draw black squares if odd column draw white squares
        if (intRow % 2 == 0){
          fill(255, 255, 255);
          rect(intX, intY, 5, 5);
        }
        else {
          fill(0, 0, 0);
          rect(intX, intY, 5, 5);
        }
      }
    }
  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */

  public void draw_section3(){
    int intX = 0;
    int intY = 0;
    
    // Draw alternating black and white rows of squares
    for(int intColumn = 0; intColumn < 30; intColumn++) {
      for(int intRow = 0; intRow < 30; intRow++) {
        intX = 600 + 3 + intRow * 300 / 30;  
        intY = 300 + 3 + intColumn * 300 / 30;
        
        // if even rows draw white squares if odd rows draw white squares
        if (intColumn % 2 == 0){
          fill(0, 0, 0);
          rect(intX, intY, 5, 5);
        }
        else {
          fill(255, 255, 255);
          rect(intX, intY, 5, 5);
        }
      }
    }
  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){
    // Decare X and Y coordinate variables for squares
    int intX = 0;
    int intY = 0;
    
    for(int intColumn = 1; intColumn < 31; intColumn++) {
      for(int intRow = 0; intRow < 30; intRow++) {
        intX = 900 + 3 + intRow * 300 / 30;  
        intY = 300 + 3 + (intColumn-1) * 300 / 30;
        
        // Draw white squares if they are on even rows and odd columns 
        if (intColumn % 2 == 0 && intRow % 2 == 0){
          fill(255, 255, 255);
          rect(intX, intY, 5, 5);
        }
        // draw black squares everywhere else
        else {
          fill(0, 0, 0);
          rect(intX, intY, 5, 5);
        }
      }
    }
  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){
    // Initiate x, y and counter variables
    int intX = 0;
    int intY = 0;
    int counter = 29;

    // Start drawing at top right of section 
    for(int intColumn = 0; intColumn < 31; intColumn++) {
      for(int intRow = 30; intRow > counter; intRow--) {
        intX = 3 + intRow * 300 / 30;  
        intY = 3 + intColumn * 300 / 30; 
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    // Draw one less square for each row
    counter--;
    }
  }
  public void draw_section6(){

    // Initiate x, y and counter variables
    int intX = 0;
    int intY = 0;
    int counter = 30;

    // Start drawing at bottom left of section
    for(int intColumn = 30; intColumn > 0; intColumn--) {
      for(int intRow = 0; intRow < counter; intRow++) {
        intX = 300 + 3 + intRow * 300 / 30;  
        intY = 3 + intColumn * 300 / 30 - 10; 
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    // Draw one less square for each row
    counter--;
    }
  }

  public void draw_section7() {
    // Initiate x, y and counter variables
    int intX = 0;
    int intY = 0;
    int counter = 30;

    // start drawing at top left of section towards the right
    for(int intRow = 0; intRow < 30; intRow++) {
      for(int intColumn = 0; intColumn < counter; intColumn++) {
        intX = 600 + 3 + intRow * 300 / 30;  
        intY = 3 + intColumn * 300 / 30; 
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
        }
      // Draw one less square for each column
      counter--;
      }
    }

  public void draw_section8() {
    // Initiate x, y and counter variables
    int intXSectEight = 0;
    int intYSectEight = 0;
    int counterEight = 30;

    // Start drawing at top right of screen towards the left
    for(int intRowSectEight = 30; intRowSectEight > 0; intRowSectEight--) {
      for (int intColumnSectEight = 0; intColumnSectEight < counterEight; intColumnSectEight++) {
        intXSectEight = 900 + 3 + intRowSectEight * 300 / 30 - 10;  
        intYSectEight = 3 + intColumnSectEight * 300 / 30 ; 
        fill(255);
        noStroke();
        rect(intXSectEight, intYSectEight, 5, 5);
      }
      // Draw one less square for each column
      counterEight--;
    }
  }
}

  


  







