public class Test {
  public static void main(String[] args) {

    /*0*/ test("2512:C", "DEFGH");
    /*1*/ test("1:A", "CDEFGH");
    /*2*/ test(":C", "ABDEFGH");
    /*3*/ test("2345:B", "AGH");
    /*4*/ test("1256:E", "ABCDH");
    /*5*/ test("1228:A", "ADEFG");
    /*6*/ test("5623:B", "AEFGH");
    /*7*/ test("8157:C", "ABDEFGH");
    /*8*/ test("74767:E", "ABCFGH");
    /*9*/ test("88717:D", "ABCEFGH");
    /*10*/ test("148647:A", "ACDEFH");
    /*11*/ test("374258:H", "BCDEFH");
    /*12*/ test("6647768:F", "ABCDEH");
    /*13*/ test("4786317:E", "ABFGH");
    /*14*/ test("3456781:C", "");
    /*15*/ test("225721686547123:C", "CEF");
    /*16*/ test("2765356148824666:F", "ABCDEH");
    /*17*/ test("42318287535641783:F", "BDE");
    /*18*/ test("584423584751745261:D", "FGH");
    /*19*/ test("8811873415472513884:D", "CFG");
    /*20*/ test("74817442725737422451:H", "BCDEF");
    /*21*/ test("223188865746766511566:C", "ABGH");
    /*22*/ test("2763666483242552567747:F", "ABCG");
    /*23*/ test("76724442325377753577138:E", "EG");
    /*24*/ test("327328486656448784712618:B", "");
    /*25*/ test("4884637666662548114774288:D", "DGH");
    /*26*/ test("84226765313786654637511248:H", "DEF");
    /*27*/ test("486142154163288126476238756:A", "CDF");
    /*28*/ test("1836275732415226326155464567:F", "BCD");
    /*29*/ test("62544434452376661746517374245:G", "G");
    /*30*/ test("381352782758218463842725673473:B", "A");
  }

  private static void test(String input, String expected) {
    String actual = new Main().solve(input);
    if (actual.equals(expected)) {
      System.out.println("Correct Answer.");
    } else {
      System.out.println("Wrong Answer(input: " + input + ", expected: " + expected + ", but was: " + actual + ").");
    }
  }
}
