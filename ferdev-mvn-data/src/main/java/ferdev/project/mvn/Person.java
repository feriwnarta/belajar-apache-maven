package ferdev.project.mvn;


import com.google.gson.Gson;

public class Person {
    private String name;
    private int umur;

    public Person(String name, int umur) {
        this.name = name;
        this.umur = umur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void aksesGson(){
        Gson gson = new Gson();
    }
}
