package domain.tea;

import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = { DripTeaModule.class })
public interface Teavana {
    TeaMaker maker();
}
