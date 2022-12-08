import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Client {
    /*
    *Define an interface for creating an object, but let subclasses decide which class to instantiate.
    * */
    @Test
    public void webDialogUseHTMLButton(){
        Dialog dialog=new WebDialog();
        Button button=new HTMLButton();
        assertThat(dialog.render()).isEqualTo(button.onClick()+" "+button.render());
    }
    @Test
    public void windowsDialogUseWindowsButton(){
        Dialog dialog=new WindowsDialog();
        Button button=new WindowsButton();
        assertThat(dialog.render()).isEqualTo(button.onClick()+" "+button.render());
    }
}
