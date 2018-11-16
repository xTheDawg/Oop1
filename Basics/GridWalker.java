package Basics;
public class GridWalker {

	private int x;
	private int y;
	
  /* Create a new GridWalker in grid (0,0) */
  public GridWalker() {
    this.x = 0;
    this.y = 0;
  }

  /* Create new GridWalker at specified position */
  public GridWalker(int posX, int posY) {
    this.x = posX;
    this.y = posY;
  }

  /*
   * Walk a specified number of steps to the right.
   * 
   * @return the current object @{ code this }
   */
  public GridWalker walkRight(int steps) {
    this.x += steps;
    return this;
  }

  /*
   * Walk a specified number of steps to the left.
   * 
   * @return the current object @{ code this }
   */
  public GridWalker walkLeft(int steps) {
    this.x -= steps;
    return this;
  }

  /*
   * Walk a specified number of steps up.
   * 
   * @return the current object @{ code this }
   */
  public GridWalker walkUp(int steps) {
    this.y += steps;
    return this;
  }

  /*
   * Walk a specified number of steps down.
   * 
   * @return the current object @{ code this }
   */
  public GridWalker walkDown(int steps) {
    this.y -= steps;
    return this;
  }

  @Override
  public String toString() {
    return this.x + "/" + this.y;
  }
}