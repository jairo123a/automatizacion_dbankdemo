package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebDBankRegistrarUsuario {
    public static final Target title=Target.the("ingreso title").located(By.id("title"));
    public static final Target select=Target.the("ingreso title").located(By.xpath("//option[contains(text(),'Mr.')]"));
    public static final Target firtname=Target.the("ingreso nombre").located(By.id("firstName"));
    public static final Target lastname=Target.the("ingreso apellido").located(By.id("lastName"));
    public static final Target genderm=Target.the("ingreso hombre").located(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[5]/label[2]/input[1]"));
    public static final Target genderfe=Target.the("ingreso mujer").located(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[5]/label[1]/input[1]"));
    public static final Target fecha=Target.the("ingreso fecha").located(By.id("dob"));
    public static final Target social=Target.the("ingreso social").located(By.id("ssn"));
    public static final Target email=Target.the("ingreso email").located(By.id("emailAddress"));
    public static final Target password=Target.the("ingreso password").located(By.id("password"));
    public static final Target confirm=Target.the("ingreso confirm").located(By.id("confirmPassword"));
    public static final Target next=Target.the("clicknxet").located(By.xpath("//button[@class='btn btn-primary btn-flat m-b-30 m-t-30']"));
    public static final Target adress=Target.the("ingreso address").located(By.id("address"));
    public static final Target locali=Target.the("ingreso locali").located(By.id("locality"));
    public static final Target region=Target.the("ingreso region").located(By.id("region"));
    public static final Target postal=Target.the("ingreso region").located(By.id("postalCode"));
    public static final Target country=Target.the("ingreso region").located(By.id("country"));
    public static final Target homefone=Target.the("ingreso region").located(By.id("homePhone"));
    public static final Target celular=Target.the("ingreso region").located(By.id("mobilePhone"));
    public static final Target trabajo=Target.the("ingreso region").located(By.id("workPhone"));
    public static final Target check=Target.the("ingreso region").located(By.id("agree-terms"));
    public static final Target registrar=Target.the("ingreso region").located(By.xpath("//button[@class='btn btn-primary btn-flat m-b-30 m-t-30']"));
    public static final Target respues=Target.the("ingreso region").located(By.xpath("//span[contains(text(),'Registration Successful. Please Login.')]"));





}
