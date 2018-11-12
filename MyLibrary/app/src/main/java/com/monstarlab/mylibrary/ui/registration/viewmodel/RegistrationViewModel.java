package com.monstarlab.mylibrary.ui.registration.viewmodel;

import com.monstarlab.mylibrary.base.BaseViewModel;
import com.monstarlab.mylibrary.ui.registration.view.RegistrationNavigator;
import com.monstarlab.mylibrary.utils.rx.scheduler.RxScheduler;

public class RegistrationViewModel extends BaseViewModel<RegistrationNavigator> {

    public RegistrationViewModel(RxScheduler rxScheduler) {
        super(rxScheduler);
    }

    public void onRegisterAccount() {
        if (getNavigator().getUsername().isEmpty()) {
            getNavigator().onUsernameFieldIsMissing();
        } else if (getNavigator().getPassword().isEmpty()) {
            getNavigator().onPasswordFieldIsMissing();
        } else {

        }
    }
}
