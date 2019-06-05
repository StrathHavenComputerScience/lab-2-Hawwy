public class Lab2
{
  public static void cleanSquare()
  {
    Robot.load("square.txt");
    Robot.setDelay(0.1);
    
    lightRow();
    lightRow();
    lightRow();
    lightRow();
  }
  //precondition: There are some sqares that are darck in color. 
  //postcondition: A; the squares are now in light color. 
  public static void moveLight()
  { 
      Robot.move();
      Robot.makeLight();
  }
  //precondition: The square in front of the robot is dark.
  //postcondition: The robot moves to that square and makes it light.
  public static void lightRow()
  {
      moveLight();
      moveLight();
      moveLight();
      moveLight();
      moveLight();
      Robot.move();
      Robot.turnLeft();
  }
  //precondition: One row of the square is dark. 
  //postcondition: the row of the square is 
  public static void darkenComb()
  {
    Robot.load("comb.txt");
    Robot.setDelay(0.05);
    
    darkRow();
    moveUp();
    darkRow();
    moveUp();
    darkRow();
    moveUp();
    darkRow();
    moveUp();
    darkRow();
  }
  //precondition: The comb is completely light. 
  //postcondition: the comb is completely dark. 
  public static void moveDark()
  {
      Robot.move();
      Robot.makeDark();
  }
  //precondition: The block in front of the robot is light. 
  //postcondition: The robot moves onto the block and makes it dark. 
  public static void turnRight()
  {
      Robot.turnLeft();
      Robot.turnLeft();
      Robot.turnLeft();
    }
  //precondition: The robot is facing in front. 
  //postcondition: The robot is now facing right.
  public static void turnAround()
  {
      Robot.turnLeft();
      Robot.turnLeft();
    }
  //precondition: The robot is facing in front. 
  //postcondition: the robot is now facing back. 
  public static void darkRow()
  {
      turnRight();
      moveDark6();
      turnAround();
      Robot.move();
      Robot.move();
      Robot.move();
      Robot.move();
      Robot.move();
      moveDark();
      
  }
  //precondition: One row is completely light. 
  //postcondition: The row is completely dark. 
  public static void moveDark6()
  {
      moveDark();
      moveDark();
      moveDark();
      moveDark();
      moveDark();
      moveDark();
    }
  //precondition: The 6 blocks in front of the robot are light. 
  //postcondition: The robot is at the 6th block and all the blocks are dark now.
  public static void moveUp()
  {
      turnRight();
      moveDark();
      Robot.move();
    }
  //precondition: The robot is on a row of the comb and part of it is dark. 
  //postcondition: The robot moves up one row and the blocks are dark now. 
  public static void makeCheckered()
  {
    Robot.load("blank.txt");
    Robot.setDelay(0.05);
    
    makeRows();
    changeRow();
    makeRows();
    changeRow();
    makeRows();
    changeRow();
    makeRows();
  }
  //precondition: The board is completly light.
  //postcondition: Parts of the baord are dark in a checkered pattern. 
  public static void makeRows()
  {
      makeRow1();
      makeRow2();
    }
  //precondition: Two columns of the board are completely light. 
  //postcondition: The two columns of the board are now a dark and light in a checkered pattern.
  public static void makeRow1()
  {
      Robot.makeDark();
      Robot.move();
      moveDark();
      Robot.move();
      moveDark();
      Robot.move();
      moveDark();
      Robot.move();
      turnRight();
      Robot.move();
    }
  //precondition: One above column is completly light. 
  //postcondition: The column is dark and light in a dark-light pattern. 
  public static void makeRow2()
  {
      turnRight();
      Robot.makeDark();
      Robot.move();
      moveDark();
      Robot.move();
      moveDark();
      Robot.move();
      moveDark();
      Robot.move();
  }
  //precondition: One below column is completly light. 
  //postcondition: The column is dark and light in a light-dark pattern.
  public static void changeRow()
  {
      Robot.turnLeft();
      Robot.move();
      Robot.turnLeft();
  }
  //precondition: The robot is on the left of the column where it wants to be. 
  //postcondition: The robot is now on the column that it needs to be at. 
}
