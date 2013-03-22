package net.daum.fragment;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {
    private LoginFragment fragment;

    @Before
    public void setup() {
        fragment = new LoginFragment();
        assertThat(fragment, notNullValue());
    }

    @Test
    public void nothing() {
    }
}
