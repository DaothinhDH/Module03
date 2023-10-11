package BAITAP.baitap5;

public  class Shape {
  private String color = "green";
  private boolean filed = true;


  public Shape(){
  }
    public Shape(String color, boolean filed) {
        this.color = color;
        this.filed = filed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiled() {
        return filed;
    }

    public void setFiled(boolean filed) {
        this.filed = filed;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filed=" + filed +
                '}';
    }
}
