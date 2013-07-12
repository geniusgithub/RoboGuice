package roboguice.inject;


import android.app.Application;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class SystemServiceProvider<T> implements com.google.inject.Provider<T> {

    @Inject protected Application application;

    protected String serviceName;

    public SystemServiceProvider(String serviceName) {
        this.serviceName = serviceName;
    }

    @SuppressWarnings("unchecked")
    public T get() {
        return (T) application.getSystemService(serviceName);
    }

}
