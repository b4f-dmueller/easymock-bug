package org.example;

public class Service {

    private final Component component;

    public Service(Component component) {
        this.component = component;
    }

    public String getPublicValueFromComponent() {
        return component.getPublicValue();
    }

    public String getPackagePrivateValueFromComponent() {
        return component.getPackagePrivateValue();
    }
}