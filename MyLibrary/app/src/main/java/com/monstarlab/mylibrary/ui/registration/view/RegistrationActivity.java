package com.monstarlab.mylibrary.ui.registration.view;

import com.monstarlab.mylibrary.BR;
import com.monstarlab.mylibrary.R;
import com.monstarlab.mylibrary.base.BaseActivity;
import com.monstarlab.mylibrary.databinding.ActivityRegistrationBinding;
import com.monstarlab.mylibrary.ui.registration.viewmodel.RegistrationViewModel;

import javax.inject.Inject;

public class RegistrationActivity extends BaseActivity<ActivityRegistrationBinding,
        RegistrationViewModel> implements RegistrationNavigator {

    @Inject
    RegistrationViewModel registrationViewModel;

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_registration;
    }

    @Override
    public RegistrationViewModel getViewModel() {
        return registrationViewModel;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public void onNavigateToLoginScreen() {

    }

    @Override
    public void onPasswordFieldIsMissing() {

    }

    @Override
    public void onUsernameFieldIsMissing() {

    }

    @Override
    public void register() {

    }

    @Override
    public void showProgressDialog() {

    }

    @Override
    public void dismissProgressDialog() {

    }

    @Override
    public void showErrorMessage(String errorMessage) {

    }

    @Override
    public void onDismiss() {

    }
}
