package com.monstarlab.mylibrary.ui.registration.view;

import com.monstarlab.mylibrary.base.BaseNavigator;

public interface RegistrationNavigator extends BaseNavigator  {

    String getPassword();

    String getUsername();

    void onNavigateToLoginScreen();

    void onPasswordFieldIsMissing();

    void onUsernameFieldIsMissing();

    void register();
}
