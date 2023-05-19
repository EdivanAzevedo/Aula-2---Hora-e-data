package aula2;

public class main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    try {
      Horario h = new Horario(23, 2, 3);
      System.out.println("Horário: " + h.getHora() + "h " + h.getMin() + "m " + h.getSec() + "s");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    try {
      Data d = new Data(29, 2, 2016);
      System.out.println("Data: " + d.getDia() + "/" + d.getMes() + "/" + d.getAno()
      );
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
