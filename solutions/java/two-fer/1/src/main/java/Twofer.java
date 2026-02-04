public class Twofer {
    public String twofer(String name) {
        //if the String is empty show you
        if(name == null || name.isEmpty()){
            return "One for you, one for me.";
        }
        else{
            return "One for " + name + "," + " one for me.";
        }
    }
}
