public class Refrigerator {
    private boolean hasWorkToDo;
    public void orderFood(){
        if(hasWorkToDo)
            System.out.println("Food is being prepared");
    }
}
