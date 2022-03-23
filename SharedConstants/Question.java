package SharedConstants;

import java.util.Random;

class Question implements SharedConstants {

  Random rand = new Random();

  int ask() {
    int prob = (int) (100 * rand.nextDouble());

    if (prob < 30) {
      return NO; //30 %
    } else if (prob < 60) {
      return YES; //30 %
    } else if (prob < 75) {
      return MAYBE; //15 %
    } else if (prob < 85) {
      return LATER; //10 %
    } else if (prob < 98) {
      return SOON; //13 %
    } else {
      return NEVER; //2 %
    }
  }

}
