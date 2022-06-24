package framework.enuns;

public enum Browser {

    CHROME("chrome");

    private String browserType;

    Browser(String browserType) {
        this.browserType = browserType;
    }

    public String getValue() {
        return browserType;
    }

}
