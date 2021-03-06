package toothpick.smoothie.provider;

import android.app.Application;
import android.content.pm.PackageManager;
import javax.inject.Inject;
import javax.inject.Provider;

public class PackageManagerProvider implements Provider<PackageManager> {
  Application application;

  @Inject
  public PackageManagerProvider(Application application) {
    this.application = application;
  }

  @Override
  public PackageManager get() {
    return application.getPackageManager();
  }
}
