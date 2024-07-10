
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alekseynesterov
 */
@EnableAutoConfiguration
//@EnableJ
@EntityScan(basePackages = "com.intellekta.tests")
public class TestConfig {
    
}
