import java.util.HashMap;
import java.util.ArrayList;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {}

  public static Boolean queenCanAttack(ArrayList queenLocation, ArrayList targetLocation) {
    if(queenLocation.get(0) == targetLocation.get(0)) {
      return true;
    }
    return false;
  }
}
