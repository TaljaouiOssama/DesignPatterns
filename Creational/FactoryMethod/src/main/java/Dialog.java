abstract public class Dialog {

    public String render(){
        Button button=this.creatButton();
        return button.onClick() +" "+button.render();
    }
    abstract public Button creatButton();
}
