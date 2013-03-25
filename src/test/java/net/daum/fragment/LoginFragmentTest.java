package net.daum.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.EditText;
import com.xtremelabs.robolectric.RobolectricTestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;

@RunWith(RobolectricTestRunner.class)
public class LoginFragmentTest {
    private LoginFragment fragment;

    @Before
    public void setup() {
        fragment = new LoginFragment();
        startFragment(fragment);
        assertThat(fragment, notNullValue());
        assertThat(fragment.getActivity(), notNullValue());
    }

    private void startFragment(Fragment fragment) {
        FragmentManager fragmentManager = new FragmentActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(fragment, null);
        fragmentTransaction.commit();
    }

    @Test
    public void login() {
        EditText idEditText = (EditText) fragment.getView().findViewById(R.id.main_id);
        assertThat(idEditText, notNullValue());
        assertThat(idEditText.getHint().toString(), is("Your ID:"));
    }
}
