Feature: Realizar  un registro de manera de manera exitosa en el aplicativo
   como usuario
  quiero ingresar al sitio web http://dbankdemo.com/signup y diligenciar un formulario
  para realizar un registro.

   Background:
   Given ingresar al sitio web

  @caso1
  Scenario: Ingresar al sitio web y diligenciar los datos para verificar un registro exitoso de un usuario
    When  diligenciar los datos y  registrar un usuario
    |titulo    |firstname    |lastname    |gender    |dateofbirth|social        |correo       |password |confirmar|address|locality|region  |postal|country |telefono|celular  |telefonotrabajo|
    | MR.      |jairo        |henao       |m         |12/30/1987 |123-45-6541   |jh@gmail.com |Pjairo123|Pjairo123 |123   |medellin|andina  |12345 |colombia|392-5436| 392-5436| 392-5436 |
    Then  Verificar el registro exitoso de un usuario "Registration Successful. Please Login."
  @caso2
  Scenario: Ingresar al sitio web y diligenciar los datos para verificar un registro exitoso de una informacion financiera
    When  diligenciar los datos y  registrar una informacion financiera
    Then  Verificar el registro exitoso de una informacion financiera