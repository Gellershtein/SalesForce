package elements;

public class BaseElement {
    public static String BaseInputElementLocator = "//*[contains(@class,'modal-body')]//span[text()='%s']" +
            "/ancestor::div[contains(@class, 'uiInput')]";

}
