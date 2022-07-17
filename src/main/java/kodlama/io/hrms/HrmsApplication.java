package kodlama.io.hrms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class HrmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrmsApplication.class, args);
	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("kodlama.io.hrms"))
				.build();
	}

}
// şimdi geldi dur seyi deneyim eployerdaki gelicek mi
//email ve password görünmemesi normal mi normal sanırım benimkinde de öyleydi diye hatırlıyorum
//nereye düştü data id 2 oldu muhtemelen ama bu db browser böyle olmaması lazımdı ya direkt tüm veriler
// görüntülenemiyor
//postgrede de yok
//ok sorun yok sadece buradan gorunmuyor problem olurmu dc'den bir ss atacağım