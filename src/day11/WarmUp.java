package day11;

public class WarmUp {

    public static void main(String[] args) {

      String lightOn= "Bedroom";
      switch(lightOn) {
          case "Bedroom":
              System.out.println("Turn on light in the Bedroom");
              break;
          case "Living Room":
              System.out.println("Turn on light in the Living Room");
              break;
          case "Kitchen":
              System.out.println("Turn on light in the Kitchen");
              break;
          case "Hallway":
              System.out.println("Turn on light in the Hallway");
              break;
          default:
              System.out.println("YOU HAVE SELECTED UNKNOWN LOCATION!!!");
              break;
      }

        System.out.println("Your light on is " + lightOn);
      }

    }


