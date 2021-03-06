package io.magentys.cinnamon.webdriver.actions.basic;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.openqa.selenium.WebElement;

import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class TypeTextActionTest {

    @Mock
    private WebElement mockElement;

    @Before
    public void setUpMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldInvokeSendKeys() {
        TypeTextAction action = new TypeTextAction();
        action.perform(mockElement);
        verify(mockElement, times(1)).sendKeys();
    }
}