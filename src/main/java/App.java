import java.util.HashMap;
import java.util.ArrayList;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {}

  public static Boolean queenCanAttack(ArrayList<Integer> queenLocation, ArrayList<Integer> targetLocation) {
    if(queenLocation.get(0) == targetLocation.get(0)) {
      return true;
    } else if (queenLocation.get(1) == targetLocation.get(1)) {
      return true;
    }
    Integer slope = (targetLocation.get(1) - queenLocation.get(1)) / (targetLocation.get(0) - queenLocation.get(0));
    if (slope == 1 || slope == -1) {
      return true;
    }
    return false;
  }
}
