public class Laptop {
    private String name;
    private int hard;
    private int ram;
    private String os;
    private String color;
    private int id;
    private static int count = 1;

    public Laptop(String name,int hard, int ram, String os, String color) {
        this.name = name;
        this.hard = hard;
        this.ram = ram;
        this.os = os;
        this.color = color;
        this.id = getCount(count);
        count++;
    }

    public static int getCount(int count) {
        return count;
    }
    public String getName() {
        return name;
    }
    public int getHard() {
        return hard;
    }
    public int getRam() {
        return ram;
    }
    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Ноутбук: " +
                "id" + id +
                " Модель: " + name +
                ", жесткий диск: " + hard + " GB " +
                ", оперативная память: " + ram + " GB " +
                ", оперативная система: " + os +
                ", цвет модели: " + color;
    }
}
