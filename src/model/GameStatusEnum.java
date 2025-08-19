package model;

public enum GameStatusEnum {

  NON_STARTED("não iniciado"),
  INCOMPLETE("incompleto"),
  COMPLETE("completo");

  private String label;

  public String getLabel() {
    return label;
  }

  private GameStatusEnum(String label) {
    this.label = label;
  }

}
