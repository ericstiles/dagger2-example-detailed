package domain.transportation;

import dagger.Module;
import dagger.Provides;
import domain.transportation.company.Brand;
import domain.transportation.components.Engine;

import javax.inject.Singleton;

@Module
public class VehiclesModule {
    @Provides
    public Engine provideEngine() {
        return new Engine();
    }

    @Provides
    @Singleton
    public Brand provideBrand() {
        return new Brand("Baeldung");
    }
}
