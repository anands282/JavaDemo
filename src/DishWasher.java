public class DishWasher {
    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    private boolean hasWorkToDo;
    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Dishes are being cleaned");
            hasWorkToDo = false;
        }
    }
}
