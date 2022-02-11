package SimplePackage;

class AccountBallance {

  public static void main(String[] args) {
    Ballance[] current = new Ballance[3];

    current[0] = new Ballance("k.j.Fielding", 123.23);
    current[1] = new Ballance("Will Tell", 157.02);
    current[2] = new Ballance("Tom Jackson", -12.33);

    for (int i = 0; i < 3; i++) {
      current[i].show();
    }
  }

}
