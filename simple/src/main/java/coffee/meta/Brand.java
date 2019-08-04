package coffee.meta;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import dagger.Module;
import dagger.Provides;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.File;

@Module
public class Brand {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Provides
    public Brand create(){
        return Brand.create("brand.yml");
    }

    public static Brand create (String file) {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        try {
            Brand brand = mapper.readValue(new File(file), Brand.class);
            System.out.println(ReflectionToStringBuilder.toString(brand,ToStringStyle.MULTI_LINE_STYLE));
            return brand;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public static void main (String [] args){
//        System.out.println(Brand.create("brand.yml"));
    }
}