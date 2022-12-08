public class HTMLButton implements  Button{
    @Override
    public String onClick() {
        return "HTMLButton::onClick";
    }

    @Override
    public String render() {
        return "HTMLButton::render";
    }
}
