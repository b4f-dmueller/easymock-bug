package org.example;

import static org.easymock.EasyMock.expect;

import java.util.Objects;

import org.easymock.EasyMockSupport;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ComponentTest extends EasyMockSupport {

    private Component component;
    private Service service;

    @BeforeEach
    void setUp() {
        component = mock(Component.class);
        service = new Service(component);
    }

    @Test
    void test_that_public_mock_is_working() {
        expect(component.getPublicValue()).andReturn("public");

        replayAll();
        var result = service.getPublicValueFromComponent();
        verifyAll();

        assert Objects.equals(result, "public");
    }

    @Test
    void test_that_package_private_mock_is_working() {
        expect(component.getPackagePrivateValue()).andReturn("package-private");

        replayAll();
        var result = service.getPackagePrivateValueFromComponent();
        verifyAll();

        assert Objects.equals(result, "package-private");
    }
}